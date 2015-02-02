package practicingTDD;
/**
 * Just a basic interface to test UserImpl with Mockito
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
    

}
