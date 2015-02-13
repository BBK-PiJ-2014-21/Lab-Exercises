package practicingTDD;

import java.util.List;

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
     * 
     * @param library the Library the user is applying for registration.
     * @return true if the ID is correctly assigned, false otherwise (i.e. the username is already used)
     */
    public boolean setID(Library library);
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
     * @return true if the registration is successful, false otherwise.                
     */
    public boolean register(Library library);
    /**
     * Getter for the library the user is registered at.
     *
     * @return the library the user is registered at.
     */
    public String getLibrary();
    /**
     * An arraylist with the titles of the books currently borrowed by the user.
     *
     * @return a list of the titles of the books currently borrowed.
     */
    public List<String> listBorrowed();
    /**
     *  
     * @param title
     */
    public boolean takeBook(String title);
    /**
     * * 
     */
    public boolean returnBook(String title);
    
}
