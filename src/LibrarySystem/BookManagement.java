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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabelSelection2 = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonLendBook = new javax.swing.JButton();
        jButtonReturnBook = new javax.swing.JButton();
        jLabelAddBook2 = new javax.swing.JLabel();
        jLabelReturnBook2 = new javax.swing.JLabel();
        jButtonAddBook = new javax.swing.JButton();
        jLabelRentBook4 = new javax.swing.JLabel();
        jButtonDeleteBook = new javax.swing.JButton();
        jButtonListOfBooks = new javax.swing.JButton();
        jButtonModifyBook = new javax.swing.JButton();
        jLabelReturnBook6 = new javax.swing.JLabel();
        jLabelRentBook5 = new javax.swing.JLabel();
        jLabelDeleteBook6 = new javax.swing.JLabel();
        jLabeldisplayUsername1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemReports = new javax.swing.JMenuItem();
        jMenuItemAccManagement = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabelSelection2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabelSelection2.setForeground(new java.awt.Color(102, 0, 0));
        jLabelSelection2.setText("Please select from one of the following options:");

        jLabelLogo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\lib.jpg")); // NOI18N

        jButtonLendBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\rentBookIcon.png")); // NOI18N
        jButtonLendBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLendBookjButtonLendBookActionPerformed(evt);
            }
        });

        jButtonReturnBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\returnBookIcon.png")); // NOI18N
        jButtonReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnBookjButtonReturnBookActionPerformed(evt);
            }
        });

        jLabelAddBook2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelAddBook2.setForeground(new java.awt.Color(102, 0, 0));
        jLabelAddBook2.setText("Add Book");

        jLabelReturnBook2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelReturnBook2.setForeground(new java.awt.Color(102, 0, 0));
        jLabelReturnBook2.setText("Return Book");

        jButtonAddBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\lendBookIcon.png")); // NOI18N
        jButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookjButtonAddBookActionPerformed(evt);
            }
        });

        jLabelRentBook4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelRentBook4.setForeground(new java.awt.Color(102, 0, 0));
        jLabelRentBook4.setText("Rent Book");

        jButtonDeleteBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\bookIcon.png")); // NOI18N
        jButtonDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteBookjButtonDeleteBookActionPerformed(evt);
            }
        });

        jButtonListOfBooks.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\rentBookIcon.png")); // NOI18N
        jButtonListOfBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListOfBooksjButtonLendBook1ActionPerformed(evt);
            }
        });

        jButtonModifyBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\returnBookIcon.png")); // NOI18N
        jButtonModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyBookjButtonModifyBook3jButtonModifyBookActionPerformed(evt);
            }
        });

        jLabelReturnBook6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelReturnBook6.setForeground(new java.awt.Color(102, 0, 0));
        jLabelReturnBook6.setText("Modify Book");

        jLabelRentBook5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelRentBook5.setForeground(new java.awt.Color(102, 0, 0));
        jLabelRentBook5.setText("List Books");

        jLabelDeleteBook6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelDeleteBook6.setForeground(new java.awt.Color(102, 0, 0));
        jLabelDeleteBook6.setText("Delete Book");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddBook)
                .addGap(18, 18, 18)
                .addComponent(jButtonLendBook)
                .addGap(18, 18, 18)
                .addComponent(jButtonReturnBook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelAddBook2)
                .addGap(220, 220, 220)
                .addComponent(jLabelRentBook4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReturnBook2)
                .addGap(104, 104, 104))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButtonModifyBook)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonListOfBooks)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteBook))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabelReturnBook6)
                        .addGap(233, 233, 233)
                        .addComponent(jLabelRentBook5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDeleteBook6)
                        .addGap(90, 90, 90)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddBook)
                    .addComponent(jButtonLendBook)
                    .addComponent(jButtonReturnBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRentBook4)
                    .addComponent(jLabelReturnBook2)
                    .addComponent(jLabelAddBook2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDeleteBook, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListOfBooks, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifyBook, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDeleteBook6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRentBook5)
                            .addComponent(jLabelReturnBook6))))
                .addGap(18, 18, 18))
        );

        jLabeldisplayUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabeldisplayUsername1.setForeground(new java.awt.Color(102, 0, 0));
        jLabeldisplayUsername1.setText("You are Logged in as: " + Login.username);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeldisplayUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSelection2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabeldisplayUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSelection2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelLogo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        jMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu.setText("Menu");

        jMenuItemHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\home.png")); // NOI18N
        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemHome);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1076, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookActionPerformed

    }//GEN-LAST:event_jButtonAddBookActionPerformed


    private void jMenuItemReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportsActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\reports\\Rentals.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                // no application registered for PDFs
            }
        }
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

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
        setVisible(false);
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jButtonModifyBookjButtonModifyBook3jButtonModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyBookjButtonModifyBook3jButtonModifyBookActionPerformed
        setVisible(false);
        ModifyBook m = new ModifyBook();
        m.setVisible(true);
    }//GEN-LAST:event_jButtonModifyBookjButtonModifyBook3jButtonModifyBookActionPerformed

    private void jButtonListOfBooksjButtonLendBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListOfBooksjButtonLendBook1ActionPerformed
        setVisible(false);
        BooksSearch bs = new BooksSearch(this);
        bs.setVisible(true);
    }//GEN-LAST:event_jButtonListOfBooksjButtonLendBook1ActionPerformed

    private void jButtonDeleteBookjButtonDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteBookjButtonDeleteBookActionPerformed
        setVisible(false);
        DeleteBook d = new DeleteBook();
        d.setVisible(true);    }//GEN-LAST:event_jButtonDeleteBookjButtonDeleteBookActionPerformed

    private void jButtonAddBookjButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookjButtonAddBookActionPerformed
        setVisible(false);
        AddBook addB = new AddBook();
        addB.setVisible(true);
    }//GEN-LAST:event_jButtonAddBookjButtonAddBookActionPerformed

    private void jButtonReturnBookjButtonReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnBookjButtonReturnBookActionPerformed
        setVisible(false);
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButtonReturnBookjButtonReturnBookActionPerformed

    private void jButtonLendBookjButtonLendBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLendBookjButtonLendBookActionPerformed
        setVisible(false);
        RentBook rb = new RentBook();
        rb.setVisible(true);
    }//GEN-LAST:event_jButtonLendBookjButtonLendBookActionPerformed

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
    private javax.swing.JButton jButtonDeleteBook;
    private javax.swing.JButton jButtonLendBook;
    private javax.swing.JButton jButtonListOfBooks;
    private javax.swing.JButton jButtonModifyBook;
    private javax.swing.JButton jButtonReturnBook;
    private javax.swing.JLabel jLabelAddBook2;
    private javax.swing.JLabel jLabelDeleteBook6;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelRentBook4;
    private javax.swing.JLabel jLabelRentBook5;
    private javax.swing.JLabel jLabelReturnBook2;
    private javax.swing.JLabel jLabelReturnBook6;
    private javax.swing.JLabel jLabelSelection2;
    private javax.swing.JLabel jLabeldisplayUsername1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAccManagement;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemReports;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
