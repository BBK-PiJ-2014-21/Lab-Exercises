import org.junit.*;
import static org.junit.Assert.*;
/**
 * JUnit test for class Person (Exercise 3 - Practice "Find bugs once")
 *
 */
public class PersonTest {
	/**
	 * Method provided in the notes: passed the test successfully.
	 */
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	/**
	 * Method which tests a String with two spaces between names:
	 * it fails (StringIndexOutOfBoundsException: String index out of range: 0)
	 */
	@Test
	public void testMultipleSpaces() {
		Person p = new Person();
		String input = "Tom W.  OhTwoSpaces";
		String output = p.getInitials(input);
		System.out.println(output);
		String expected = "TWO";
		assertEquals(output, expected);
	}
	
}


	