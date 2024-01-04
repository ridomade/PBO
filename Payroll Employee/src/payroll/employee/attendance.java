
package payroll.employee;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Base64;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.config.cConfig;

public class attendance extends javax.swing.JFrame {
        String attId;
        public attendance() {
                initComponents();
                setUpTimeUpdate(); // Call the new method to set up time updates
                Toolkit toolkit = getToolkit();
                Dimension size = toolkit.getScreenSize();
                setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        public void setEmployeeId(String id){
            this.attId = id;
            txt_employeeID.setText(id);
            txt_employeeID.setEditable(false);
            Map<String, String> employeeAccountData = cConfig.getAccountDataById(id);
            String name = employeeAccountData.get("name");
            field_name1.setText(name != null ? name : "");
            field_name1.setEditable(false);
        } 

        private void setUpTimeUpdate() {
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                        @Override
                        public void run() {
                                updateTimeLabel(); // Update the time label every second
                        }
                }, 0, 1000); // The second parameter is the delay before the first run, and the
                             // third is the
                             // period between subsequent runs
        }

        private void updateTimeLabel() {
                // Update the date and time labels with the current time and date format
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDateAndTime = dateFormat.format(new Date());

                // Split the formatted string into date and time components
                String[] parts = currentDateAndTime.split(" ");
                String currentDate = parts[0];
                String currentTime = parts[1];

                // Update the date and time labels
                dateLabel.setText(currentDate);
                timeLabel.setText(currentTime);
        }



        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_present = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateTimeLabel1 = new javax.swing.JLabel();
        dateTimeLabel2 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        txt_employeeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        field_name1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_present.setText("Present");
        button_present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_presentActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        timeLabel.setText("time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Current Date and Time :");

        dateTimeLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        dateTimeLabel1.setText("Time:");

        dateTimeLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        dateTimeLabel2.setText("Date: ");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        dateLabel.setText("Date");

        txt_employeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_employeeIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");
        jLabel3.setToolTipText("");

        jLabel1.setText("Employee ID:");

        field_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_name1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(field_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTimeLabel2)
                                    .addComponent(dateTimeLabel1))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeLabel)
                                    .addComponent(dateLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(button_present, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(dateTimeLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateTimeLabel1)
                            .addComponent(timeLabel))
                        .addGap(73, 73, 73)
                        .addComponent(button_present, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_name1ActionPerformed

        private void button_presentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_presentActionPerformed
                // TODO add your handling code here:
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDateAndTime = dateFormat.format(new Date());

                try {
                        // Parse the formatted date and time string
                        Date parsedDateAndTime = dateFormat.parse(currentDateAndTime);

                        // Format the date and time separately
                        SimpleDateFormat dateOnlyFormat = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat timeOnlyFormat = new SimpleDateFormat("HH:mm:ss");

                        String parsedDate = dateOnlyFormat.format(parsedDateAndTime);
                        String parsedTime = timeOnlyFormat.format(parsedDateAndTime);
                        
                        
                        boolean alreadyAtt = cConfig.storeAttendance(this.attId, parsedDate, parsedTime);


                        if (!alreadyAtt){
                            String message = "You're present!\nDate and Time: " + currentDateAndTime;
                            JOptionPane.showMessageDialog(null, message, "Attendance Status",
                                        JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            String message = "You're already Make an Absence Today!";
                            JOptionPane.showMessageDialog(null, message, "Attendance Status",
                                        JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        
                } catch (ParseException e) {
                        e.printStackTrace();
                }

        }// GEN-LAST:event_button_presentActionPerformed

        private void txt_employeeIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_employeeIDActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt_employeeIDActionPerformed

        private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_firstNameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt_firstNameActionPerformed

        private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_statusActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt_statusActionPerformed

        private void txt_dateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_dateOfBirthActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt_dateOfBirthActionPerformed

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
                        java.util.logging.Logger.getLogger(attendance.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(attendance.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(attendance.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(attendance.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new attendance().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_present;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateTimeLabel1;
    private javax.swing.JLabel dateTimeLabel2;
    private javax.swing.JTextField field_name1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField txt_employeeID;
    // End of variables declaration//GEN-END:variables
}
