// 5. Counting letters

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

