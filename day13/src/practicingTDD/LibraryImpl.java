package practicingTDD;

import java.util.LinkedList;
import java.util.List;

/**
 * Class implementing the interface {@see Library}.
 */
public class LibraryImpl implements Library {
    private String name;
    private int limit;
    private UserName first;
    private List<Book> shelf;
    private int userCount;
    private int borrowedCount;
    /**
     * Constructor for the Library. It has a field for the name, a field for the maximum number 
     * of books that can be borrowed per person (this can be changed later with a setter if needed),
     * and a Linked-List as internal data structure to have a database of {@see UserName}, which would 
     * be the users of the library. The class UserName will implement the ID-creation and data about the 
     * users of the library.
     * The List of Books uses a java.util LinkedList to keep a list of Books belonging to the Library.
     * When any changes occur (user registration, book borrowed) the relevant count field 
     * (userCount, borrowedCount) is updated.
     * 
     * @param name the name of the library.
     * @param limit the maximum number of books that can be borrowed per person.
     */
    public LibraryImpl(String name, int limit) {
        this.name = name;
        this.limit = limit;
        first = null;
        shelf = new LinkedList<Book>();
        userCount = 0;
        borrowedCount = 0;
    }
    /**
     * {@inheritDoc}
     *  
     * @return the name of the Library.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * {@inheritDoc}
     *
     * This method will check if the username is already taken, in which case it will return false,
     * and the registration will be unsuccessful, otherwise the new user will be updated on the Library database,
     * and given an ID number -1 (to state that is not assigned) {@see UserName} yet. 
     *
     * @param newUser the name of the user applying for registration.
     * @return true if the username is available, false otherwise.
     */ 
    @Override
    public boolean checkName(String newUser) {
        if(first==null) {
            first = new UserName(newUser);
            userCount++;
            return true;
        } else {
            if(first.getName().equals(newUser)) {
                return false;
            } else {
                UserName aux = first;
                while(aux.getNext()!=null) {
                    if(aux.getName().equals(newUser)) {
                        return false;
                    }
                    aux = aux.getNext();
                }
                aux.setNext(new UserName(newUser));
                userCount++;
                return true;
            }
        }
    }
    /**
     * Get the ID of the user of the Library if already assigned, otherwise it will assign one.
     * It can be called from the {@see UserImpl} method when a Library field is added to that
     * user (i.e. after a successful registration, so the username will already be in the database 
     * as method checkName(newUser) would already have been called).
     *  
     * @param user the user of the Library.
     * @return the user's unique ID-number.
     */
    @Override
    public int getID(String user) {
        int id = 0;
        if(first.getName().equals(user)) {
            id = first.getID();
            if(id==-1) {
                id = first.calculateID(user);
            }
        } else {
            UserName aux = first;
            while(aux.getNext()!=null) {
                if(aux.getName().equals(user)) {
                    id = aux.getID();
                    if(id == -1) {
                        id = aux.calculateID(user);
                    }
                }
                aux = aux.getNext();
            }
        }
        return id;
    }
    /**
     * {@inheritDoc}
     *  
     * @param limit
     */
    @Override
    public void setMaxBooksPerUser(int limit) {
        this.limit = limit;
    }
    /**
     * {@inheritDoc}
     *
     * @return the maximum number of books that can be borrowed by the users.
     */
    @Override
    public int getMaxBooksPerUser() {
        return limit;
    }
    /**
     * {@inheritDoc} 
     * 
     * @param title the title of the new Book.
     * @param author the author of the new Book.
     */
    @Override
    public void addBook(String title, String author) {
        Book newBook = new BookImpl(title, author);
        shelf.add(newBook);
    }
    /*
     * {@inheritDoc} 
     * 
     */
    @Override
    public Book takeBook(String title) {
        for(int i=0; i<shelf.size(); i++) {
            if (shelf.get(i).getTitle().equals(title)) {
                Book bookToTake = shelf.get(i);
                if (bookToTake.isTaken()) {
                    return null;
                } else {
                    bookToTake.setTaken(true);
                    borrowedCount++;
                    return bookToTake;
                }
            }
        }
        System.out.println("This book is not yet part of this Library.");
        return null;
    }
    /**
     * {@inheritDoc}
     *  
     * @param book the book to be returned from the Library.
     */
    @Override
    public void returnBook(Book book) {
        book.setTaken(false);
        borrowedCount--;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int getReaderCount() {
        return userCount;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int getBookCount() {
        return shelf.size();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int getBookBorrowedCount() {
        return borrowedCount;
    }
    
    
}
