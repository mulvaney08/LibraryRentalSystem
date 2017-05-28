/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aaronm
 */
public class ReturnBook extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    PreparedStatement pStatement;

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        super("Return Book");
        initComponents();
        connection = dbConnect.connectDb();
    }

    public ReturnBook(String ISBN, String AccNum, String RentID) {
        super("Return Book");
        initComponents();
        connection = dbConnect.connectDb();
        jTextFieldISBN.setText(ISBN);
        jTextFieldAccountNum.setText(AccNum);
        jTextFieldRentID.setText(RentID);
    }

    public int generateReturnID() {

        int id;

        Random r = new Random();
        id = r.nextInt(10000000 + 1);

        return id;
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
        jPanel2 = new javax.swing.JPanel();
        jLabelLName = new javax.swing.JLabel();
        jLabelBookName1 = new javax.swing.JLabel();
        jLabelFName = new javax.swing.JLabel();
        jTextFieldBookName = new javax.swing.JTextField();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelISBN1 = new javax.swing.JLabel();
        jButtonSearchBook = new javax.swing.JButton();
        jLabelEdition1 = new javax.swing.JLabel();
        jTextFieldRentDate = new javax.swing.JTextField();
        jLabelRentDate = new javax.swing.JLabel();
        jButtonClearBook = new javax.swing.JButton();
        jTextFieldAccountNum = new javax.swing.JTextField();
        jButtonListAllBooks = new javax.swing.JButton();
        jLabelRental1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtonConfirm1 = new javax.swing.JButton();
        jButtonBack1 = new javax.swing.JButton();
        jLabelStaff = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelRentID = new javax.swing.JLabel();
        jTextFieldRentID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabelLName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelLName.setText("Last Name:");

        jLabelBookName1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelBookName1.setText("Book Name:");

        jLabelFName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelFName.setText("First Name:");

        jTextFieldBookName.setEditable(false);
        jTextFieldBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBookNameActionPerformed(evt);
            }
        });

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jTextFieldLastName.setEditable(false);
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });

        jTextFieldFirstName.setEditable(false);
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jLabelISBN1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelISBN1.setText("Book ISBN:");

        jButtonSearchBook.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonSearchBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\search.png")); // NOI18N
        jButtonSearchBook.setText("Search");
        jButtonSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchBookActionPerformed(evt);
            }
        });

        jLabelEdition1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelEdition1.setText("Account Number:");

        jTextFieldRentDate.setEditable(false);
        jTextFieldRentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRentDateActionPerformed(evt);
            }
        });

        jLabelRentDate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelRentDate.setText("Rent Date:");

        jButtonClearBook.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonClearBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\delete.png")); // NOI18N
        jButtonClearBook.setText("Clear");
        jButtonClearBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearBookActionPerformed(evt);
            }
        });

        jTextFieldAccountNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccountNumActionPerformed(evt);
            }
        });

        jButtonListAllBooks.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\smallBook.png")); // NOI18N
        jButtonListAllBooks.setText("List of Rentals");
        jButtonListAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListAllBooksActionPerformed(evt);
            }
        });

        jLabelRental1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelRental1.setText("Return Date:");

        jButtonConfirm1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonConfirm1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\tick.png")); // NOI18N
        jButtonConfirm1.setText("Confirm");
        jButtonConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirm1ActionPerformed(evt);
            }
        });

        jButtonBack1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBack1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack1.setText("Back");
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });

        jLabelStaff.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelStaff.setText("Staff Member:");

        jTextFieldUsername.setEditable(false);
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabelRentID.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelRentID.setText("Rental ID:");

        jTextFieldRentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRentIDActionPerformed(evt);
            }
        });

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
                                .addComponent(jButtonListAllBooks)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonSearchBook, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButtonClearBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelISBN1)
                                    .addComponent(jLabelEdition1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAccountNum)
                                    .addComponent(jTextFieldISBN))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConfirm1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRental1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBack1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRentDate)
                            .addComponent(jLabelFName)
                            .addComponent(jLabelLName)
                            .addComponent(jLabelBookName1)
                            .addComponent(jLabelStaff)
                            .addComponent(jLabelRentID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsername)
                            .addComponent(jTextFieldLastName)
                            .addComponent(jTextFieldFirstName)
                            .addComponent(jTextFieldRentDate)
                            .addComponent(jTextFieldRentID))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelBookName1, jLabelEdition1, jLabelFName, jLabelISBN1, jLabelLName, jLabelRentDate, jLabelRentID, jLabelStaff, jTextFieldAccountNum, jTextFieldBookName, jTextFieldFirstName, jTextFieldISBN, jTextFieldLastName, jTextFieldRentDate, jTextFieldRentID, jTextFieldUsername});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRental1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelISBN1)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEdition1)
                            .addComponent(jTextFieldAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRentID)
                    .addComponent(jTextFieldRentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBookName1)
                    .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRentDate)
                    .addComponent(jTextFieldRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStaff)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConfirm1)
                            .addComponent(jButtonBack1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearchBook)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClearBook)
                            .addComponent(jButtonListAllBooks))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelBookName1, jLabelEdition1, jLabelFName, jLabelISBN1, jLabelLName, jLabelRentDate, jLabelRentID, jLabelStaff, jTextFieldAccountNum, jTextFieldBookName, jTextFieldFirstName, jTextFieldISBN, jTextFieldLastName, jTextFieldRentDate, jTextFieldRentID, jTextFieldUsername});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(734, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBookNameActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jButtonSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchBookActionPerformed
        search();

    }//GEN-LAST:event_jButtonSearchBookActionPerformed

    public void search() {
        String query = "select * from RentBook rb, Book b, Account a Where rb.RentID = ? AND a.AccountNum = ? AND rb.AccountNum = a.AccountNum AND rb.ISBN = b.ISBN";
        try {

            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, jTextFieldRentID.getText());
            pStatement.setString(2, jTextFieldAccountNum.getText());
            result = pStatement.executeQuery();

            if (result.next()) {
                String s = result.getString("Name");
                jTextFieldBookName.setText(s);
                String s2 = result.getString("FirstName");
                jTextFieldFirstName.setText(s2);
                String s3 = result.getString("LastName");
                jTextFieldLastName.setText(s3);
                String s4 = result.getString("RentDate");
                jTextFieldRentDate.setText(s4);
                String s5 = result.getString("Username");
                jTextFieldUsername.setText(s5);

                //result.close();
                //pStatement.close();
            } else {
                if (jTextFieldRentID.getText() == "" && jTextFieldAccountNum.getText() == "") {
                    JOptionPane.showMessageDialog(null, "No Account Number or Rental ID entered");
                } else if (jTextFieldRentID.getText() == "") {
                    JOptionPane.showMessageDialog(null, "No Rental ID entered");
                } else if (jTextFieldAccountNum.getText() == "") {
                    JOptionPane.showMessageDialog(null, "No Account Number entered");
                } else {
                    JOptionPane.showMessageDialog(null, "No rental found with Rental ID: " + jTextFieldRentID.getText() + " for the account: " + jTextFieldAccountNum.getText());
                }
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

    private void jTextFieldRentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRentDateActionPerformed

    private void jButtonClearBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearBookActionPerformed
        this.clearFormBook();
    }//GEN-LAST:event_jButtonClearBookActionPerformed

    private void jTextFieldAccountNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccountNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAccountNumActionPerformed

    private void jButtonConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirm1ActionPerformed
        String insert = "INSERT into ReturnBook (ReturnID,RentID,ISBN,AccountNum,Username,ReturnDate) values (?,?,?,?,?,?)";
        int id = generateReturnID();
        try {

            pStatement = connection.prepareStatement(insert);

            pStatement.setInt(1, id);
            pStatement.setString(2, jTextFieldRentID.getText());
            pStatement.setString(3, jTextFieldISBN.getText());
            pStatement.setString(4, jTextFieldAccountNum.getText());
            pStatement.setString(5, Login.username);
            pStatement.setString(6, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
            pStatement.execute();
            JOptionPane.showMessageDialog(null, "Return Confirmed");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + ", please try again");

        }

        String delete = "DELETE FROM RentBook WHERE RentID = ?";

        try {

            pStatement = connection.prepareStatement(delete);

            pStatement.setString(1, jTextFieldRentID.getText());
            pStatement.execute();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + ", please try again");

        }

        this.clearFormBook();
        this.clearFormCust();
    }//GEN-LAST:event_jButtonConfirm1ActionPerformed

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed
        setVisible(false);
        BookManagement bm = new BookManagement();
        bm.setVisible(true);
    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jButtonListAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListAllBooksActionPerformed
        setVisible(false);
        RentalsSearch rs = new RentalsSearch(this);
        rs.setVisible(true);
    }//GEN-LAST:event_jButtonListAllBooksActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldRentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRentIDActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonClearBook;
    private javax.swing.JButton jButtonConfirm1;
    private javax.swing.JButton jButtonListAllBooks;
    private javax.swing.JButton jButtonSearchBook;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabelBookName1;
    private javax.swing.JLabel jLabelEdition1;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JLabel jLabelISBN1;
    private javax.swing.JLabel jLabelLName;
    private javax.swing.JLabel jLabelRentDate;
    private javax.swing.JLabel jLabelRentID;
    private javax.swing.JLabel jLabelRental1;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldAccountNum;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldRentDate;
    private javax.swing.JTextField jTextFieldRentID;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    private void clearFormBook() {

        this.jTextFieldISBN.setText("");
        this.jTextFieldAccountNum.setText("");
        this.jTextFieldRentID.setText("");
        this.jTextFieldBookName.setText("");
        this.jTextFieldFirstName.setText("");
        this.jTextFieldLastName.setText("");
        this.jTextFieldRentDate.setText("");
        this.jTextFieldUsername.setText("");
    }

    private void clearFormCust() {
        /*this.jTextFieldAccID.setText("");
        this.jTextFieldFName.setText("");
        this.jTextFieldLName.setText("");
        this.jTextFieldAddLine1.setText("");
        this.jTextFieldAddLine2.setText("");
        this.jTextFieldDOB.setText("");
        this.jTextFieldIBAN.setText("");
        this.jTextFieldBIC.setText("");*/
    }

}
