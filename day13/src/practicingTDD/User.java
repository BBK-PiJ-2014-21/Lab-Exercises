package practicingTDD;

/**
 * Interface fo the users of the library.
 * Name and ID must be unique: 
 * Name must be set at construction time, ID number via a setter method.
 */
public interface User {
    /**
     * Setter for the library-ID of the user of the library.
     * All the IDs must be unique numbers.
     * The ID number should be assigned by the library after registration.
     */
    public void setID();
    /**
     * Getter for the name of the user of the library.
     * All the names must be unique. 
     *  
     * @return the name of the user.
     */
    public String getName();
    /**
     * Getter for the library-ID of the user of the library.
     * All the IDs must be unique numbers.
     *  
     * @return the id-number of the user.
     */
    public int getID();
    /**
     * Register the user to a library. 
     * After registration the user should get an ID number from the library.
     * 
     * @param library the library the user is registering at.
     */
    public void register(Library library);
    /**
     * Getter for the library the user is registered at.
     *
     * @return the library the user is registered at.
     */
    public String getLibrary();

}
