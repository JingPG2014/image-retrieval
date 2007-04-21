/*
 * DrawingPanel.java
 *
 * Created on 21 April 2007, 13:39
 */

package usyd.comp5425.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author  Yuezhong Zhang
 */
public class DrawingPanel extends JPanel implements MouseListener {
    
    public static final int Line = 0;
    public static final int Oval = 1;
    public static final int Rectangle = 2;
    public static final int Round_Rectangle = 4;
    public boolean filled = true;
    private int mode = -1;
    private Point start;
    private Point end;
    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
        this.addMouseListener(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    /**
     * Holds value of property image.
     */
    private BufferedImage image;
    
    /**
     * Getter for property image.
     * @return Value of property image.
     */
    public BufferedImage getImage() {
        return this.image;
    }
    
    /**
     * Setter for property image.
     * @param image New value of property image.
     */
    public void setImage(BufferedImage image) {
        this.image = image;
    }
    
    
    public BufferedImage createNewImage(int width, int height, Color bgColor) {
        image = GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().getDefaultConfiguration().createCompatibleImage(width,height);
        Graphics2D g2d = (Graphics2D)image.getGraphics();
        g2d.setBackground(bgColor);
        g2d.clearRect(0,0,width,height);
        g2d.dispose();
        return image;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(image !=null){
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(image, 0, 0 , image.getWidth(), image.getHeight(), null);
            g2.dispose();
        }
    }
    
    public void setDrawingMode(int mode) {
        this.mode = mode;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public void mouseClicked(MouseEvent mouseEvent) {
    }
    
    public void mousePressed(MouseEvent mouseEvent) {
        start = mouseEvent.getPoint();
    }
    
    public void mouseReleased(MouseEvent mouseEvent) {
        if(image == null)
            return;
        end = mouseEvent.getPoint();
        if(!isValidDraw(start,end))
            return;
        int sx = (int) start.getX();
        int sy = (int) start.getY();
        int ex = (int) end.getX();
        int ey = (int) end.getY();
        if(this.mode == this.Line) {
            Graphics2D g2d = (Graphics2D)image.getGraphics();
            g2d.setColor(imageForeground);
            Line2D.Double  line = new Line2D.Double(start, end);
            g2d.draw(line);
            g2d.dispose();
        }else if(this.mode == this.Oval){
            Graphics2D g2d = (Graphics2D)image.getGraphics();
            g2d.setColor(imageForeground);
            int width  = ex - sx;
            int height = ey - sy;
            if(filled){
                g2d.fillOval(sx,sy,width,height);
            }else{
                g2d.drawOval(sx,sy,width,height);
            }
            g2d.dispose();
        }else if(this.mode == this.Rectangle){
            Graphics2D g2d = (Graphics2D)image.getGraphics();
            g2d.setColor(imageForeground);
            int width  = ex - sx;
            int height = ey - sy;
            if(filled){
                g2d.fillRect(sx,sy,width,height);
            }else {
                g2d.drawRect(sx,sy,width,height);
            }
            g2d.dispose();
        }else if(this.mode == this.Round_Rectangle){
            Graphics2D g2d = (Graphics2D)image.getGraphics();
            g2d.setColor(imageForeground);
            int width  = ex - sx;
            int height = ey - sy;
            if(filled){
                g2d.fillRoundRect(sx,sy,width,height,25,25);
            }else {
                g2d.drawRoundRect(sx,sy,width,height, 25, 25);
            }
            g2d.dispose();
        }
        this.repaint();
    }
    
    public void mouseEntered(MouseEvent mouseEvent) {
    }
    
    public void mouseExited(MouseEvent mouseEvent) {
    }
    public boolean isValidDraw(Point start, Point end){
        if(start.x <= image.getWidth() && start.y <=image.getHeight() &&end.x <=image.getWidth() && end.y <=image.getHeight())
            return true;
        return false;
    }
    /**
     * Holds value of property imageForeground.
     */
    private Color imageForeground = Color.GREEN;
    
    /**
     * Getter for property imageForeground.
     * @return Value of property imageForeground.
     */
    public Color getImageForeground() {
        return this.imageForeground;
    }
    
    /**
     * Setter for property imageForeground.
     * @param imageForeground New value of property imageForeground.
     */
    public void setImageForeground(Color imageForeground) {
        this.imageForeground = imageForeground;
    }
}
