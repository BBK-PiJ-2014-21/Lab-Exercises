package practicingTDD;

/**
 * Class implementing the interface {@see Book}
 */
public class BookImpl implements Book {
    private String title;
    private String author;
    
    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
}
