/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaronm
 */
public class RentalsSearch extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    Statement statement;

    DefaultTableModel dm = new DefaultTableModel();

    private ReturnBook rb;
    private boolean rbControl = false;
    private BookManagement b;
    private boolean bControl = false;
    

    /**
     * Creates new form RentalsSearch
     */
    public RentalsSearch() {
        initComponents();
        connection = dbConnect.connectDb();
        searchRentals();
        AutoSizeTable.sizeColumnsToFit(jTableRentals);
    }

    public RentalsSearch(ReturnBook rb) {
        initComponents();
        connection = dbConnect.connectDb();
        searchRentals();
        AutoSizeTable.sizeColumnsToFit(jTableRentals);
        this.rb = rb;
        rbControl = true;
    }
    
    public RentalsSearch(BookManagement b){
        initComponents();
        connection = dbConnect.connectDb();
        searchRentals();
        AutoSizeTable.sizeColumnsToFit(jTableRentals);
        this.b = b;
        bControl = true;
    }

    public ArrayList<Rental> ListRentals() {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public ArrayList<Rental> ListRentalsBookName(String searchValue) {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum AND b.Name LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public ArrayList<Rental> ListRentalsUsername(String searchValue) {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum AND r.Username LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public ArrayList<Rental> ListRentalsFirstName(String searchValue) {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum AND a.FirstName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public ArrayList<Rental> ListRentalsLastName(String searchValue) {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum AND a.LastName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public ArrayList<Rental> ListRentalsRentDate(String searchValue) {
        ArrayList<Rental> rentalsList = new ArrayList<Rental>();

        try {

            String query = "select r.RentID, r.ISBN, b.Name, r.Username, a.AccountNum, a.FirstName, a.LastName, r.RentDate from RentBook r, Account a, Book b where r.ISBN = b.ISBN AND r.AccountNum = a.AccountNum AND r.RentDate LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Rental rental;
            while (result.next()) {

                rental = new Rental(
                        result.getInt("RentID"),
                        result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Username"),
                        result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("RentDate"));

                rentalsList.add(rental);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rentalsList;
    }

    public void searchRentals() {
        if (dm.getRowCount() > 0) {
            for (int i = dm.getRowCount() - 1; i > -1; i--) {
                dm.removeRow(i);
            }
        }
        ArrayList<Rental> rentals = new ArrayList<Rental>();

        switch (jComboBoxChoose.getSelectedItem().toString()) {
            case "All":
                rentals = ListRentals();
                break;
            case "Book Name":
                rentals = ListRentalsBookName(jTextFieldSearch.getText());
                break;
            case "Staff":
                rentals = ListRentalsUsername(jTextFieldSearch.getText());
                break;
            case "First Name":
                rentals = ListRentalsFirstName(jTextFieldSearch.getText());
                break;
            case "Last Name":
                rentals = ListRentalsLastName(jTextFieldSearch.getText());
                break;
            case "Rent Date":
                rentals = ListRentalsRentDate(jTextFieldSearch.getText());
                break;
        }

        dm.setColumnIdentifiers(new Object[]{"Rent ID", "ISBN", "Book Name", "Staff", "Account Number", "First Name", "Last Name", "Rent Date"});
        Object[] row = new Object[8];

        for (int i = 0; i < rentals.size(); i++) {

            row[0] = rentals.get(i).getRentID();
            row[1] = rentals.get(i).getISBN();
            row[2] = rentals.get(i).getBookName();
            row[3] = rentals.get(i).getUsername();
            row[4] = rentals.get(i).getAccountNum();
            row[5] = rentals.get(i).getFirstName();
            row[6] = rentals.get(i).getLastName();
            row[7] = rentals.get(i).getRentDate();
            dm.addRow(row);
        }

        jTableRentals.setModel(dm);
    }

    public void getBackWithRental(String ISBN,String AccNum,String RentID) {
        setVisible(false);
        if (rbControl == true) {
            rb = new ReturnBook(ISBN,AccNum,RentID);
            rb.setVisible(true);
            rb.search();
        } else if (bControl == true) {
            b.setVisible(true);
        }

        rbControl = false;
        bControl = false;

        dispose();
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
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRentals = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jComboBoxChoose = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rentals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableRentals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRentals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableRentalsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRentals);

        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jComboBoxChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Book Name", "Staff", "First Name", "Last Name", "Rent Date" }));
        jComboBoxChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChooseActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose filter:");

        jLabel2.setText("Enter text to search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBack)
                        .addGap(0, 163, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(868, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchRentals();
        AutoSizeTable.sizeColumnsToFit(jTableRentals);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        if (rbControl == true) {
            rb = new ReturnBook();
            rb.setVisible(true);
        } else if (bControl == true) {
            b.setVisible(true);
        }

        rbControl = false;
        bControl = false;

        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jComboBoxChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxChooseActionPerformed

    private void jTableRentalsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRentalsMouseReleased
        String ISBN, AccNum, RentID;
        ISBN = (jTableRentals.getValueAt(jTableRentals.getSelectedRow(), 1).toString());
        AccNum = (jTableRentals.getValueAt(jTableRentals.getSelectedRow(), 4).toString());
        RentID = (jTableRentals.getValueAt(jTableRentals.getSelectedRow(), 0).toString());
        getBackWithRental(ISBN, AccNum, RentID);
    }//GEN-LAST:event_jTableRentalsMouseReleased

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
            java.util.logging.Logger.getLogger(RentalsSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalsSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalsSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalsSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalsSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRentals;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
