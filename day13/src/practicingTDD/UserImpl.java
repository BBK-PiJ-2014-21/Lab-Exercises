package practicingTDD;

/**
 * Class implementing the interface {@see User}
 */
public class UserImpl implements User {
    private String name;
    private int id;
    private Library library;
    
    public UserImpl(String name) {
        this.name = name;
        library = null;
    }
    
    public String getName() {
        return name;
    }

    public int getID() {
        return library.getID(name);
    }
    
    public void setID() {
        id = library.getID(name);
    }
 
    public void register(Library library) {
        this.library = library;
        setID();
    }
    // TODO NullPointerException if call a null library
    public String getLibrary() {
        return library.getName();
    }
    
    
}
