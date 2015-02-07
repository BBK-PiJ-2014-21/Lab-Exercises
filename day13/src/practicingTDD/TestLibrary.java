package practicingTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * JUnit test class for interface {@see Library}.
 * It is assumed the implementation to be tested to be called LibraryImpl. 
 */
public class TestLibrary {
    
    public Library getAlibrary() {
        Library test = new LibraryImpl("Bartholomew's Library", 3);
        return test;
    }
    
    @Test
    public void testName() {
        Library test = getAlibrary();
        assertEquals(test.getName(), "Bartholomew's Library");
    }
    
    @Test
    public void testGetId() {
        Library test = getAlibrary();
        User user = new UserImpl("John");
        user.register(test);
        int id = test.getID("John");
        assertTrue(id > 0);
    }
    
    @Test
    public void testCheckName() {
        Library l = getAlibrary();
        User user = new UserImpl("John");
        user.register(l);
        assertEquals(l.checkName("John"), false);
        assertEquals(l.checkName("Bob"), true);
        }
    
    @Test
    public void testLimitPolicy() {
        Library l = new LibraryImpl("Wee", 3);
        assertEquals(l.getMaxBooksPerUser(), 3);
        l.setMaxBooksPerUser(2);
        assertEquals(l.getMaxBooksPerUser(), 2);
    }
    
    @Test
    public void testAddBookShouldUpdateBookCount() {
        Library l = getAlibrary();
        assertEquals(l.getBookCount(), 0);
        l.addBook("Just a book", "Anonymous");
        assertEquals(l.getBookCount(), 1);
    }
    
    @Test
    public void testTakeBookNotInTheLibrary() {
        Library l = getAlibrary();
        assertNull(l.takeBook("This book is not added to the library"));
    }
    
    @Test
    public void testAddAndTakeBookShouldUpdateTakenBooksCount() {
        Library l = getAlibrary();
        assertEquals(l.getBookBorrowedCount(), 0);
        l.addBook("A Title", "An Author");
        l.takeBook("A Title");
        assertEquals(l.getBookBorrowedCount(), 1);
    }
    
    @Test
    public void testReturnBookShouldUpdateBorrowedCount() {
        Library l = getAlibrary();
        l.addBook("Boo", "Auth");
        assertEquals(l.getBookBorrowedCount(), 0);
        Book book = l.takeBook("Boo");
        assertEquals(l.getBookBorrowedCount(), 1);
        l.returnBook(book);
        assertEquals(l.getBookBorrowedCount(), 0);
    }
    
    @Test
    public void testAddUserShouldUpdateUserCount() {
        Library l = getAlibrary();
        assertEquals(l.getReaderCount(), 0);
        User user = new UserImpl("Jimmy");
        user.register(l);
        assertEquals(l.getReaderCount(), 1);
    }
    
    @Test
    public void testGetUsersList() {
        Library l = getAlibrary();
        User user = new UserImpl("Jimmy");
        user.register(l);
        assertEquals(l.getUsersList().get(0).getName(), "Jimmy");
    }
    
    @Test
    public void testGetBorrowingUsersList() {
        Library l = getAlibrary();
        l.addBook("Super-Cannes", "Ballard");
        User user = new UserImpl("Timmy");
        user.register(l);
        user.takeBook("Super-Cannes");
        assertEquals(l.getBorrower("Super-Cannes"), "Timmy");
        assertEquals(l.getBorrowingUsersList().get(0).getName(), "Timmy");
    }
    
    
}

