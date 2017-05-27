/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Date;

/**
 *
 * @author aaronm
 */
public class Rental {

    private int RentID, AccountNum, ISBN;
    private String Username, FirstName, LastName, BookName, RentDate;

    public Rental(int RentID, int ISBN, String BookName, String Username, int AccountNum, String FirstName, String LastName, String RentDate) {
        this.RentID = RentID;
        this.AccountNum = AccountNum;
        this.ISBN = ISBN;
        this.Username = Username;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BookName = BookName;
        this.RentDate = RentDate;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public String getBookName() {
        return BookName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getLastName() {
        return LastName;
    }

    public String getRentDate() {
        return RentDate;
    }

    public int getRentID() {
        return RentID;
    }

    public String getUsername() {
        return Username;
    }

}
