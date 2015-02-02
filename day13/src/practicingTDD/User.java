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
     * 
     * @param id the library-ID associated with the name.
     */
    public void setID(int id);
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

}
