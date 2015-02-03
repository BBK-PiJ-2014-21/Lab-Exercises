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
    

}
