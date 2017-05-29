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
public class Book {

    private int ISBN;
    private String ISBN2, Name, Edition, Publisher, Pages, Author;

    public Book() {
    }

    
    
    public Book(int ISBN, String Name, String Edition, String Publisher, String Pages, String Author) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Edition = Edition;
        this.Author = Author;
        this.Pages = Pages;
        this.Publisher = Publisher;

    }

    public Book(String ISBN2, String Name, String Edition, String Publisher, String Pages, String Author) {
        this.ISBN2 = ISBN2;
        this.Name = Name;
        this.Edition = Edition;
        this.Publisher = Publisher;
        this.Pages = Pages;
        this.Author = Author;
        this.ISBN = Integer.parseInt(ISBN2);

    }

    public int getISBN() {
        return ISBN;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getEdition() {
        return Edition;
    }

    public String getPages() {
        return Pages;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPages(String Pages) {
        this.Pages = Pages;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getISBN2() {
        setISBN(Integer.parseInt(ISBN2));
        return ISBN2;
    }

    public void setISBN2(String ISBN2) {
        this.ISBN2 = ISBN2;
    }
    
     public int getISBNtoInt(){
        int newISBN;
        newISBN = Integer.parseInt(ISBN2);
        return newISBN;
    }

}
