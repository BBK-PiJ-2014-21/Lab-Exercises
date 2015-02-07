package practicingTDD;
/**
 * Interface for the Library. It has a name to be set at construction time,
 * and a "maximum number of books borrowed by the same person" policy which
 * can be updated at any time.  
 *  
 */
public interface Library {
    /**
     * Getter for the name of the library.
     *  
     * @return the name of the library.
     */
    public String getName();
    /**
     * Return the ID-number of the user of the library.
     * If the @param UserName is not registered yet, a new unique ID will be created. 
     * After that, this method will just return the same number.
     * 
     * @param userName the name of the user which is registering (or already registered).
     * @return a unique number-ID for the user of the library (the @param UserName)
     */
    public int getID(String userName);
    /**
     * Checks if the name is available to be registered to the Library.
     *
     * @param name the name to be registered to the Library.
     * @return true if the name is available, false otherwise.
     */
    public boolean checkName(String name);
    /**
     * Setter for the maximum number of books that can be borrowed by the same person.
     * It has to be set first at construction time. 
     */
    public void setMaxBooksPerUser(int n);
    /**
     * Getter for the maximum number of books that can be borrowed by the same person.
     * 
     * @return the maximum number of books as per Library policy.
     */
    public int getMaxBooksPerUser();
    /**
     * Adds a new Book to the list of Books of the library.
     * 
     * @param title the title of the new Book.
     * @param author the author of the new Book.
     */
    public void addBook(String title, String author);
    /**
     * Check if the Book is taken (in which case it returns null) or available (in which case 
     * it will mark the book as taken and return it).
     * 
     * @param title the title to be given to the user (if not already taken).
     */
    public Book takeBook(String title);
    /**
     * Marks the book as not taken.
     *
     * @param book the book to be returned from the Library.
     */
    public void returnBook(Book book);
    /**
     * The current number of users of the Library.
     * 
     * @return the number of user registered in the library.
     */
    public int getReaderCount();
    /**
     * The current number of books in the Library.
     * 
     * @return the number of books in the library.
     */
    public int getBookCount();
    /**
     * The current number of borrowed books in the Library.
     *
     * @return the number of borrowed books in the library.
     */
    public int getBookBorrowedCount();
    

}
