package practicingTDD;

/**
 * Class used as a base for the internal data structure of the Library database.
 */
public class UserName {
    private String name;
    private int ID;
    private UserName next;
    
    public UserName(String name) {
        this.name = name;
        ID = -1;    // to state that the id is not assigned yet.
        next = null;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }
    
    public UserName getNext() {
        return next;
    }
    
    public void setNext(UserName next) {
        this.next = next;
    }
    /**
     * This method calculates an unique ID-number out of the username String provided.
     * (It assigns a number for each letter, being each username unique, same will be for 
     * the number generated).
     *  
     * @param name the username of the user.
     * @return an unique ID-number generated out of the username.
     */
    public int calculateID(String name) {
        String value = "";
        String n = name.toLowerCase();
        for(int i=0; i<n.length(); i++) {
            value = value + (n.charAt(i) - 'Z');
        }
        value = value.substring(0,8); // to avoid NumberFormatException for large outputs
        ID = Integer.parseInt(value);
        return ID;
    }
}
