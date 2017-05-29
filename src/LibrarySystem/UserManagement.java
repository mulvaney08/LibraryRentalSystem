package LibrarySystem;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aaronm
 */
public class UserManagement extends javax.swing.JFrame {

    /**
     * Creates new form UserManagement
     */
    public UserManagement() {
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

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonModifyUser = new javax.swing.JButton();
        jLabelAddUser = new javax.swing.JLabel();
        jLabelModUser = new javax.swing.JLabel();
        jButtonAddUser = new javax.swing.JButton();
        jLabelDeleteUser = new javax.swing.JLabel();
        jLabelSelection = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabeldisplayUsername3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemBookManagement = new javax.swing.JMenuItem();
        jMenuItemStats = new javax.swing.JMenuItem();
        jMenuItemAccManagement = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jButtonDeleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\deleteUserIcon.png")); // NOI18N
        jButtonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUserActionPerformed(evt);
            }
        });

        jButtonModifyUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\modifyUserIcon.png")); // NOI18N
        jButtonModifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyUserActionPerformed(evt);
            }
        });

        jLabelAddUser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelAddUser.setForeground(new java.awt.Color(102, 0, 0));
        jLabelAddUser.setText("Add User");

        jLabelModUser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelModUser.setForeground(new java.awt.Color(102, 0, 0));
        jLabelModUser.setText("Modify User");

        jButtonAddUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\addUserIcon.png")); // NOI18N
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jLabelDeleteUser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelDeleteUser.setForeground(new java.awt.Color(102, 0, 0));
        jLabelDeleteUser.setText("Delete User");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(243, 243, 243)
                        .addComponent(jLabelDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(245, 245, 245)
                        .addComponent(jLabelModUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelModUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelSelection.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabelSelection.setForeground(new java.awt.Color(102, 0, 0));
        jLabelSelection.setText("Please select from one of the following options:");

        jLabelLogo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\lib.jpg")); // NOI18N

        jLabeldisplayUsername3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabeldisplayUsername3.setForeground(new java.awt.Color(102, 0, 0));
        jLabeldisplayUsername3.setText("You are Logged in as: " + Login.username);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabeldisplayUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogo2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabeldisplayUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu.setText("Menu");

        jMenuItemHome.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\home.png")); // NOI18N
        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemHome);

        jMenuItemBookManagement.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemBookManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\smallBook.png")); // NOI18N
        jMenuItemBookManagement.setText("Book Management");
        jMenuItemBookManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBookManagementActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemBookManagement);

        jMenuItemStats.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemStats.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\Calc.png")); // NOI18N
        jMenuItemStats.setText("Reports");
        jMenuItemStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStatsActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemStats);

        jMenuItemAccManagement.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemAccManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\user.png")); // NOI18N
        jMenuItemAccManagement.setText("Account Management");
        jMenuItemAccManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccManagementActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAccManagement);

        jMenuItemLogout.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemLogout);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1038, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyUserActionPerformed
        setVisible(false);
        ModifyUser mU = new ModifyUser();
        mU.setVisible(true);
    }//GEN-LAST:event_jButtonModifyUserActionPerformed

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        setVisible(false);
        AddUser s = new AddUser();
        s.setVisible(true);
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
        setVisible(false);
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jMenuItemBookManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBookManagementActionPerformed
        setVisible(false);
        BookManagement bM = new BookManagement();
        bM.setVisible(true);
    }//GEN-LAST:event_jMenuItemBookManagementActionPerformed

    private void jMenuItemStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStatsActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\reports\\Rentals.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
            }
        }
    }//GEN-LAST:event_jMenuItemStatsActionPerformed

    private void jMenuItemAccManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccManagementActionPerformed
        if ("Admin".equals(Login.userType) || "admin".equals(Login.userType)) {
            setVisible(false);
            AdminAccountManagement AaccM = new AdminAccountManagement();
            AaccM.setVisible(true);
        } else {
            setVisible(false);
            AccountManagement accM = new AccountManagement();
            accM.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemAccManagementActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed

        setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed
        setVisible(false);
        DeleteUser d = new DeleteUser();
        d.setVisible(true);
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonModifyUser;
    private javax.swing.JLabel jLabelAddUser;
    private javax.swing.JLabel jLabelDeleteUser;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelModUser;
    private javax.swing.JLabel jLabelSelection;
    private javax.swing.JLabel jLabeldisplayUsername3;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAccManagement;
    private javax.swing.JMenuItem jMenuItemBookManagement;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemStats;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
