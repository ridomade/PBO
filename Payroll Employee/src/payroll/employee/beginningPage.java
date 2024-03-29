/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package payroll.employee;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import com.config.cConfig;
import com.view.cView;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import model.login;

/**
 *
 * @author gerald
 */
public class beginningPage extends javax.swing.JFrame {


    public void currentDate() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        label_date.setText(day + "/" + (month + 1) + "/" + year);

        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        label_time.setText(hour + ":" + (minute) + ":" + second);
    }

    /**
     * Creates new form beginningPage
     */
    public beginningPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        currentDate();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        button_Login = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        label_date = new javax.swing.JMenu();
        label_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(76, 111, 191));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter your Email and Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        button_Login.setBackground(new java.awt.Color(123, 150, 212));
        button_Login.setText("Login");
        button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LoginActionPerformed(evt);
            }
        });

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
                                                .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
                                                .addGap(115, 115, 115))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                .addComponent(txt_Email).addComponent(jLabel4)
                                                .addComponent(jLabel1)
                                                .addComponent(button_Login,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 278,
                                                        Short.MAX_VALUE)
                                                .addComponent(txt_password)).addGap(57, 57, 57)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3).addGap(93, 93, 93).addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18).addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68).addComponent(button_Login)
                                .addContainerGap(91, Short.MAX_VALUE)));

        label_date.setText("Date");
        jMenuBar1.add(label_date);

        label_time.setText("Time");
        jMenuBar1.add(label_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(0, 515, Short.MAX_VALUE).addComponent(
                                jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                        jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_EmailActionPerformed

    private void button_LoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_LoginActionPerformed
        // TODO add your handling code here:


        
        login l = new login();
        l.setEmail(txt_Email.getText());
        l.setPassword(txt_password.getText());
        
        String position = cConfig.getPositionByEmail(l.getEmail());
        
        
        l.setPosition(position);
        Map<String, String> accountData = cConfig.getAccountData();

        if (accountData.containsKey(l.getEmail()) && accountData.get(l.getEmail()).equals(l.getPassword())) {
            JOptionPane.showMessageDialog(null, "Success");

            if (l.getPosition().equals("developer")) {
                mainMenu j = new mainMenu();
                j.setVisible(true);
                this.dispose();
            } else if (l.getPosition().equals("Manager")) {
                employeeMainMenu a = new employeeMainMenu();
                a.setVisible(true);
                a.setEmail(l.getEmail());
                this.dispose();
            } else if (l.getPosition().equals("Worker")) {
                employeeMainMenuW a = new employeeMainMenuW();
                a.setVisible(true);
                a.setEmail(l.getEmail());
                this.dispose();
            }

            System.out.println("Login Berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
        }



    }// GEN-LAST:event_button_LoginActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(beginningPage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beginningPage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beginningPage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beginningPage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new beginningPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu label_date;
    private javax.swing.JMenu label_time;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
