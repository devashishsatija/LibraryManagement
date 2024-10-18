package Patron;

import Book.InventoryManagement.InventoryMgmt;
import Book.book;

import java.util.HashMap;
import java.util.Map;

public class LendingService {
    private InventoryMgmt Inventory;
    private Map<String, patron> patrons = new HashMap<>();

    public LendingService(InventoryMgmt Inventory) {
        this.Inventory = Inventory;
    }
    //Add Patron
    public void addpatron(patron patron){
        patrons.put(patron.getPatronID(),patron);
    }


    //CheckoutBook
    public boolean checkoutBook(String isbn, patron patron){
        book book = Inventory.SearchBook(isbn);
        patron Patron = patrons.get(patron.getPatronID());

        if(book != null && Patron != null){
            book.setIsbookAvailable(true);
            Patron.borrowBook(isbn);
            return true;
        }
        return false;
    }

    //ReturnBook
    public boolean returnbook(String isbn, String PatronID){
        book book = Inventory.SearchBook(isbn);
        patron patron = patrons.get(PatronID);
        if (book != null && patron !=null ){
            book.setIsbookAvailable(true);
            patron.returnBook(isbn);
            return true;
        }
        return false;




    }



}
