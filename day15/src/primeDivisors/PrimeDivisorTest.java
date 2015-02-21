package primeDivisors;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * TDD for interface {@see PrimeDivisor}. 
 * This tests assume the implementation name to be PrimeDivisorList.
 * As per interface, this tests assume also the numbers to be stored already sorted after add() method.
 */
public class PrimeDivisorTest {
    private PrimeDivisor p;
    
    @Before
    public void init() {
        p = new PrimeDivisorList();
    }
    
    @After
    public void tearDown() {
        p = null;
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddPrimeNumberShouldReturnTrue() {
        assertTrue(p.add(3));
    }
    
    @Test
    public void testRemovePrimeNumberShouldReturnTrue() {
        p.add(5);
        assertTrue(p.remove(5));
    }
    
    @Test
    public void testRemoveNullShouldReturnFalse() {
        p.add(5);
        assertFalse(p.remove(null));
    }
    
    @Test
    public void testRemoveValueNotInTheListShouldReturnFalse() {
        assertFalse(p.remove(5));
    }
    
    @Test
    public void testAddPrimeNumberToString() {
        p.add(2);
        assertEquals(p.toString(), "[ 2 ]");
    }
    
    @Test
    public void testAddNullShouldThrowNullPointerException() {
        exception.expect(NullPointerException.class);
        p.add(null);
    }
    
    @Test
    public void testAddNotPrimeShouldThrowIllegalArgumentException() {
        exception.expect(IllegalArgumentException.class);
        p.add(4);
    }
    
    @Test
    public void testAddNegativeValueShouldThrowIllegalArgumentException() {
        exception.expect(IllegalArgumentException.class);
        p.add(-2);
    }
    
    @Test
    public void testAddFourPrimesAndRemoveEdgesToString() {
        p.add(2);
        p.add(7);
        p.add(3);
        p.add(11);
        p.remove(11);
        p.remove(2);
        assertEquals(p.toString(), "[ 3 * 7 = 21 ]");
    }

    @Test
    public void testDuplicates() {
        p.add(3);
        p.add(2);
        p.add(2);
        assertEquals(p.size(), 3);
    }
    
    @Test
    public void testDuplicatesToString() {
        p.add(2);
        p.add(2);
        p.add(3);
        assertEquals(p.toString(), "[ 2^2 * 3 = 12 ]");
    }
    
    @Test
    public void testEmptyListToString() {
        p.add(2);
        p.remove(2);
        assertEquals(p.toString(), "[ ]");
    }
    
    @Test
    public void testAddMultipleValuesAndRemoveValueNotInTheListShouldBeIgnored() {
        p.add(2);
        p.add(3);
        p.add(3);
        p.add(3);
        p.remove(7);
        assertEquals(p.size(), 4);
    }
    
    @Test
    public void testAddMultipleValuesAndRemoveValueNotInTheListShouldBeIgnoredToString() {
        p.add(2);
        p.add(3);
        p.add(3);
        p.add(7);
        p.remove(8);
        assertEquals(p.toString(), "[ 2 * 3^2 * 7 = 126 ]");
    }
    
}
