/*
 * QueryFormPanel.java
 *
 *  Copyright (C) 2007 COMP5425 Multimedia Storage, Retrieval and Delivery
 *  The School of Information Technology
 *  The University of Sydney
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package usyd.comp5425.ui;

import com.sun.jaf.ui.ActionManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import org.jdesktop.swingworker.SwingWorker;

/**
 *
 * @author  Yuezhong Zhang  SID:305275631
 */
public class QueryFormPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form QueryFormPanel
     */
    public QueryFormPanel() {
        initComponents();
        initActions();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        previewLabel = new javax.swing.JLabel();
        queryBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        averageBox = new javax.swing.JCheckBox();
        colorMomentBtn = new javax.swing.JCheckBox();
        coocurenceBox = new javax.swing.JCheckBox();
        localColorBox = new javax.swing.JCheckBox();
        globalColorBox = new javax.swing.JCheckBox();
        geoBox = new javax.swing.JCheckBox();
        luckyBtn = new javax.swing.JButton();
        navigableImagePanel1 = new usyd.comp5425.ui.NavigableImagePanel();

        queryBtn.setText("IMSmart Search");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample Image"));

        browseBtn.setText("Browse");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(browseBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(browseBtn)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Available feature extraction module"));
        averageBox.setText("Average RGB");
        averageBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        averageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureSelected(evt);
            }
        });

        jPanel1.add(averageBox);

        colorMomentBtn.setText("Color Moments");
        colorMomentBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        colorMomentBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        colorMomentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMomentBtnActionPerformed(evt);
            }
        });

        jPanel1.add(colorMomentBtn);

        coocurenceBox.setText("Cooccurence");
        coocurenceBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        coocurenceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coocurenceBoxActionPerformed(evt);
            }
        });

        jPanel1.add(coocurenceBox);

        localColorBox.setText("Local Color Histogram");
        localColorBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        localColorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localColorBoxActionPerformed(evt);
            }
        });

        jPanel1.add(localColorBox);

        globalColorBox.setText("Global Color Histogram");
        globalColorBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        globalColorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                globalColorBoxActionPerformed(evt);
            }
        });

        jPanel1.add(globalColorBox);

        geoBox.setText("Geometric Moment");
        geoBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        geoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geoBoxActionPerformed(evt);
            }
        });

        jPanel1.add(geoBox);

        luckyBtn.setText("I'm Feeling Lucky");

        navigableImagePanel1.setNavigationImageEnabled(false);
        org.jdesktop.layout.GroupLayout navigableImagePanel1Layout = new org.jdesktop.layout.GroupLayout(navigableImagePanel1);
        navigableImagePanel1.setLayout(navigableImagePanel1Layout);
        navigableImagePanel1Layout.setHorizontalGroup(
            navigableImagePanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 373, Short.MAX_VALUE)
        );
        navigableImagePanel1Layout.setVerticalGroup(
            navigableImagePanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 347, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(queryBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(luckyBtn))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 283, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(navigableImagePanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(navigableImagePanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(14, 14, 14)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(queryBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(luckyBtn))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void colorMomentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMomentBtnActionPerformed
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_colorMomentBtnActionPerformed
    
    private void geoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geoBoxActionPerformed
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_geoBoxActionPerformed
    
    private void globalColorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_globalColorBoxActionPerformed
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_globalColorBoxActionPerformed
    
    private void localColorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localColorBoxActionPerformed
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_localColorBoxActionPerformed
    
    private void coocurenceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coocurenceBoxActionPerformed
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_coocurenceBoxActionPerformed
    
    private void featureSelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureSelected
// TODO add your handling code here:
        enableSearchButton();
    }//GEN-LAST:event_featureSelected
    
    private void initActions() {
        ActionManager   manager = ActionManager.getInstance();
        browseBtn.setAction(manager.getAction("browse-command"));
        queryBtn.setAction(manager.getAction("query-command"));
        luckyBtn.setAction(manager.getAction("imlucky-command"));
        manager.setEnabled("query-command",false);
        manager = null;
    }
    public JTextField getSampleFileField(){
        return jTextField1;
    }
    public Vector<String> getSelectedFeatures(){
        v.clear();
        if(averageBox.isSelected())
            v.add("AverageRGB");
        if(colorMomentBtn.isSelected())
            v.add("Color_Moments");
        if(coocurenceBox.isSelected())
            v.add("Cooccurence");
        if(localColorBox.isSelected())
            v.add("Local_Color_Histogram");
        if(globalColorBox.isSelected())
            v.add("Global_Color_Histogram");
        if(geoBox.isSelected())
            v.add("Geometric_Moment");
        
        return  v;
    }
    private File sampleFile;
    
    public File getSampleFile() {
        return sampleFile;
    }
    
    public void setSampleFile(File sampleFile) {
        this.sampleFile = sampleFile;
        jTextField1.setText(sampleFile.getAbsolutePath());
        enableSearchButton();
        browseBtn.setEnabled(false);
        setPreviewImage(sampleFile);
        
    }
    public void enableSearchButton(){
        queryBtn.setEnabled(false);
        if(averageBox.isSelected()&& sampleFile != null)
            queryBtn.setEnabled(true);
        if(colorMomentBtn.isSelected() &&sampleFile !=null)
            queryBtn.setEnabled(true);
        if(coocurenceBox.isSelected() && sampleFile != null)
            queryBtn.setEnabled(true);
        if(localColorBox.isSelected()&& sampleFile != null)
            queryBtn.setEnabled(true);
        if(globalColorBox.isSelected()&& sampleFile != null)
            queryBtn.setEnabled(true);
        if(geoBox.isSelected()&& sampleFile != null)
            queryBtn.setEnabled(true);
        
        
    }
    
    private void setPreviewImage(final File sampleFile) {
        SwingWorker worker = new SwingWorker<BufferedImage,Object>(){
            @Override
            protected BufferedImage doInBackground() throws Exception {
                return ImageIO.read(sampleFile);
            }
            @Override
            public void done(){
                try {
                    navigableImagePanel1.setImage(get());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } catch (ExecutionException ex) {
                    ex.printStackTrace();
                }finally{
                    browseBtn.setEnabled(true);
                }
            }
        };
        worker.execute();
    }
    private Vector<String> v = new Vector<String>(5);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox averageBox;
    private javax.swing.JButton browseBtn;
    private javax.swing.JCheckBox colorMomentBtn;
    private javax.swing.JCheckBox coocurenceBox;
    private javax.swing.JCheckBox geoBox;
    private javax.swing.JCheckBox globalColorBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox localColorBox;
    private javax.swing.JButton luckyBtn;
    private usyd.comp5425.ui.NavigableImagePanel navigableImagePanel1;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JButton queryBtn;
    // End of variables declaration//GEN-END:variables
    
}