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
    private String Name, Edition, Publisher, Pages, Author, PricePerWeek;

    public Book(int ISBN, String Name, String Edition, String Publisher, String Pages, String Author, String PricePerWeek) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Edition = Edition;
        this.Author = Author;
        this.Pages = Pages;
        this.Publisher = Publisher;
        this.PricePerWeek = PricePerWeek;
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

    public String getPricePerWeek() {
        return PricePerWeek;
    }

    public String getPublisher() {
        return Publisher;
    }
    
    

}
