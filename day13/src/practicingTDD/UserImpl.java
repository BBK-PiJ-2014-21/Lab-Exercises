package practicingTDD;

import org.mockito.internal.matchers.Null;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing the interface {@see User}.
 */
public class UserImpl implements User {
    private String name;
    private Library library;
    private List<String> borrowed;
    
    public UserImpl(String name) {
        this.name = name;
        library = null;
        borrowed = new ArrayList<String>();
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        if(library==null) {
            System.out.println(getName() + " is not registered with any library.");
            return 0;
        } else {
            return library.getID(name);
        }
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
    
    public List<String> listBorrowed() {
        return borrowed;
    }

    public boolean takeBook(String title) {
        if(library==null) {
            System.out.println(getName() + " is not registered with any library.");
            return false;
        } else {
            Book book = library.takeBook(title);
            if(book==null) {
                return false;
            } else {
                borrowed.add(book.getTitle());
                return true;
            }
        }
    }    

}
