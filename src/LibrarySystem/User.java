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
public class User {
    
    private String Username, FirstName, LastName, UserType;

    public User(String Username, String FirstName, String LastName,String UserType) {
        this.Username = Username;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserType = UserType;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUserType() {
        return UserType;
    }

    public String getUsername() {
        return Username;
    }
    
    
    
}
