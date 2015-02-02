package practicingTDD;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test class for interface {@see Book}
 * This tests are built for a constructor which takes the String for the title first and for the author next. 
 */
public class TestBook {
    
    @Test
    public void testGetAuthor() {
        Book book1 = new BookImpl("The Portrait of Dorian Gray", "Oscar Wilde");
        assertEquals(book1.getAuthor(), "Oscar Wilde");
    }
    
    @Test
    public void testGetTitle() {
        Book book1 = new BookImpl("The Portrait of Dorian Gray", "Oscar Wilde");
        assertEquals(book1.getTitle(), "The Portrait of Dorian Gray");
    }
    
}
