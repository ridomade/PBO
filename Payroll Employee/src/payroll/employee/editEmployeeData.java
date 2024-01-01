/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package payroll.employee;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.config.cConfig;
import com.view.cView;
import java.util.Map;
import model.*;

/**
 *
 * @author gerald
 */
public class editEmployeeData extends javax.swing.JFrame {
        String position;
        // Generate a random 10-digit positive integer

        /**
         * Creates new form registerEmployee
         */
        public editEmployeeData() {
                initComponents();
                Toolkit toolkit = getToolkit();
                Dimension size = toolkit.getScreenSize();
                setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                txt_employeeID.setEditable(false);
                txt_email.setEditable(false);
        }
        
        public void getEmployeeId(String empEmail){
            
            
            String employeeId = cConfig.getEmployeeIdByEmail(empEmail);
            Map<String, String> employeeAccountData = cConfig.getAccountDataById(employeeId);
            
            String defaultPassword = employeeAccountData.get("password");
            txt_defaultPassword.setText(defaultPassword != null ? defaultPassword : "");

            // Set nilai pada JTextField field_name
            String name = employeeAccountData.get("name");
            field_name.setText(name != null ? name : "");
            Map<String, String> employeeCardData = cConfig.getCardDataById(employeeId);
            String cardName = employeeCardData.get("card_holder_name");
            field_cardName.setText(cardName != null ? cardName : "");

            // Set nilai pada JTextField field_cardNumber
            String cardNumber = employeeCardData.get("card_number");
            field_cardNumber.setText(cardNumber != null ? cardNumber : "");

            // Set nilai pada JTextField field_holderName
            String holderName = employeeCardData.get("card_holder_name");
            field_holderName.setText(holderName != null ? holderName : "");
            
            txt_employeeID.setText(employeeId);
            txt_email.setText(empEmail);
            
        }

        /**
         * This method is called from within the constructor to initialize the form. WARNING: Do NOT
         * modify this code. The content of this method is always regenerated by the Form Editor.
         */
        public JTextField getTxtEmployeeID() {
                return txt_employeeID;
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_employeeID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_defaultPassword = new javax.swing.JTextField();
        button_updateRecord2 = new javax.swing.JButton();
        field_cardName = new javax.swing.JTextField();
        field_holderName = new javax.swing.JTextField();
        field_cardNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        field_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Edit Emloyee Data");

        txt_employeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_employeeIDActionPerformed(evt);
            }
        });

        jLabel9.setText("Email:");

        jLabel10.setText("Password:");

        button_updateRecord2.setText("Update Data");
        button_updateRecord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateRecord2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Card Name : ");

        jLabel3.setText("Card Holder Name :");

        jLabel4.setText("Card Number :");

        jLabel5.setText("Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(field_cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)
                                .addComponent(button_updateRecord2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(field_holderName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_employeeID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(field_cardName, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel2))
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_defaultPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(field_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_cardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_holderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_defaultPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(field_cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addComponent(button_updateRecord2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_updateRecord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateRecord2ActionPerformed
            // TODO add your handling code here:// Gantilah nilai parameter sesuai dengan data yang ingin Anda update
        String employeeIdToUpdate = txt_employeeID.getText();
        
        card c = new card();
        c.setCardName(field_cardName.getText());
        c.setCardHolderName(field_holderName.getText());
        c.setCardNumber(field_cardNumber.getText());
        String cardNameToUpdate = c.getCardName();
        String holderNameToUpdate = c.getCardHolderName();
        String cardNumberToUpdate = c.getCardNumber();
        String nameToUpdate = field_name.getText();
        String emailToUpdate = txt_email.getText();
        String passwordToUpdate = txt_defaultPassword.getText();

        // Memanggil fungsi updateEmployeeData
        boolean success = cConfig.updateEmployeeData(employeeIdToUpdate, cardNameToUpdate, holderNameToUpdate, cardNumberToUpdate, nameToUpdate, emailToUpdate, passwordToUpdate);

        // Lakukan penanganan hasil sesuai kebutuhan
        if (success) {
            JOptionPane.showMessageDialog(null, "Data karyawan berhasil diupdate!", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Gagal mengupdate data karyawan.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_button_updateRecord2ActionPerformed

        private void radio_managerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radio_managerActionPerformed
                // TODO add your handling code here:
                position = "Manager";

        }// GEN-LAST:event_radio_managerActionPerformed

        private void radio_workerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radio_workerActionPerformed
                // TODO add your handling code here:
                position = "Worker";
        }// GEN-LAST:event_radio_workerActionPerformed



        private void txt_employeeIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_employeeIDActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt_employeeIDActionPerformed


     


        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look
                 * and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(editEmployeeData.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(editEmployeeData.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(editEmployeeData.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(editEmployeeData.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new editEmployeeData().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_updateRecord2;
    private javax.swing.JTextField field_cardName;
    private javax.swing.JTextField field_cardNumber;
    private javax.swing.JTextField field_holderName;
    private javax.swing.JTextField field_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_defaultPassword;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_employeeID;
    // End of variables declaration//GEN-END:variables

        private String gender;
        private ImageIcon format = null;
        String filename = null;
        byte[] person_Image = null;
        InputStream profilePhoto;
}