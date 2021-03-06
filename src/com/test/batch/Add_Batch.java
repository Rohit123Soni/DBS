/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.batch;

import com.dao.DBManager;
import com.models.BatchModel;
import com.test.Batch_Management;
import com.test.Home;
import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mutaher Affan
 */
public class Add_Batch extends javax.swing.JFrame {

    /**
     * Creates new form Add_Batch
     */
    public Add_Batch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        exit_Label1 = new javax.swing.JLabel();
        minimize_Label1 = new javax.swing.JLabel();
        Back_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Year_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Shift_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Group_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Department_id_input = new javax.swing.JTextField();
        Add_Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(130, 150));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(45, 118, 232));
        jPanel4.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add Batch");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_add_user_group_man_man_50px.png"))); // NOI18N

        exit_Label1.setForeground(new java.awt.Color(255, 255, 255));
        exit_Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_multiply_filled_25px.png"))); // NOI18N
        exit_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit_Label1MousePressed(evt);
            }
        });

        minimize_Label1.setForeground(new java.awt.Color(255, 255, 255));
        minimize_Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"))); // NOI18N
        minimize_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimize_Label1MousePressed(evt);
            }
        });

        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_left_2_filled_50px.png"))); // NOI18N
        Back_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Back_label)
                .addGap(295, 295, 295)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(0, 384, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_Label1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit_Label1)
                            .addComponent(minimize_Label1))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16))
                    .addComponent(Back_label))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("ENTER YEAR :-");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        Year_input.setBorder(null);
        Year_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Year_inputActionPerformed(evt);
            }
        });
        jPanel3.add(Year_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("ENTER SHIFT :-");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        Shift_input.setBorder(null);
        jPanel3.add(Shift_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("  ENTER GROUP :-");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        Group_input.setBorder(null);
        jPanel3.add(Group_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("ENTER DEPARTMENT ID :-");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        Department_id_input.setBorder(null);
        jPanel3.add(Department_id_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 160, -1));

        Add_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_right_2_filled_40px.png"))); // NOI18N
        Add_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_LabelMouseClicked(evt);
            }
        });
        jPanel3.add(Add_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 160, 10));

        jSeparator2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 160, 10));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 160, 10));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 160, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_Label1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label1MousePressed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exit_Label1MousePressed

    private void minimize_Label1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_Label1MousePressed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_Label1MousePressed

    private void Year_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Year_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Year_inputActionPerformed

    private void Back_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_labelMouseClicked
        // TODO add your handling code here:
        Batch_Management batch_Management = new Batch_Management();
        batch_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Back_labelMouseClicked

    private void Add_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_LabelMouseClicked
        // TODO add your handling code here:
        addBatch();
    }//GEN-LAST:event_Add_LabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Batch().setVisible(true);
            }
        });
    }
    
      private void addBatch() {
        BatchModel batchModel = new BatchModel();
        String year = new String(Year_input.getText());
        batchModel.setYear(year);
        String shift = new String(Shift_input.getText());
        batchModel.setShift(shift);
        String group = new String(Group_input.getText());
        batchModel.setGroup(group);
        int department_id = parseInt(Department_id_input.getText());
        batchModel.setDepartment_id(department_id);
        int row = DBManager.addBatch(batchModel);
        
         if (row > 0){
                JOptionPane.showMessageDialog(null, "RECORD ADDED SUCCESSFULLY");
            }
         else{
                JOptionPane.showMessageDialog(null, "RECORD NOT ADDED");
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Label;
    private javax.swing.JLabel Back_label;
    private javax.swing.JTextField Department_id_input;
    private javax.swing.JTextField Group_input;
    private javax.swing.JTextField Shift_input;
    private javax.swing.JTextField Year_input;
    private javax.swing.JLabel exit_Label1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel minimize_Label1;
    // End of variables declaration//GEN-END:variables
}
