// Palindrome redux (*)

System.out.println("Please enter your text: ");
String s = System.console().readLine();
int a = 0;
int b = s.length()-1;
int count = 0;
for (a=0; a<s.length(); a++) {
	char letter = s.charAt(a);
	boolean isLetter = Character.isLetter(letter);
	char letterBackwards = s.charAt(b);
	boolean isLetterBackwards = Character.isLetter(letterBackwards);
	while (!isLetter) {
		a++;
		letter = s.charAt(a);
		isLetter = Character.isLetter(letter);
	}
	letter = Character.toLowerCase(letter);
	while(!isLetterBackwards) { 
		b--
		letterBackwards = s.charAt(b);
		isLetterBackwards = Character.isLetter(letterBackwards);
	}
	letterBackwards = Character.toLowerCase(letterBackwards);
	if (a==b) {
		if (count == 0) {
			System.out.println("The text is not a relaxed palindrome");
			System.exit(0);
		} else {
			break;
		}
	}
	if (letter != letterBackwards) {
		System.out.println("The text is not a relaxed palindrome");
		System.exit(0);
	} else {
		b--;
		count++
	}
}
System.out.println("The text is a relaxed palindrome.")	
		
	