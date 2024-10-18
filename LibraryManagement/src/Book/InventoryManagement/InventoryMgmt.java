package Book.InventoryManagement;

import Book.book;

import java.util.ArrayList;
import java.util.List;

public class InventoryMgmt {
    private List<book> books = new ArrayList<>();

    public void addBook(book Keepbook) {
        books.add(Keepbook);
    }
    public void RemoveBook(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));

    }
    public book SearchBook(String Query){
        for(book book: books) {
            if (book.getTitle().contains(Query) || book.getAuthor().contains(Query))
                return book;
        }
        return null;
    }
}




