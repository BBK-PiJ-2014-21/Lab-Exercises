// 7. Counting letters redux (*)

System.out.print("Please write a text: ");
String text = System.console().readLine();
String letter = "";
String letterCounted = " ";
int n = 0;
int count = 0;
while (true) {
	count = 0;
	System.out.print("Which letter would you like to count now? ");
	letter = System.console().readLine();
	for (n=0; n<letterCounted.length(); n++) {
		if (letter.charAt(0) == letterCounted.charAt(n)) {
			System.out.println("Repeated character. Exiting the program...");
			System.out.println("Thank you for your cooperation. Good bye!");
			System.exit(0);
		}
	}
	letterCounted = letterCounted+letter;
	for (n=0; n<text.length(); n++) {
		if (letter.charAt(0) == text.charAt(n)) {
			count++;
		}
	}
	System.out.println("There are " + count + " in your text.");
}