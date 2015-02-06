package practicingTDD;

/**
 * Class implementing the interface {@see Book}
 */
public class BookImpl implements Book {
    private String title;
    private String author;
    private boolean taken;
    
    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
        taken = false;
    }
    /**
     * {@inheritDoc}
     *  
     * @return
     */
    @Override
    public String getAuthor() {
        return author;
    }
    /**
     * {@inheritDoc} 
     * 
     * @return
     */
    @Override
    public String getTitle() {
        return title;
    }
    /**
     * {@inheritDoc}
     *   
     * @param value the boolean value true if the book is currently taken by a Library, false otherwise.
     */
    @Override
    public void setTaken(boolean value) {
        taken = value;
    }
    /**
     * {@inheritDoc} 
     * 
     * @return
     */
    @Override
    public boolean isTaken() {
        return taken;
    }
}
