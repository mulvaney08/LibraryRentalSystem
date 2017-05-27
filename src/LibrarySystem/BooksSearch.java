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
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaronm
 */
public class BooksSearch extends javax.swing.JFrame {

    Connection connection;
    ResultSet result;
    Statement statement;

    DefaultTableModel dm = new DefaultTableModel();

    private Book book;
    private RentBook rb;
    private boolean rbControl = false;
    private BookManagement b;
    private boolean bControl = false;
    private AddBook a;
    private boolean aControl = false;
    private DeleteBook d;
    private boolean dControl = false;
    private ModifyBook m;
    private boolean mControl = false;

    /**
     * Creates new form BooksSearch
     */
    public BooksSearch() {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);

    }

    public BooksSearch(RentBook rb) {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
        this.rb = rb;
        rbControl = true;

    }

    public BooksSearch(BookManagement b) {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
        this.b = b;
        bControl = true;
    }

    public BooksSearch(AddBook a) {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
        this.a = a;
        aControl = true;
    }

    public BooksSearch(DeleteBook d) {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
        this.d = d;
        dControl = true;
    }

    public BooksSearch(ModifyBook m) {
        initComponents();
        connection = dbConnect.connectDb();
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
        this.m = m;
        mControl = true;
    }

    public ArrayList<Book> ListBooksAll(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where ISBN LIKE '%" + searchValue + "%' OR Name LIKE '%" + searchValue + "%' OR Edition LIKE '%" + searchValue + "%' OR Publisher LIKE '%" + searchValue + "%' OR Pages LIKE '%" + searchValue + "%' OR Author LIKE '%" + searchValue + "%' OR PricePerWeek LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksName(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where Name LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksEdition(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where Edition LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksPublisher(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where Publisher LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksPages(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where Pages LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksAuthor(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where Author LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public ArrayList<Book> ListBooksPricePerWeek(String searchValue) {
        ArrayList<Book> booksList = new ArrayList<Book>();

        try {

            String query = "select * from Book where PricePerWeek LIKE '%" + searchValue + "%'";

            statement = connection.createStatement();

            result = statement.executeQuery(query);

            Book book;

            while (result.next()) {

                book = new Book(result.getInt("ISBN"),
                        result.getString("Name"),
                        result.getString("Edition"),
                        result.getString("Publisher"),
                        result.getString("Pages"),
                        result.getString("Author"),
                        result.getString("PricePerWeek"));

                booksList.add(book);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return booksList;
    }

    public void searchBooks() {
        if (dm.getRowCount() > 0) {
            for (int i = dm.getRowCount() - 1; i > -1; i--) {
                dm.removeRow(i);
            }
        }
        ArrayList<Book> books = new ArrayList<Book>();

        switch (jComboBoxChoose.getSelectedItem().toString()) {
            case "All":
                books = ListBooksAll(jTextFieldSearch.getText());
                break;
            case "Name":
                books = ListBooksName(jTextFieldSearch.getText());
                break;
            case "Edition":
                books = ListBooksEdition(jTextFieldSearch.getText());
                break;
            case "Publisher":
                books = ListBooksPublisher(jTextFieldSearch.getText());
                break;
            case "Pages":
                books = ListBooksPages(jTextFieldSearch.getText());
                break;
            case "Author":
                books = ListBooksAuthor(jTextFieldSearch.getText());
                break;
            case "PricePerWeek":
                books = ListBooksPricePerWeek(jTextFieldSearch.getText());
                break;
        }

        dm.setColumnIdentifiers(new Object[]{"ISBN", "Name", "Edition", "Publisher", "Pages", "Author", "PricePerWeek"});
        Object[] row = new Object[7];

        for (int i = 0; i < books.size(); i++) {

            row[0] = books.get(i).getISBN();
            row[1] = books.get(i).getName();
            row[2] = books.get(i).getEdition();
            row[3] = books.get(i).getPublisher();
            row[4] = books.get(i).getPages();
            row[5] = books.get(i).getAuthor();
            row[6] = books.get(i).getPricePerWeek();
            dm.addRow(row);
        }

        jTableBooks.setModel(dm);
    }

    public void getBackWithBook(Book book) {
        setVisible(false);
        if (rbControl == true) {
            System.out.println("Still Working in rbControl");
            rb = new RentBook(book);
            rb.setVisible(true);
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
        jTableBooks = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jComboBoxChoose = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18), new java.awt.Color(102, 0, 0))); // NOI18N

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

        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBooksMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableBooksMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\images\\exit.png")); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jComboBoxChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name", "Edition", "Publisher", "Pages", "Author", "PricePerWeek" }));

        jLabel1.setText("Choose filter:");

        jLabel2.setText("Enter text to search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(1045, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchBooks();
        AutoSizeTable.sizeColumnsToFit(jTableBooks);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        setVisible(false);
        if (rbControl == true) {
            rb = new RentBook();
            rb.setVisible(true);
        } else if (bControl == true) {
            b = new BookManagement();
            b.setVisible(true);
        } else if (aControl == true) {
            a = new AddBook();
            a.setVisible(true);
        } else if (dControl == true) {
            d = new DeleteBook();
            d.setVisible(true);
        } else if (mControl == true) {
            m = new ModifyBook();
            m.setVisible(true);
        }

        rbControl = false;
        bControl = false;
        aControl = false;
        dControl = false;
        mControl = false;
        
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseClicked

    }//GEN-LAST:event_jTableBooksMouseClicked

    private void jTableBooksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseReleased

        String ISBN;
        String Name, Edition, Publisher, Pages, Author, PricePerWeek;

        ISBN = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString());
        System.out.println(ISBN);
        Name = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString());
        System.out.println(Name);
        Edition = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString());
        System.out.println(Edition);
        Publisher = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString());
        System.out.println(Publisher);
        Pages = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4).toString());
        System.out.println(Pages);
        Author = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString());
        System.out.println(Author);
        PricePerWeek = (jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 6).toString());
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
        getBackWithBook(this.book);
    }//GEN-LAST:event_jTableBooksMouseReleased

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
            java.util.logging.Logger.getLogger(BooksSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksSearch.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksSearch().setVisible(true);
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
    private javax.swing.JTable jTableBooks;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

}
