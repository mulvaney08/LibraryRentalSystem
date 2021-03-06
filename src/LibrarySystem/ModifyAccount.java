/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author aaronm
 */
public class ModifyAccount extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    PreparedStatement pStatement;

    /**
     * Creates new form ModifyAccount
     */
    public ModifyAccount() {
        initComponents();
        this.clearForm();
        connection = dbConnect.connectDb();
    }

    public ModifyAccount(String AccountNum) {
        initComponents();
        this.clearForm();
        connection = dbConnect.connectDb();
        jTextFieldAccountNum.setText(AccountNum);
        search();
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
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAccountNum = new javax.swing.JTextField();
        jLabelAccNum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFName = new javax.swing.JTextField();
        jTextFieldLName = new javax.swing.JTextField();
        jButtonCancelDeleteUser = new javax.swing.JButton();
        jLabelUserType = new javax.swing.JLabel();
        jButtonModifyAccount = new javax.swing.JButton();
        jTextFieldAddLine2 = new javax.swing.JTextField();
        jTextFieldIBAN = new javax.swing.JTextField();
        jButtonSearchBook = new javax.swing.JButton();
        jLabelUserType1 = new javax.swing.JLabel();
        jTextFieldBIC = new javax.swing.JTextField();
        jTextFieldDOB = new javax.swing.JTextField();
        jTextFieldAddLine1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Address Line 2");

        jTextFieldAccountNum.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldAccountNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccountNumActionPerformed(evt);
            }
        });

        jLabelAccNum.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelAccNum.setText("Account Number");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Address Line 1");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("DOB");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Last Name");

        jTextFieldFName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNameActionPerformed(evt);
            }
        });

        jTextFieldLName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jButtonCancelDeleteUser.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonCancelDeleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonCancelDeleteUser.setText("Back");
        jButtonCancelDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelDeleteUserActionPerformed(evt);
            }
        });

        jLabelUserType.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelUserType.setText("IBAN");

        jButtonModifyAccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\tick.png")); // NOI18N
        jButtonModifyAccount.setText("Modify");
        jButtonModifyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyAccountActionPerformed(evt);
            }
        });

        jTextFieldAddLine2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jTextFieldIBAN.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextFieldIBAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIBANActionPerformed(evt);
            }
        });

        jButtonSearchBook.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonSearchBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\search.png")); // NOI18N
        jButtonSearchBook.setText("Search");
        jButtonSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchBookActionPerformed(evt);
            }
        });

        jLabelUserType1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelUserType1.setText("BIC");

        jTextFieldBIC.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jTextFieldAddLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddLine1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\user.png")); // NOI18N
        jButton2.setText("List of Customers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUserType)
                            .addComponent(jLabelUserType1))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabelAccNum)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDOB)
                            .addComponent(jTextFieldFName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jTextFieldLName)
                            .addComponent(jTextFieldAccountNum)
                            .addComponent(jTextFieldAddLine2)
                            .addComponent(jTextFieldAddLine1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModifyAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldAccountNum, jTextFieldAddLine1, jTextFieldAddLine2, jTextFieldBIC, jTextFieldDOB, jTextFieldFName, jTextFieldIBAN, jTextFieldLName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButtonCancelDeleteUser, jButtonModifyAccount, jButtonSearchBook});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccNum)
                    .addComponent(jTextFieldAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAddLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserType)
                    .addComponent(jTextFieldIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserType1)
                    .addComponent(jTextFieldBIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonSearchBook))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelDeleteUser)
                    .addComponent(jButtonModifyAccount))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldAccountNum, jTextFieldAddLine1, jTextFieldAddLine2, jTextFieldBIC, jTextFieldDOB, jTextFieldFName, jTextFieldIBAN, jTextFieldLName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButtonCancelDeleteUser, jButtonModifyAccount, jButtonSearchBook});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(416, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAccountNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccountNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAccountNumActionPerformed

    private void jTextFieldFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNameActionPerformed

    private void jButtonCancelDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelDeleteUserActionPerformed
        setVisible(false);
        AccountManagement accM = new AccountManagement();
        accM.setVisible(true);
    }//GEN-LAST:event_jButtonCancelDeleteUserActionPerformed

    private void jButtonModifyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyAccountActionPerformed

        String update = "UPDATE Account SET FirstName=?, LastName=?, AddLine1=?, AddLine2=? , DOB=?, IBAN=?, BIC=? WHERE  AccountNum = ?";
        try {
            pStatement = connection.prepareStatement(update);

            pStatement.setString(1, jTextFieldFName.getText());
            pStatement.setString(2, jTextFieldLName.getText());
            pStatement.setString(3, jTextFieldAddLine1.getText());
            pStatement.setString(4, jTextFieldAddLine2.getText());
            pStatement.setString(5, jTextFieldDOB.getText());
            pStatement.setString(6, jTextFieldIBAN.getText());
            pStatement.setString(7, jTextFieldBIC.getText());
            pStatement.setString(8, jTextFieldAccountNum.getText());

            pStatement.execute();
            JOptionPane.showMessageDialog(null, "Account Modified");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + ", please try again");

        }

        this.clearForm();
    }//GEN-LAST:event_jButtonModifyAccountActionPerformed

    public void search() {
        String query = "select * from Account Where AccountNum = ?";
        try {
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, jTextFieldAccountNum.getText());
            result = pStatement.executeQuery();
            if (result.next()) {
                String s = result.getString("FirstName");
                jTextFieldFName.setText(s);
                s = result.getString("LastName");
                jTextFieldLName.setText(s);
                s = result.getString("AddLine1");
                jTextFieldAddLine1.setText(s);
                s = result.getString("AddLine2");
                jTextFieldAddLine2.setText(s);
                s = result.getString("DOB");
                jTextFieldDOB.setText(s);
                s = result.getString("IBAN");
                jTextFieldIBAN.setText(s);
                s = result.getString("BIC");
                jTextFieldBIC.setText(s);

                result.close();
                pStatement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Account not found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                result.close();
                pStatement.close();
            } catch (Exception ex) {

            }
        }
    }

    private void jButtonSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchBookActionPerformed
        search();
    }//GEN-LAST:event_jButtonSearchBookActionPerformed

    private void jTextFieldAddLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddLine1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        CustomersSearch cs = new CustomersSearch(this);
        cs.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldIBANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIBANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIBANActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyAccount().setVisible(true);
            }
        });
    }

    private void clearForm() {
        this.jTextFieldAccountNum.setText("");
        this.jTextFieldFName.setText("");
        this.jTextFieldLName.setText("");
        this.jTextFieldAddLine1.setText("");
        this.jTextFieldAddLine2.setText("");
        this.jTextFieldDOB.setText("");
        this.jTextFieldIBAN.setText("");
        this.jTextFieldBIC.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelDeleteUser;
    private javax.swing.JButton jButtonModifyAccount;
    private javax.swing.JButton jButtonSearchBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAccNum;
    private javax.swing.JLabel jLabelUserType;
    private javax.swing.JLabel jLabelUserType1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAccountNum;
    private javax.swing.JTextField jTextFieldAddLine1;
    private javax.swing.JTextField jTextFieldAddLine2;
    private javax.swing.JTextField jTextFieldBIC;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JTextField jTextFieldIBAN;
    private javax.swing.JTextField jTextFieldLName;
    // End of variables declaration//GEN-END:variables
}
