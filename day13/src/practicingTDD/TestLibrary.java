package practicingTDD;

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
    
    // TODO finish this method
    @Test
    public void testName() {
        Library l = mock(Library.class);
        assertEquals(l.getName(), "National Library");
    }
    
    // TODO finish this and DO MORE TESTS AGAINST THE INTERFACE NOT THE IMPLEMENTATION
    @Test
    public void testNameAvailability() {
        Library l = new LibraryImpl("Bartholomew's Library", 3);
        UserImpl user = new UserImpl("John");
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
    
}
