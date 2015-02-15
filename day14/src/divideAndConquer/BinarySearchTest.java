package divideAndConquer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class BinarySearchTest {
    private BinarySearch b;
    private List<Integer> list;

    @Before
    public void setUp() {
        b = new BinarySearch();
        list = new ArrayList<>();
    }
    
    @After
    public void tearDown() {
        b = null;
    }
    
    public static List<Integer> createNevenNumbersList(int n) {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 2; i <= n; i = i + 2) {
            list.add(i);
        }
        return list;
    }
    
    @Test
    public void testElementInEmptyList() {
        assertFalse(b.binarySearch(list, 1));
    }
    
    @Test
    public void testElementNotInTheList() {
        list = createNevenNumbersList(10);
        assertFalse(b.binarySearch(list, 3));
    }
    
    @Test
    public void testElementInTheList() {
        List<Integer> list = new ArrayList<>();
        int i=2;
        while(i<10) {
            list.add(i);
            i = i+2;
        }
        assertTrue(b.binarySearch(list, 4));
    }
    
    @Test
    public void testLastElementInA100ElementsList() {
        list = createNevenNumbersList(100);
        assertTrue(b.binarySearch(list, 100));
    }
    
    public static void printList(List<Integer> list) {
        for(Integer i : list) {
            System.out.println(i);
        }
    }
    
}
