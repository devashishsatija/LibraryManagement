package Patron;

import java.util.ArrayList;
import java.util.List;

public class patron {
    private String PatronName;
    private String PatronID;
    List<String> booksborrowed = new ArrayList<>();

    public List<String> getBooksborrowed() {
        return booksborrowed;
    }

    public void setBooksborrowed(List<String> booksborrowed) {
        this.booksborrowed = booksborrowed;
    }

    public String getPatronName() {

        return PatronName;
    }

    public String getPatronID() {

        return PatronID;
    }
    //BORROW BOOKS AND RETURN BOOKS
    public void borrowBook(String isbn) {
        booksborrowed.add(isbn);
    }

    public void returnBook(String isbn) {
        booksborrowed.remove(isbn);
    }


    public void setPatronID(String patronID) {
        this.PatronID = patronID;
    }

    public void setPatronName(String patronName) {
        this.PatronName = patronName;
    }
}
