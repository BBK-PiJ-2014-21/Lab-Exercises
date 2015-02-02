package practicingTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test class for interface {@see User}. It assumes the implementation to be tested is called UserImpl.
 */
public class TestUser {
    private UserImpl user1;
    
    @Before
    public void setUser() {
        user1 = new UserImpl("John Malkovich");
    }
    
    @After
    public void tearDown() {
        user1 = null;
    }
    
    @Test
    public void testGetName() {
        assertEquals(user1.getName(), "John Malkovich");
    }
    
    @Test
    public void testGetIdNotSet() {
        assertEquals(user1.getID(), 0);
    }
    
    @Test
    public void testSetIdGetId() {
        user1.setID(12345);
        assertEquals(user1.getID(), 12345);
    }
    
    
    
}
