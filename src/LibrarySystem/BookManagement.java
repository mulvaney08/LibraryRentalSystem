package LibrarySystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronm
 */
public class BookManagement extends javax.swing.JFrame {

    /**
     * Creates new form BookManagement
     */
    public BookManagement() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabelSelection = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonLendBook = new javax.swing.JButton();
        jButtonReturnBook = new javax.swing.JButton();
        jLabelAddBook = new javax.swing.JLabel();
        jLabelReturnBook = new javax.swing.JLabel();
        jButtonAddBook = new javax.swing.JButton();
        jLabelRentBook = new javax.swing.JLabel();
        jLabeldisplayUsername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemBookManagement = new javax.swing.JMenuItem();
        jMenuItemReports = new javax.swing.JMenuItem();
        jMenuItemAccManagement = new javax.swing.JMenuItem();
        jMenuItemAbout = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabelSelection.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabelSelection.setForeground(new java.awt.Color(102, 0, 0));
        jLabelSelection.setText("Please select from one of the following options:");

        jLabelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\lib.jpg")); // NOI18N

        jButtonLendBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\bookIcon.png")); // NOI18N
        jButtonLendBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLendBookActionPerformed(evt);
            }
        });

        jButtonReturnBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\returnBookIcon.png")); // NOI18N
        jButtonReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnBookActionPerformed(evt);
            }
        });

        jLabelAddBook.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelAddBook.setForeground(new java.awt.Color(102, 0, 0));
        jLabelAddBook.setText("Add Book");

        jLabelReturnBook.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelReturnBook.setForeground(new java.awt.Color(102, 0, 0));
        jLabelReturnBook.setText("Return Book");

        jButtonAddBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\lendBookIcon.png")); // NOI18N
        jButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookActionPerformed(evt);
            }
        });

        jLabelRentBook.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelRentBook.setForeground(new java.awt.Color(102, 0, 0));
        jLabelRentBook.setText("Rent Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonLendBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabelAddBook)
                        .addGap(279, 279, 279)
                        .addComponent(jLabelRentBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelReturnBook)
                        .addGap(113, 113, 113)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLendBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddBook)
                    .addComponent(jLabelReturnBook)
                    .addComponent(jLabelRentBook))
                .addContainerGap())
        );

        jLabeldisplayUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabeldisplayUsername.setForeground(new java.awt.Color(102, 0, 0));
        jLabeldisplayUsername.setText("You are Logged in as: " + Login.username);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabeldisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabeldisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu.setText("Menu");

        jMenuItemBookManagement.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemBookManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\smallBook.png")); // NOI18N
        jMenuItemBookManagement.setText("Book Management");
        jMenuItemBookManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBookManagementActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemBookManagement);

        jMenuItemReports.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemReports.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\Calc.png")); // NOI18N
        jMenuItemReports.setText("Reports");
        jMenuItemReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportsActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemReports);

        jMenuItemAccManagement.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemAccManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\user.png")); // NOI18N
        jMenuItemAccManagement.setText("Account Management");
        jMenuItemAccManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccManagementActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAccManagement);

        jMenuItemAbout.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItemAbout.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\info.png")); // NOI18N
        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAbout);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1029, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnBookActionPerformed
        setVisible(false);
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButtonReturnBookActionPerformed

    private void jButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookActionPerformed
        setVisible(false);
        AddBook addB = new AddBook();
        addB.setVisible(true);

    }//GEN-LAST:event_jButtonAddBookActionPerformed

    private void jButtonLendBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLendBookActionPerformed
        setVisible(false);
        RentBook rb = new RentBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButtonLendBookActionPerformed

    private void jMenuItemBookManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBookManagementActionPerformed
        setVisible(false);
        BookManagement bM = new BookManagement();
        bM.setVisible(true);
    }//GEN-LAST:event_jMenuItemBookManagementActionPerformed

    private void jMenuItemReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemReportsActionPerformed

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

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed

        setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBook;
    private javax.swing.JButton jButtonLendBook;
    private javax.swing.JButton jButtonReturnBook;
    private javax.swing.JLabel jLabelAddBook;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelRentBook;
    private javax.swing.JLabel jLabelReturnBook;
    private javax.swing.JLabel jLabelSelection;
    private javax.swing.JLabel jLabeldisplayUsername;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemAccManagement;
    private javax.swing.JMenuItem jMenuItemBookManagement;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemReports;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
