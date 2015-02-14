package practicingTDD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class implementing the interface {@see User}.
 */
public class UserImpl implements User {
    private String name;
    private Library library;
    private List<Book> borrowed;
    
    public UserImpl(String name) {
        this.name = name;
        library = null;
        borrowed = new ArrayList<Book>();
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
            this.library.getUsersList().add(this);
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
        List<String> TitlesBorrowed = new LinkedList<String>();
        for(int i=0; i<borrowed.size(); i++) {
            TitlesBorrowed.add(borrowed.get(i).getTitle());
        }
        return TitlesBorrowed;
    }

    public boolean takeBook(String title) {
        if(library==null) {
            return false;
        } else {
            Book book = library.takeBook(title);
            if(book==null) {
                return false;
            } else if (library.getMaxBooksPerUser()<=borrowed.size()) {
                library.returnBook(book);
                return false;
            } else {
                borrowed.add(book);
                boolean alreadyListed = false;
                for(int i=0; i<library.getBorrowingUsersList().size(); i++) {
                    if(library.getBorrowingUsersList().get(i).getName().equals(getName())) {
                        alreadyListed = true;
                    }
                }
                if(!alreadyListed) {
                    library.getBorrowingUsersList().add(this);
                }
                return true;
            }
        }
    }    
    
    public boolean returnBook(String title) {
        if (library == null) {
            return false;
        } else {
            boolean toReturn = false;
            for(int i=0; i<borrowed.size(); i++) {
                if(borrowed.get(i).getTitle().equals(title)) {
                    library.returnBook(borrowed.get(i));
                    borrowed.remove(i);
                    toReturn = true;
                    if(borrowed.isEmpty()) {
                        for(int j=0; j<library.getBorrowingUsersList().size(); j++) {
                            if(library.getBorrowingUsersList().get(j).equals(this)) {
                                library.getBorrowingUsersList().remove(j);
                            }
                        }
                    }
                }
            }
            return toReturn;
        }
    }

}

    
