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
}