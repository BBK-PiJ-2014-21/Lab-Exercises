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
        l.setMaxBookPolicy(2);
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
    
    @Test 
    public void testEmptyBorrowingList() {
        Library l = getAlibrary();
        User user = new UserImpl("Jimmy");
        user.register(l);
        assertEquals(l.getBorrowingUsersList().size(), 0);
    }
    
    @Test
    public void testUsersListBorrowingListOneBorrowerTwoBooks() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        l.addBook("Book2", "Author2");
        User user = new UserImpl("Timmy");
        user.register(l);
        user.takeBook("Book1");
        user.takeBook("Book2");
        assertEquals(l.getUsersList().size(), l.getBorrowingUsersList().size());
        assertEquals(l.getBorrowingUsersList().get(0), user);
    }
    
    @Test
    public void testUsersListAndBorrowingListTwoBorrowers() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        l.addBook("Book2", "Author2");
        User user1 = new UserImpl("Timmy");
        user1.register(l);
        User user2 = new UserImpl("Jimmy");
        user2.register(l);
        user1.takeBook("Book1");
        user2.takeBook("Book2");
        assertEquals(l.getBorrowingUsersList().get(1), user2);
    }
    
    @Test
    public void testGetBorrowerNull() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        User user1 = new UserImpl("Tim");
        user1.register(l);
        assertNull(l.getBorrower("Book1"));
    }
    
    @Test
    public void testGetBorrower() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        User user1 = new UserImpl("Tim");
        user1.register(l);
        user1.takeBook("Book1");
        assertEquals(l.getBorrower("Book1"), "Tim");
    }
    
    @Test
    public void testListOfOutOfPolicyUsers() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        l.addBook("Book2", "Author2");
        l.addBook("Book3", "Author3");
        User user1 = new UserImpl("Jim");
        User user2 = new UserImpl("Rod");
        User user3 = new UserImpl("Tod");
        user1.register(l);
        user2.register(l);
        user3.register(l);
        user1.takeBook("Book1");
        user2.takeBook("Book2");
        user1.takeBook("Book3");
        user1.takeBook("Book2");
        assertEquals(l.setMaxBookPolicy(3).size(), 0);
        l.setMaxBookPolicy(0);
    }
    
    @Test
    public void testListOfOutOfPolicyChangedToZero() {
        Library l = getAlibrary();
        l.addBook("Book1", "Author1");
        l.addBook("Book2", "Author2");
        l.addBook("Book3", "Author3");
        User user = new UserImpl("Tim");
        user.register(l);
        User user2 = new UserImpl("Jim");
        User user3 = new UserImpl("John");
        user2.register(l);
        user3.register(l);
        user.takeBook("Book1");
        user.takeBook("Book2");
        user2.takeBook("Book3");
        assertEquals(l.setMaxBookPolicy(0).size(), 2);
        
    }
    
    
}

