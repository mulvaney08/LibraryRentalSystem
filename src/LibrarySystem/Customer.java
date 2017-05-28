/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 * @author aaronm
 */
public class Customer {

    private int AccountNum, IBAN, BIC;
    private String FirstName, LastName, AddLine1, AddLine2, DOB;

    public Customer(int AccountNum, String FirstName, String LastName, String AddLine1, String AddLine2, String DOB, int IBAN, int BIC) {
        this.AccountNum = AccountNum;
        this.IBAN = IBAN;
        this.BIC = BIC;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AddLine1 = AddLine1;
        this.AddLine2 = AddLine2;
        this.DOB = DOB;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public String getAddLine1() {
        return AddLine1;
    }

    public String getAddLine2() {
        return AddLine2;
    }

    public String getDOB() {
        return DOB;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getBIC() {
        return BIC;
    }

    public int getIBAN() {
        return IBAN;
    }

}
