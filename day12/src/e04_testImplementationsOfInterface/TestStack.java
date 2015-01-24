package e04_testImplementationsOfInterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import stringStack.ArrayStringStack;
import stringStack.PointerStringStack;
import stringStack.StringStack;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for interface StringStack (Day 8, package stringStack)
 */
@RunWith(Parameterized.class)
public class TestStack {
    private StringStack stack;
    
    public TestStack(StringStack stack) {
        this.stack = stack;
    }
    /**
     * Testing two implementations given in the notes (ArrayStringStack and PointerStringStack)
     */
    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
            {new ArrayStringStack()},
            {new PointerStringStack()}
        });
    }
    /**
     * Testing method isEmpty() on empty Stack: both implementations passed the test
     */
    @Test
    public void testEmpty() {
        assertTrue("Stack is not empty", stack.isEmpty());
    }
    /**
     * Pushing a String and peeking at it: both implementations passed the test.
     */
    @Test
    public void pushAndPeek() {
        stack.push("Test");
        assertEquals("Should peek \"Test\"", stack.peek(), "Test");
        stack.pop();
    }
    /**
     * Ten push, ten pull: comparing each String;
     * then peeking at empty stack: both implementations passed the test.
     */
    @Test
    public void pushAndPop() {
        String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String errorMessage = "";
        for(int i=0; i<numbers.length; i++) {
            errorMessage = ("Should pop " + numbers[i]);
            stack.push(numbers[i]);
        }
        for(int i=numbers.length-1; i>=0; i--) {
            assertEquals(errorMessage, stack.pop(), numbers[i]);
        }
        stack.peek();
        assertTrue("Should be empty", stack.isEmpty());
    }
}