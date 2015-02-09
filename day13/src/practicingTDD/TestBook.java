package practicingTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test class for interface {@see Book}.
 * This tests are built for a constructor which takes the String for the title first and for the author next. 
 * It assumes the implementation to be tested to be called BookImpl.
 */
public class TestBook {
    private Book wilde;
    
    @Before
    public void setUp() {
        wilde = new BookImpl ("The Portrait of Dorian Gray", "Oscar Wilde");
    }
    
    @After
    public void tearDown() {
        wilde = null;
    }
    
    @Test
    public void testGetAuthor() {
        assertEquals(wilde.getAuthor(), "Oscar Wilde");
    }
    
    @Test
    public void testGetTitle() {
        assertEquals(wilde.getTitle(), "The Portrait of Dorian Gray");
    }
    
    @Test
    public void testNewBookIsNotTaken() {
        assertFalse(wilde.isTaken());
    }
    
    @Test
    public void testTakenAfterSetTaken() {
        wilde.setTaken(true);
        assertTrue(wilde.isTaken());
    }
    
    @Test
    public void testTakenAfterTwoSetTaken() {
        wilde.setTaken(true);
        wilde.setTaken(false);
        assertFalse(wilde.isTaken());
    }
    
    
}
