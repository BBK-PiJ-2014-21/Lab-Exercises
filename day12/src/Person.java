/**
 * Class created in the notes (Day 12 - Software Testing)
 * Exercise 3 - Practice "Find bugs once"
 * to be tested with JUnit (class PersonTest)
 */
public class Person {

	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.trim().split(" +");	// '+' added to fix multiple spaces bug
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(" ")) {
				String nextInitial = "" + words[i].charAt(0);
				result = result + nextInitial.toUpperCase();
			}
		}
		return result;
	}
	
}

