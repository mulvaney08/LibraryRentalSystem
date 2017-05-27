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
public class UsersSearch extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    Statement statement;

    DefaultTableModel dm = new DefaultTableModel();

    User u;

    private AddUser a;
    private boolean aControl = false;
    private DeleteUser d;
    private boolean dControl = false;
    private ModifyUser m;
    private boolean mControl = false;

    /**
     * Creates new form UsersSearch
     */
    public UsersSearch() {
        initComponents();
        connection = dbConnect.connectDb();
        searchUsers();
        AutoSizeTable.sizeColumnsToFit(jTableUsers);
    }

    public UsersSearch(AddUser a) {
        initComponents();
        connection = dbConnect.connectDb();
        searchUsers();
        AutoSizeTable.sizeColumnsToFit(jTableUsers);
        this.a = a;
        aControl = true;
    }

    public UsersSearch(DeleteUser d) {
        initComponents();
        connection = dbConnect.connectDb();
        searchUsers();
        AutoSizeTable.sizeColumnsToFit(jTableUsers);
        this.d = d;
        aControl = true;
    }

        public UsersSearch(ModifyUser m) {
        initComponents();
        connection = dbConnect.connectDb();
        searchUsers();
        AutoSizeTable.sizeColumnsToFit(jTableUsers);
        this.m = m;
        aControl = true;
    }
    
    public ArrayList<User> ListUsersAll(String searchValue) {
        ArrayList<User> usersList = new ArrayList<User>();

        try {

            String query = "select Username, FirstName, LastName, UserType from User where Username LIKE '%" + searchValue + "%' OR FirstName LIKE '%" + searchValue + "%' OR LastName LIKE '%" + searchValue + "%' OR UserType LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            User user;

            while (result.next()) {

                user = new User(result.getString("Username"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("UserType"));

                usersList.add(user);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return usersList;
    }

    public ArrayList<User> ListUsersUsername(String searchValue) {
        ArrayList<User> usersList = new ArrayList<User>();

        try {

            String query = "select Username, FirstName, LastName, UserType from User where Username LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            User user;

            while (result.next()) {

                user = new User(result.getString("Username"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("UserType"));

                usersList.add(user);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return usersList;
    }

    public ArrayList<User> ListUsersFirstName(String searchValue) {
        ArrayList<User> usersList = new ArrayList<User>();

        try {

            String query = "select Username, FirstName, LastName, UserType from User where FirstName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            User user;

            while (result.next()) {

                user = new User(result.getString("Username"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("UserType"));

                usersList.add(user);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return usersList;
    }

    public ArrayList<User> ListUsersLastName(String searchValue) {
        ArrayList<User> usersList = new ArrayList<User>();

        try {

            String query = "select Username, FirstName, LastName, UserType from User where LastName LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            User user;

            while (result.next()) {

                user = new User(result.getString("Username"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("UserType"));

                usersList.add(user);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return usersList;
    }

    public ArrayList<User> ListUsersUserType(String searchValue) {
        ArrayList<User> usersList = new ArrayList<User>();

        try {

            String query = "select Username, FirstName, LastName, UserType from User where UserType LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            User user;

            while (result.next()) {

                user = new User(result.getString("Username"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getString("UserType"));

                usersList.add(user);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return usersList;
    }

    public void searchUsers() {
        if (dm.getRowCount() > 0) {
            for (int i = dm.getRowCount() - 1; i > -1; i--) {
                dm.removeRow(i);
            }
        }
        ArrayList<User> users = new ArrayList<User>();

        switch (jComboBoxChoose.getSelectedItem().toString()) {
            case "All":
                users = ListUsersAll(jTextFieldSearch.getText());
                break;
            case "Username":
                users = ListUsersUsername(jTextFieldSearch.getText());
                break;
            case "First name":
                users = ListUsersFirstName(jTextFieldSearch.getText());
                break;
            case "Last Name":
                users = ListUsersLastName(jTextFieldSearch.getText());
                break;
            case "User type":
                users = ListUsersUserType(jTextFieldSearch.getText());
                break;
        }

        dm.setColumnIdentifiers(new Object[]{"Username", "First Name", "Last Name", "User type"});
        Object[] row = new Object[4];

        for (int i = 0; i < users.size(); i++) {

            row[0] = users.get(i).getUsername();
            row[1] = users.get(i).getFirstName();
            row[2] = users.get(i).getLastName();
            row[3] = users.get(i).getUserType();
            dm.addRow(row);
        }

        jTableUsers.setModel(dm);
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
        jTableUsers = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jComboBoxChoose = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18), new java.awt.Color(102, 0, 0))); // NOI18N

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

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableUsersMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jComboBoxChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Username", "First name", "Last Name", "User type" }));

        jLabel1.setText("Choose filter:");

        jLabel2.setText("Enter text to search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBack))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBack, jButtonSearch});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBack))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBack, jButtonSearch});

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

        setSize(new java.awt.Dimension(421, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchUsers();
        AutoSizeTable.sizeColumnsToFit(jTableUsers);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseClicked

    }//GEN-LAST:event_jTableUsersMouseClicked

    private void jTableUsersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseReleased
        /*
        String ISBN;
        String Name, Edition, Publisher, Pages, Author, PricePerWeek;

        ISBN = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 0).toString());
        System.out.println(ISBN);
        Name = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 1).toString());
        System.out.println(Name);
        Edition = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 2).toString());
        System.out.println(Edition);
        Publisher = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 3).toString());
        System.out.println(Publisher);
        Pages = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 4).toString());
        System.out.println(Pages);
        Author = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 5).toString());
        System.out.println(Author);
        PricePerWeek = (jTableUsers.getValueAt(jTableUsers.getSelectedRow(), 6).toString());
        System.out.println(PricePerWeek);

        this.book.setISBN2(ISBN);
        System.out.println("Still Working");
        this.book.setName(Name);
        this.book.setEdition(Edition);
        this.book.setPublisher(Publisher);
        this.book.setPages(Pages);
        this.book.setAuthor(Author);
        this.book.setPricePerWeek(PricePerWeek);
        System.out.println("Still Working");
        getBackWithBook(this.book);*/
    }//GEN-LAST:event_jTableUsersMouseReleased

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        setVisible(false);
        if (aControl == true) {
            a = new AddUser();
            a.setVisible(true);
        } else if (dControl == true) {
            d = new DeleteUser();
            d.setVisible(true);
        } else if (mControl == true) {
            m = new ModifyUser();
            m.setVisible(true);
        }

        aControl = false;
        dControl = false;
        mControl = false;

        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(UsersSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersSearch().setVisible(true);
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
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
