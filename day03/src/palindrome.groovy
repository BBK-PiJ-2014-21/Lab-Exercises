
System.out.println("Please enter a text: ")
String text = System.console().readLine();
int a = 0;
int z = text.length()-1;
for (a=0; a<z; a++) {
	if (text.charAt(a) != text.charAt(z)) {
		System.out.println("The text is not a strict palindrome.");
		System.exit(0);
	}
z--;
}
System.out.println("The text is a strict palindrome.");