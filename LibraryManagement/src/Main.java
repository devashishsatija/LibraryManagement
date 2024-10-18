import Book.InventoryManagement.InventoryMgmt;
import Book.book;

public class Main {
    public static void main(String[] args) {
        InventoryMgmt InMgmt = new InventoryMgmt();
        //List Of Books
        book Book1 = new book("FamousFive","Jk","2003");
        InMgmt.addBook(Book1);
        book Book2 = new book("Murder On the Train","Agatha Christie","1997");
        InMgmt.addBook(Book2);
        book Book3 = new book("Fundamentals Of Maths by RD Sharma","RD Sharma","2003");
        InMgmt.addBook(Book3);
        book Book4 = new book("Secret Seven","Jk","2003");
        InMgmt.addBook(Book4);
        book Book5 = new book("Harry Potter","Jk","2003");
        InMgmt.addBook(Book5);
        book Search = InMgmt.SearchBook("Secret");
        if ( Search.getTitle() != null ){
            System.out.println(Search.getTitle());
        }

    }
}