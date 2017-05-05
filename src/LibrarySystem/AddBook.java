package LibrarySystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
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
public class AddBook extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    PreparedStatement pStatement;

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        super("Add Book");
        initComponents();
        this.clearForm();
        generateID();
        connection = dbConnect.connectDb();
    }

    public void generateID(){
        Random r = new Random();
        jTextFieldISBN.setText(""+r.nextInt(10000000+1));
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
        jTextFieldPricePerWeek = new javax.swing.JTextField();
        jLabelPages = new javax.swing.JLabel();
        jLabelBookName = new javax.swing.JLabel();
        jLabelPublisher = new javax.swing.JLabel();
        jTextFieldBookName = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jLabelPricePerWeek = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldPages = new javax.swing.JTextField();
        jTextFieldPublisher = new javax.swing.JTextField();
        jLabelISBN = new javax.swing.JLabel();
        jButtonAddBook = new javax.swing.JButton();
        jLabelEdition = new javax.swing.JLabel();
        jComboBoxEdition = new javax.swing.JComboBox<>();
        jTextFieldAuthor = new javax.swing.JTextField();
        jLabelAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 24), new java.awt.Color(102, 0, 0))); // NOI18N

        jTextFieldPricePerWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPricePerWeekActionPerformed(evt);
            }
        });

        jLabelPages.setText("Pages:");

        jLabelBookName.setText("Name:");

        jLabelPublisher.setText("Publisher:");

        jTextFieldBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBookNameActionPerformed(evt);
            }
        });

        jButtonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelPricePerWeek.setText("Price Per Week:");

        jTextFieldISBN.setEditable(false);
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jTextFieldPages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPagesActionPerformed(evt);
            }
        });

        jTextFieldPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPublisherActionPerformed(evt);
            }
        });

        jLabelISBN.setText("Book ISBN:");

        jButtonAddBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\add.png")); // NOI18N
        jButtonAddBook.setText("Add");
        jButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookActionPerformed(evt);
            }
        });

        jLabelEdition.setText("Edition:");

        jComboBoxEdition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Edition", "2nd Edition", "3rd Edition", "4th Edition", "5th Edition", "6th Edition", "7th Edition" }));

        jTextFieldAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAuthorActionPerformed(evt);
            }
        });

        jLabelAuthor.setText("Author:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPublisher)
                                    .addComponent(jLabelPages)
                                    .addComponent(jLabelEdition)
                                    .addComponent(jLabelBookName)
                                    .addComponent(jLabelISBN))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                    .addComponent(jTextFieldISBN)
                                    .addComponent(jTextFieldBookName)
                                    .addComponent(jTextFieldPages)
                                    .addComponent(jTextFieldPublisher)
                                    .addComponent(jComboBoxEdition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabelAuthor))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPricePerWeek)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAuthor)
                            .addComponent(jTextFieldPricePerWeek))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelISBN)
                    .addComponent(jTextFieldISBN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBookName)
                    .addComponent(jTextFieldBookName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdition)
                    .addComponent(jComboBoxEdition))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPublisher)
                    .addComponent(jTextFieldPublisher))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPages)
                    .addComponent(jTextFieldPages))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAuthor)
                    .addComponent(jTextFieldAuthor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPricePerWeek)
                    .addComponent(jTextFieldPricePerWeek))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddBook)
                    .addComponent(jButtonBack))
                .addGap(36, 36, 36))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(360, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPublisherActionPerformed

    private void jTextFieldPagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPagesActionPerformed

    private void jTextFieldPricePerWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPricePerWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPricePerWeekActionPerformed

    private void jTextFieldBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBookNameActionPerformed

    private void jButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookActionPerformed
        this.clearForm();
        String insert = "INSERT into Book (ISBN,Name,Edition,Publisher,Pages,Author,PricePerWeek) values (?,?,?,?,?,?,?)";
        try{
            pStatement=connection.prepareStatement(insert);
            pStatement.setString(1, jTextFieldISBN.getText());
            pStatement.setString(2, jTextFieldBookName.getText());
            pStatement.setString(3, (String) jComboBoxEdition.getSelectedItem());
            pStatement.setString(4, jTextFieldPublisher.getText());
            pStatement.setString(5, jTextFieldPages.getText());
            pStatement.setString(6, jTextFieldAuthor.getText());
            pStatement.setString(7, jTextFieldPricePerWeek.getText());
            pStatement.execute();
            JOptionPane.showMessageDialog(null, "Book Added");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex +", please try again");
            
        }
    }//GEN-LAST:event_jButtonAddBookActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        BookManagement b = new BookManagement();
        b.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAuthorActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    private void clearForm() {
        this.jTextFieldBookName.setText("");
        this.jTextFieldPublisher.setText("");
        this.jTextFieldPages.setText("");
        this.jTextFieldAuthor.setText("");
        this.jTextFieldPricePerWeek.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBook;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JComboBox<String> jComboBoxEdition;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelBookName;
    private javax.swing.JLabel jLabelEdition;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelPages;
    private javax.swing.JLabel jLabelPricePerWeek;
    private javax.swing.JLabel jLabelPublisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldPages;
    private javax.swing.JTextField jTextFieldPricePerWeek;
    private javax.swing.JTextField jTextFieldPublisher;
    // End of variables declaration//GEN-END:variables
}
