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
import model.*;

/**
 *
 * @author gerald
 */
public class registerEmployee extends javax.swing.JFrame {
    Random random = new Random();
    String position;
    // Generate a random 10-digit positive integer
    long lowerBound = 1000000000L; // Smallest 10-digit number
    long upperBound = 9999999999L; // Largest 10-digit number
    long random10DigitNumber =
            lowerBound + Math.abs(random.nextLong()) % (upperBound - lowerBound + 1);

    String employeeId = String.valueOf(random10DigitNumber);

    /**
     * Creates new form registerEmployee
     */
    public registerEmployee() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txt_employeeID.setText(employeeId);
        txt_employeeID.setEditable(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_employeeID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_defaultPassword = new javax.swing.JTextField();
        button_addRecord = new javax.swing.JButton();
        radio_manager = new javax.swing.JRadioButton();
        radio_worker = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Register Employee");

        txt_employeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_employeeIDActionPerformed(evt);
            }
        });

        jLabel9.setText("Email:");

        jLabel10.setText("Default Password:");

        button_addRecord.setText("Add Record");
        button_addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addRecordActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_manager);
        radio_manager.setText("Manager");
        radio_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_managerActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_worker);
        radio_worker.setText("Worker");
        radio_worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_workerActionPerformed(evt);
            }
        });

        jLabel2.setText("Position");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup().addGap(267, 267, 267).addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addComponent(jLabel10).addGap(0, 0,
                                Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txt_defaultPassword,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_employeeID,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(228, 228, 228).addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_email,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 253,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194)
                                        .addGroup(layout
                                                .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radio_manager)
                                                .addComponent(radio_worker))))
                                .addGap(377, 377, Short.MAX_VALUE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_addRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284)));
        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48).addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_employeeID,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26).addComponent(radio_manager)
                                        .addGap(29, 29, 29).addComponent(radio_worker)
                                        .addGap(28, 28, 28).addComponent(jLabel9)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_email,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button_addRecord,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64).addComponent(jLabel10)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_defaultPassword,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                        .addContainerGap(59, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void button_addRecordActionPerformed(java.awt.event.ActionEvent evt) {
        // employeeID, firstName, surname, dateOfBirth, email, defaultPassword,
        // departement, jobTitle, status, dateHired, contact, basicSalary, seledtedPosition,
        // cardHolderName, cardName, cardNumber
        // TAMBAH DATA

        login l = new login();

        // Periksa apakah semua field tidak boleh kosong
        if (txt_employeeID.getText().isEmpty() || txt_email.getText().isEmpty()
                || txt_defaultPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return; // Hentikan eksekusi jika ada field yang kosong
        }
        manajer m = new manajer();
        worker w = new worker();
        l.setEmail(txt_email.getText());
        l.setPassword(txt_defaultPassword.getText());

        if (position.equals("Manager")) {
            m.setEmployeeId(txt_employeeID.getText());
            m.addPayment();
            boolean success = cConfig.addAccountData(l.getEmail(), l.getPassword(),
                    m.getEmployeeId(), position, m.getSalary());
            if (success) {
                JOptionPane.showMessageDialog(this, "Data karyawan berhasil disimpan!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                // Close the current screen
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data karyawan.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (position.equals("Worker")) {
            w.setEmployeeId(txt_employeeID.getText());
            w.addPayment();
            boolean success = cConfig.addAccountData(l.getEmail(), l.getPassword(),
                    w.getEmployeeId(), position, w.getSalary());
            if (success) {
                JOptionPane.showMessageDialog(this, "Data karyawan berhasil disimpan!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                // Close the current screen
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data karyawan.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Set nilai pada objek m dan l



        // Lanjutkan dengan penambahan data hanya jika semua field tidak kosong


        // Lakukan penanganan hasil sesuai kebutuhan

    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and
         * feel. For details see
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
            java.util.logging.Logger.getLogger(registerEmployee.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerEmployee.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerEmployee.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerEmployee.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_addRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radio_manager;
    private javax.swing.JRadioButton radio_worker;
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
