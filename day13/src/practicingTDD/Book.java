package practicingTDD;

/**
 * Interface for Books.
 * Books have authors and titles.
 * Implementation have getters for both authors and titles but not setters,
 * as this kind of Object is immutable: fields must be set at construction time 
 * and not modifiable afterwards.
 */
public interface Book {
    /**
	 * Getter for the author of the Book
     * 
	 * @return	the name of the author of the Book 
	 */
	public String getAuthor();
	/**
	 * Getter for the title of the Book
     * 
	 * @return	the title of the Book
	 */
	public String getTitle();
    /**
     * Set the book as taken by/returned from a Library.
     * 
     * @param value the boolean value true if the book is currently taken by a Library, false otherwise.
     */
    public void setTaken(boolean value);
    /**
     * Return whether the Book is currently taken by a Library or if it's available.
     */
    public boolean isTaken();
}