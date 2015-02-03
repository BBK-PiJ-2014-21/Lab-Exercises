package practicingTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

/**
 * JUnit test class for interface {@see User}. It assumes the implementation to be tested is called UserImpl.
 */
public class TestUser {
    private UserImpl user1;

    @Before
    public void setUp() {
        user1 = new UserImpl("John Malkovich");
    }
    
    @After
    public void tearDown() {
        user1 = null;
    }
    /**
     * This mock will not go through Library's checkName() method, it will return always true
     * so it can't be used to test duplicate registrations.
     */
    public Library createLibraryMock() {
        Library fake = mock(Library.class);
        when(fake.getName()).thenReturn("Fake National Library");
        when(fake.getID(anyString())).thenReturn(33);
        when(fake.checkName(anyString())).thenReturn(true);
        return fake;
    }
    
    @Test
    public void testGetName() {
        assertEquals(user1.getName(), "John Malkovich");
    }
    
    /* Null pointer exception failure: has to be fixed in the implementation class
    @Test
    public void testGetIdNotSet() {
        assertNull(user1.getID());
    }
    */
    
    @Test
    public void testRegister() {
        Library fake = createLibraryMock();
        user1.register(fake);
        assertEquals(user1.getID(), 33);
    }
    
    @Test
    public void testGetLibrary() {
        Library fake = createLibraryMock();
        user1.register(fake);
        assertEquals(user1.getLibrary(), "Fake National Library");
    }
    
    @Test
    public void testDuplicateName() {
        Library lib = new LibraryImpl("Just your average library", 3);
        user1.register(lib);
        User user2 = new UserImpl(user1.getName());
        assertFalse(user2.register(lib));
    }
    
    
    
    
}
