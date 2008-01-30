/*
 * EditorPreferencePanel.java
 *
 * Created on January 10, 2007, 6:31 PM
 */

package org.jmeld.ui.settings;

import java.awt.Color;
import javax.swing.JDialog;
import org.jmeld.settings.EditorSettings;
import org.jmeld.ui.util.EmptyIcon;


/**
 *
 * @author  kees
 */
public class EditorSettingsForm extends javax.swing.JPanel
{ 
  /** Creates new form EditorPreferencePanel */
  public EditorSettingsForm ()
  {
    initComponents ();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jLabel3 = new javax.swing.JLabel();
    tabSizeSpinner = new javax.swing.JSpinner();
    showLineNumbersCheckBox = new javax.swing.JCheckBox();
    detailHeader1 = new org.jmeld.ui.swing.DetailHeader();
    detailHeader2 = new org.jmeld.ui.swing.DetailHeader();
    detailHeader3 = new org.jmeld.ui.swing.DetailHeader();
    colorAddedButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    colorDeletedButton = new javax.swing.JButton();
    colorChangedButton = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    restoreOriginalColorsButton = new javax.swing.JButton();
    gradientLabel1 = new org.jmeld.ui.swing.GradientLabel();
    leftsideReadonlyCheckBox = new javax.swing.JCheckBox();
    ignoreWhitespaceCheckBox = new javax.swing.JCheckBox();
    rightsideReadonlyCheckBox = new javax.swing.JCheckBox();
    detailHeader4 = new org.jmeld.ui.swing.DetailHeader();
    ignoreEOLCheckBox = new javax.swing.JCheckBox();
    ignoreBlankLinesCheckBox = new javax.swing.JCheckBox();

    buttonGroup1.add(jRadioButton1);
    jRadioButton1.setText("Use default font");
    jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setText("Use custom font");
    jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));

    jLabel3.setText("Tab size");

    showLineNumbersCheckBox.setText("Show line numbers");
    showLineNumbersCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    showLineNumbersCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

    detailHeader1.setText("Font");

    detailHeader2.setText("Miscellaneous");

    detailHeader3.setText("Colors");

    colorAddedButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    colorAddedButton.setFocusable(false);
    colorAddedButton.setPreferredSize(new java.awt.Dimension(20, 20));

    jLabel1.setText("Lines have been added");

    colorDeletedButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    colorDeletedButton.setFocusable(false);
    colorDeletedButton.setPreferredSize(new java.awt.Dimension(20, 20));

    colorChangedButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    colorChangedButton.setFocusable(false);
    colorChangedButton.setPreferredSize(new java.awt.Dimension(20, 20));

    jLabel2.setText("Lines have been deleted");

    jLabel4.setText("Lines are changed");

    restoreOriginalColorsButton.setText("Restore original colors");

    gradientLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
    gradientLabel1.setText("Editor settings");
    gradientLabel1.setFont(new java.awt.Font("Dialog", 1, 18));

    leftsideReadonlyCheckBox.setText("Leftside readonly");
    leftsideReadonlyCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    leftsideReadonlyCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
    leftsideReadonlyCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        leftsideReadonlyCheckBoxActionPerformed(evt);
      }
    });

    ignoreWhitespaceCheckBox.setText("Ignore whitespace");
    ignoreWhitespaceCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    ignoreWhitespaceCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

    rightsideReadonlyCheckBox.setText("Rightside readonly");
    rightsideReadonlyCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    rightsideReadonlyCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
    rightsideReadonlyCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rightsideReadonlyCheckBoxActionPerformed(evt);
      }
    });

    detailHeader4.setText("Ignore");

    ignoreEOLCheckBox.setText("Ignore EOL (End of line markers)");
    ignoreEOLCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    ignoreEOLCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

    ignoreBlankLinesCheckBox.setText("Ignore blank lines");
    ignoreBlankLinesCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    ignoreBlankLinesCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(gradientLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(detailHeader1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(layout.createSequentialGroup()
            .add(12, 12, 12)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(jRadioButton2)
              .add(jRadioButton1))))
        .addContainerGap(326, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(detailHeader2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(364, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .add(24, 24, 24)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(leftsideReadonlyCheckBox)
          .add(rightsideReadonlyCheckBox)
          .add(showLineNumbersCheckBox)
          .add(layout.createSequentialGroup()
            .add(jLabel3)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(tabSizeSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(313, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(detailHeader3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(layout.createSequentialGroup()
            .add(12, 12, 12)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(colorDeletedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2))
              .add(layout.createSequentialGroup()
                .add(colorAddedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(jLabel1))
              .add(layout.createSequentialGroup()
                .add(colorChangedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4))
              .add(restoreOriginalColorsButton))))
        .addContainerGap(272, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(detailHeader4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(layout.createSequentialGroup()
            .add(12, 12, 12)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(ignoreEOLCheckBox)
              .add(ignoreWhitespaceCheckBox)
              .add(ignoreBlankLinesCheckBox))))
        .addContainerGap(241, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(gradientLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(detailHeader1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(jRadioButton1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jRadioButton2)
        .add(15, 15, 15)
        .add(detailHeader2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel3)
          .add(tabSizeSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(showLineNumbersCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(rightsideReadonlyCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(leftsideReadonlyCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(detailHeader3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(colorAddedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel1))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(colorDeletedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel2))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(colorChangedButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel4))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(restoreOriginalColorsButton)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(detailHeader4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(ignoreWhitespaceCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(ignoreEOLCheckBox)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(ignoreBlankLinesCheckBox)
        .add(48, 48, 48))
    );
  }// </editor-fold>//GEN-END:initComponents

    private void leftsideReadonlyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftsideReadonlyCheckBoxActionPerformed
  // TODO add your handling code here:
}//GEN-LAST:event_leftsideReadonlyCheckBoxActionPerformed

    private void rightsideReadonlyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightsideReadonlyCheckBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_rightsideReadonlyCheckBoxActionPerformed
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.ButtonGroup buttonGroup1;
  protected javax.swing.JButton colorAddedButton;
  protected javax.swing.JButton colorChangedButton;
  protected javax.swing.JButton colorDeletedButton;
  protected org.jmeld.ui.swing.DetailHeader detailHeader1;
  protected org.jmeld.ui.swing.DetailHeader detailHeader2;
  protected org.jmeld.ui.swing.DetailHeader detailHeader3;
  protected org.jmeld.ui.swing.DetailHeader detailHeader4;
  protected org.jmeld.ui.swing.GradientLabel gradientLabel1;
  protected javax.swing.JCheckBox ignoreBlankLinesCheckBox;
  protected javax.swing.JCheckBox ignoreEOLCheckBox;
  protected javax.swing.JCheckBox ignoreWhitespaceCheckBox;
  protected javax.swing.JLabel jLabel1;
  protected javax.swing.JLabel jLabel2;
  protected javax.swing.JLabel jLabel3;
  protected javax.swing.JLabel jLabel4;
  protected javax.swing.JRadioButton jRadioButton1;
  protected javax.swing.JRadioButton jRadioButton2;
  protected javax.swing.JCheckBox leftsideReadonlyCheckBox;
  protected javax.swing.JButton restoreOriginalColorsButton;
  protected javax.swing.JCheckBox rightsideReadonlyCheckBox;
  protected javax.swing.JCheckBox showLineNumbersCheckBox;
  protected javax.swing.JSpinner tabSizeSpinner;
  // End of variables declaration//GEN-END:variables

}
