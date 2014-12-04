/* 5. Counting letters

--------------------------------------------------------------------------

System.out.println("Please enter some text: ");
String s = System.console().readLine();
int count = 0;
int n = 0;
for (n=0; n<s.length(); n++) {
	char search = s.charAt(n);
	if (search == 'e') {
		count++;
	}
}
System.out.println("In this text there are " + count + " letters 'e'");

--------------------------------------------------------------------------

*/

System.out.println("Please enter some text: ");
String s = System.console().readLine();
System.out.println("Which letter would you like me to search?"); 
System.out.print("(only the first letter will be considered) >> ");
String letterString = System.console().readLine();
char letter = letterString.charAt(0);
int n = 0;
int count = 0;
for (n=0; n<s.length(); n++) {
	char search = s.charAt(n);
		if (search == letter) {
			count++;
		}
}
System.out.println("In this text there are " + count + " letters '" + letter + "'");