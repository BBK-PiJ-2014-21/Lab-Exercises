import org.junit.*;
import static org.junit.Assert.*;
/**
 * JUnit tests for class Person (Exercise 3 - Practice "Find bugs once")
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
	 * Method which tests a String with two spaces between names: originally failed
	 * java.lang.StringIndexOutOfBoundsException: String index out of range: 0
	 * added " +" to split() to handle multiple spaces: passed the test successfully.
	 */
	@Test
	public void testMultipleSpaces() {
		Person p = new Person();
		String input = "Tom W.  OhTwoSpaces";
		String output = p.getInitials(input);
		String expected = "TWO";
		assertEquals(output, expected);
	}
	/**
	 * Method which tests a String which begins with spaces: originally failed
	 * java.lang.StringIndexOutOfBoundsException: String index out of range: 0
	 * added trim() to split() method to trim initial spaces: passed the test successfully.
 	 */
	@Test
	public void testInitialSpaces() {
		Person p = new Person();
		String input = "   Three Initial Spaces  plus BLABLABLA";
		String output = p.getInitials(input);
		String expected = "TISPB";
		assertEquals(output, expected);
	}

}


	