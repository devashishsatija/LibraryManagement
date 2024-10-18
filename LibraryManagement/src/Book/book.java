package Book;



public class book {
    private String Title;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    private String Author;
    private String publishYear;
    private boolean isbookAvailable;
    private String isbn;

    public book(String title,String Author,String publishYear) {
        this.Title = title;
        this.Author = Author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public boolean IsbookAvailable() {
        return isbookAvailable;
    }

    public void setIsbookAvailable(boolean isbookAvailable) {
        this.isbookAvailable = isbookAvailable;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
