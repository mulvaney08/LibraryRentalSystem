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
public class CustomersSearch extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    Statement statement;

    DefaultTableModel dm = new DefaultTableModel();

    private RentBook rb;
    private boolean rbControl;
    private AddAccount a;
    private boolean aControl;
    private DeleteAccount d;
    private boolean dControl;
    private ModifyAccount m;
    private boolean mControl;

    String ISBN;
    String AccountNum;

    /**
     * Creates new form CustomersSearch
     */
    public CustomersSearch() {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
    }

    public CustomersSearch(RentBook rb) {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
        this.rb = rb;
        rbControl = true;
    }

    public CustomersSearch(RentBook rb, String ISBN) {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
        this.rb = rb;
        rbControl = true;
        this.ISBN = ISBN;
    }

    public CustomersSearch(AddAccount a) {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
        this.a = a;
        aControl = true;
    }

    public CustomersSearch(DeleteAccount d) {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
        this.d = d;
        dControl = true;
    }

    public CustomersSearch(ModifyAccount m) {
        initComponents();
        connection = dbConnect.connectDb();
        searchCustomers();
        AutoSizeTable.sizeColumnsToFit(jTableCustomers);
        this.m = m;
        mControl = true;
    }

    public ArrayList<Customer> ListCustomersAll(String searchValue) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        try {

            String query = "select * from Account where AccountNum LIKE '%" + searchValue + "%' OR FirstName LIKE '%" + searchValue + "%' OR LastName LIKE '%" + searchValue + "%' OR AddLine1 LIKE '%" + searchValue + "%' OR AddLine2 LIKE '%" + searchValue + "%' OR DOB LIKE '%" + searchValue + "%' OR IBAN LIKE '%" + searchValue + "%' OR BIC LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Customer customer;

            while (result.next()) {

                customer = new Customer(result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("AddLine1"),
                        result.getString("AddLine2"),
                        result.getString("DOB"),
                        result.getInt("IBAN"),
                        result.getInt("BIC"));

                customers.add(customer);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return customers;
    }

    public ArrayList<Customer> ListCustomersFirstName(String searchValue) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        try {

            String query = "select * from Account where FirstName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Customer customer;

            while (result.next()) {

                customer = new Customer(result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("AddLine1"),
                        result.getString("AddLine2"),
                        result.getString("DOB"),
                        result.getInt("IBAN"),
                        result.getInt("BIC"));

                customers.add(customer);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return customers;
    }

    public ArrayList<Customer> ListCustomersLastName(String searchValue) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        try {

            String query = "select * from Account where LastName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Customer customer;

            while (result.next()) {

                customer = new Customer(result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("AddLine1"),
                        result.getString("AddLine2"),
                        result.getString("DOB"),
                        result.getInt("IBAN"),
                        result.getInt("BIC"));

                customers.add(customer);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return customers;
    }

    public ArrayList<Customer> ListCustomersAddLine(String searchValue) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        try {

            String query = "select * from Account where AddLine1 LIKE '%" + searchValue + "%' OR AddLine2 LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Customer customer;

            while (result.next()) {

                customer = new Customer(result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("AddLine1"),
                        result.getString("AddLine2"),
                        result.getString("DOB"),
                        result.getInt("IBAN"),
                        result.getInt("BIC"));

                customers.add(customer);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return customers;
    }

    public ArrayList<Customer> ListCustomersDOB(String searchValue) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        try {

            String query = "select * from Account where DOB LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Customer customer;

            while (result.next()) {

                customer = new Customer(result.getInt("AccountNum"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("AddLine1"),
                        result.getString("AddLine2"),
                        result.getString("DOB"),
                        result.getInt("IBAN"),
                        result.getInt("BIC"));

                customers.add(customer);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return customers;
    }

    public void searchCustomers() {
        if (dm.getRowCount() > 0) {
            for (int i = dm.getRowCount() - 1; i > -1; i--) {
                dm.removeRow(i);
            }
        }
        ArrayList<Customer> customers = new ArrayList<Customer>();

        switch (jComboBoxChoose.getSelectedItem().toString()) {
            case "All":
                customers = ListCustomersAll(jTextFieldSearch.getText());
                break;
            case "First Name":
                customers = ListCustomersFirstName(jTextFieldSearch.getText());
                break;
            case "Last Name":
                customers = ListCustomersLastName(jTextFieldSearch.getText());
                break;
            case "Address":
                customers = ListCustomersAddLine(jTextFieldSearch.getText());
                break;
            case "DOB":
                customers = ListCustomersDOB(jTextFieldSearch.getText());
                break;

        }

        dm.setColumnIdentifiers(new Object[]{"AccountNum", "FirstName", "LastName", "AddLine1", "AddLine2", "DOB", "IBAN", "BIC"});
        Object[] row = new Object[8];

        for (int i = 0; i < customers.size(); i++) {

            row[0] = customers.get(i).getAccountNum();
            row[1] = customers.get(i).getFirstName();
            row[2] = customers.get(i).getLastName();
            row[3] = customers.get(i).getAddLine1();
            row[4] = customers.get(i).getAddLine2();
            row[5] = customers.get(i).getDOB();
            row[6] = customers.get(i).getIBAN();
            row[7] = customers.get(i).getBIC();
            dm.addRow(row);
        }

        jTableCustomers.setModel(dm);
    }

    public void getBackWithCust(String AccountNum) {
        setVisible(false);
        if (rbControl == true) {
            rb = new RentBook(AccountNum, this.ISBN);
            rb.setVisible(true);
            rb.search();
            rb.searchCust();
        } else if (dControl == true) {
            d = new DeleteAccount(AccountNum);
            d.setVisible(true);
            d.search();
        } else if (mControl == true) {
            m = new ModifyAccount(AccountNum);
            m.setVisible(true);
            m.search();
        }

        rbControl = false;

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
        jTableCustomers = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jComboBoxChoose = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18), new java.awt.Color(102, 0, 0))); // NOI18N

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

        jTableCustomers.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableCustomersMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCustomers);

        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jComboBoxChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "First Name", "Last Name", "Address", "DOB" }));

        jLabel1.setText("Choose filter:");

        jLabel2.setText("Enter text to search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addComponent(jButtonBack))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(703, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchCustomers();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        if (rbControl == true) {
            rb = new RentBook();
            rb.setVisible(true);

        } else if (aControl == true) {
            a = new AddAccount();
            a.setVisible(true);
        } else if (dControl == true) {
            d = new DeleteAccount();
            d.setVisible(true);
        } else if (mControl == true) {
            m = new ModifyAccount();
            m.setVisible(true);
        }

        rbControl = false;
        aControl = false;
        dControl = false;
        mControl = false;

        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTableCustomersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomersMouseReleased
        if (dControl == true || mControl == true || rbControl == true) {
            String AccNum;
            AccNum = (jTableCustomers.getValueAt(jTableCustomers.getSelectedRow(), 0).toString());
            getBackWithCust(AccNum);
        }
    }//GEN-LAST:event_jTableCustomersMouseReleased

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
            java.util.logging.Logger.getLogger(CustomersSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomersSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomersSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomersSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomersSearch().setVisible(true);
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
    private javax.swing.JTable jTableCustomers;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
