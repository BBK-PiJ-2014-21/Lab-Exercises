
System.out.print("Please enter a text: ");
String text = System.console().readLine();
int n;
System.out.print(text);
for (n=text.length()-1; n>=0; n--) {
		System.out.print(text.charAt(n));
}


