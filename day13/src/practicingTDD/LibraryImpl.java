package practicingTDD;

import java.util.ArrayList;
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
    private List<User> usersList;
    private List<User> borrowingUsersList;
    private ArrayList<User> outOfPolicy;
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
        usersList = new LinkedList<User>();
        borrowingUsersList = new LinkedList<User>();
        outOfPolicy = new ArrayList<User>();
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
     * This method does not fill the library UsersList list, as it knows only the String name of the user;
     * it will be the registration routine in UserImpl in charge to add the registered User to UsersList.
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
    public ArrayList<User> setMaxBookPolicy(int limit) {
        this.limit = limit;
        for(int i=0; i<getBorrowingUsersList().size(); i++) {
            if(getBorrowingUsersList().get(i).listBorrowed().size()>limit) {
                outOfPolicy.add(getBorrowingUsersList().get(i));
            }
        }
        return outOfPolicy;
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
    /**
     * {@inheritDoc}
     * 
     * @param title the title of the book to be taken
     * @return the book if successfully taken, null if currently not available.
     */
    @Override
    public Book takeBook(String title) {
        for(int i=0; i<shelf.size(); i++) {
            if(shelf.get(i).getTitle().equals(title)) {
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
     * 
     * @return the number of users of the library. 
     */
    @Override
    public int getReaderCount() {
        return userCount;
    }
    /**
     * {@inheritDoc}
     * 
     * @return the total number of books in the library, both available and taken.
     */
    @Override
    public int getBookCount() {
        return shelf.size();
    }
    /**
     * {@inheritDoc}
     * 
     * @return the number of books currently on borrow. 
     */
    @Override
    public int getBookBorrowedCount() {
        return borrowedCount;
    }
    /**
     * {@inheritDoc}
     *   
     * @return a list of all the users of the library who are currently borrowing books.
     */
    @Override
    public List<User> getBorrowingUsersList() {
        return borrowingUsersList;
    }
    /**
     * {@inheritDoc} 
     * 
     * @return a list of all the users of the library.
     */
    @Override
    public List<User> getUsersList() {
        return usersList;
    }
    /**
     * {@inheritDoc} 
     * 
     * This method check all the users in the list borrowingUserList, checking every book currently borrowed 
     * by each user (this method is implemented in the User interface). It might be not efficient for large 
     * libraries with a lot of users and/or books. 
     * 
     * @param title the title of the {@see Book} of the Library.
     * @return the name of the {@see User} who is borrowing the book, or null if either the book
     * doesn't belong to the library or if it's not taken. 
     */
    @Override
    public String getBorrower(String title) {
        for(int i = 0; i < shelf.size(); i++) {
            if(shelf.get(i).getTitle().equals(title)) {
                if(shelf.get(i).isTaken()) {
                    for (int j = 0; j < borrowingUsersList.size(); j++) {
                        int k = borrowingUsersList.get(j).listBorrowed().size() - 1;
                        while (k >= 0) {
                            if (borrowingUsersList.get(j).listBorrowed().get(k).equals(title)) {
                                return borrowingUsersList.get(j).getName();
                            } else {
                                k--;
                            }
                        }
                    }
                }
            }
        }
    return null;
    }
    
}
