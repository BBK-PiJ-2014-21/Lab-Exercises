
System.out.print("Please enter a short string: >> ");
String shortString = System.console().readLine();
System.out.print("Please enter some longer text: >> ");
String longerText = System.console().readLine();
int n = 0;						// to search charAt() through longerText 
int x = 1;						// to search charAt() through shortString
int y = 0;						// to search charAt() through longerText after first match
int count = 0;
for (n=0; n<longerText.length(); n++) {
	if (longerText.charAt(n) == shortString.charAt(0)) {
			x = 1;
			y = n+1;
				for (x=1; x<shortString.length(); x++) {
					if (shortString.charAt(x) != longerText.charAt(y)) {
						break;
					}
				y++;
				}
		if (x == shortString.length()) {
			count++;
		}
	}
}
System.out.println("You entered the string \"" + shortString + "\" " + count + " times.");
