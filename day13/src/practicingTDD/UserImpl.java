package practicingTDD;

/**
 * Class implementing the interface {@see User}.
 */
public class UserImpl implements User {
    private String name;
    private Library library;
    
    public UserImpl(String name) {
        this.name = name;
        library = null;
    }
    
    public String getName() {
        return name;
    }

    // TODO NullPointerException if it calls a null library
    public int getID() {
        return library.getID(name);
    }
    
    public boolean setID(Library library) {
        if(library==null || !this.library.equals(library)) {
            return false;
        } else {
            library.getID(name);
            return true;
        }
    }
 
    public boolean register(Library library) {
        if(!library.checkName(name)) {
            System.out.println("Registration unsuccessful. Please try providing a different username.");
            return false;
        } else {
            this.library = library;
            return true;
        }
    }

    public String getLibrary() {
        if(library == null) {
            return "<not registered>";
        } else {
            return library.getName();
        }
    }
    
}
