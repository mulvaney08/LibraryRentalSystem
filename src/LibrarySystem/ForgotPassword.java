package LibrarySystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aaronm
 */
public class ForgotPassword extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    PreparedStatement pStatement;

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        super("Login");
        initComponents();
        this.clearForm();
        connection = dbConnect.connectDb();
    }

    public void search() {
        
        String s = jTextFieldForgotPUser.getText();
        String query = "select * from User where Username = '" + s + "'";
        try {
            pStatement = connection.prepareStatement(query);
            result = pStatement.executeQuery();

            if (result.next()) {
                jTextFieldForgotPFName.setText(result.getString(2));
                jTextFieldForgotPLName.setText(result.getString(3));
                jTextFieldSecQuestion.setText(result.getString(5));
                result.close();
                pStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void getPassword() {
        String user = jTextFieldForgotPUser.getText();
        String answer = jTextFieldSecAnswer.getText();

        String query1 = "select * from User where Answer = '" + answer + "'";
        try {
            pStatement = connection.prepareStatement(query1);
            result = pStatement.executeQuery();
            if (result.next()) {
                jTextFieldForgotPpassword.setText(result.getString(4));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldSecQuestion = new javax.swing.JTextField();
        jLabelForgotPpassword = new javax.swing.JLabel();
        jLabelForgotPFName = new javax.swing.JLabel();
        jLabelForgotPUser = new javax.swing.JLabel();
        jLabelSecAnswer = new javax.swing.JLabel();
        jTextFieldForgotPFName = new javax.swing.JTextField();
        jButtonForgotPSearchUser = new javax.swing.JButton();
        jButtonForgotPExit = new javax.swing.JButton();
        jTextFieldForgotPUser = new javax.swing.JTextField();
        jLabelSecQuestion = new javax.swing.JLabel();
        jButtonForgotPGetPassword = new javax.swing.JButton();
        jTextFieldSecAnswer = new javax.swing.JTextField();
        jTextFieldForgotPpassword = new javax.swing.JTextField();
        jTextFieldForgotPLName = new javax.swing.JTextField();
        jLabelForgotPLName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forgot Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jTextFieldSecQuestion.setEditable(false);
        jTextFieldSecQuestion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldSecQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSecQuestionActionPerformed(evt);
            }
        });

        jLabelForgotPpassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelForgotPpassword.setText("Your Password: ");

        jLabelForgotPFName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelForgotPFName.setText("First Name:");

        jLabelForgotPUser.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelForgotPUser.setText("Username:");

        jLabelSecAnswer.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelSecAnswer.setText("Answer:");

        jTextFieldForgotPFName.setEditable(false);
        jTextFieldForgotPFName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jButtonForgotPSearchUser.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonForgotPSearchUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\search.png")); // NOI18N
        jButtonForgotPSearchUser.setText("Search");
        jButtonForgotPSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPSearchUserActionPerformed(evt);
            }
        });

        jButtonForgotPExit.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonForgotPExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonForgotPExit.setText("Back");
        jButtonForgotPExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPExitActionPerformed(evt);
            }
        });

        jTextFieldForgotPUser.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldForgotPUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForgotPUserActionPerformed(evt);
            }
        });

        jLabelSecQuestion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelSecQuestion.setText("Security Question:");

        jButtonForgotPGetPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonForgotPGetPassword.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\get.png")); // NOI18N
        jButtonForgotPGetPassword.setText("Get Password");
        jButtonForgotPGetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPGetPasswordActionPerformed(evt);
            }
        });

        jTextFieldSecAnswer.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jTextFieldForgotPpassword.setEditable(false);
        jTextFieldForgotPpassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldForgotPpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForgotPpasswordActionPerformed(evt);
            }
        });

        jTextFieldForgotPLName.setEditable(false);
        jTextFieldForgotPLName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabelForgotPLName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelForgotPLName.setText("Last Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSecAnswer)
                    .addComponent(jLabelSecQuestion)
                    .addComponent(jLabelForgotPUser)
                    .addComponent(jLabelForgotPpassword)
                    .addComponent(jLabelForgotPFName)
                    .addComponent(jLabelForgotPLName))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSecAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jTextFieldForgotPpassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSecQuestion)
                            .addComponent(jTextFieldForgotPUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonForgotPGetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonForgotPExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonForgotPSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldForgotPLName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldForgotPFName))
                        .addGap(145, 145, 145)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelForgotPUser)
                    .addComponent(jTextFieldForgotPUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonForgotPSearchUser))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabelSecQuestion)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSecAnswer)
                            .addComponent(jTextFieldSecAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonForgotPGetPassword))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelForgotPFName)
                            .addComponent(jTextFieldForgotPFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldForgotPLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelForgotPLName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSecQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelForgotPpassword)
                    .addComponent(jTextFieldForgotPpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonForgotPExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(501, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldForgotPUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForgotPUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForgotPUserActionPerformed

    private void jTextFieldSecQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSecQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSecQuestionActionPerformed

    private void jTextFieldForgotPpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForgotPpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForgotPpasswordActionPerformed

    private void jButtonForgotPSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPSearchUserActionPerformed

        search();

    }//GEN-LAST:event_jButtonForgotPSearchUserActionPerformed

    private void jButtonForgotPGetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPGetPasswordActionPerformed

        getPassword();

    }//GEN-LAST:event_jButtonForgotPGetPasswordActionPerformed

    private void jButtonForgotPExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPExitActionPerformed

        setVisible(false);
        Login l = new Login();
        l.setVisible(true);

    }//GEN-LAST:event_jButtonForgotPExitActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    private void clearForm() {
        this.jTextFieldForgotPFName.setText("");
        this.jTextFieldForgotPUser.setText("");
        this.jTextFieldForgotPpassword.setText("");
        this.jTextFieldSecAnswer.setText("");
        this.jTextFieldSecQuestion.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForgotPExit;
    private javax.swing.JButton jButtonForgotPGetPassword;
    private javax.swing.JButton jButtonForgotPSearchUser;
    private javax.swing.JLabel jLabelForgotPFName;
    private javax.swing.JLabel jLabelForgotPLName;
    private javax.swing.JLabel jLabelForgotPUser;
    private javax.swing.JLabel jLabelForgotPpassword;
    private javax.swing.JLabel jLabelSecAnswer;
    private javax.swing.JLabel jLabelSecQuestion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldForgotPFName;
    private javax.swing.JTextField jTextFieldForgotPLName;
    private javax.swing.JTextField jTextFieldForgotPUser;
    private javax.swing.JTextField jTextFieldForgotPpassword;
    private javax.swing.JTextField jTextFieldSecAnswer;
    private javax.swing.JTextField jTextFieldSecQuestion;
    // End of variables declaration//GEN-END:variables
}
