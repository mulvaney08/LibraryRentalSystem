package LibrarySystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aaronm
 */
public class dbConnect {

    Connection connection;

    public static Connection connectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\aaronm\\Documents\\AaronYear3Project\\LibraryRentalSystem\\Library.sqlite");
            return connection;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

}
