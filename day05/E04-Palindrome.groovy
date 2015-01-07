// 4. Palindrome

boolean isPalindrome(String s) {
	s = s.toUpperCase();
	if (s.length() <= 1) {
		return true;
	} else {
		if (s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1,s.length()-1));
		}
	}
	return false;
}

System.out.print("Enter a text >> ");
String s = System.console().readLine();
String result = (isPalindrome(s)) ? "" : "not ";
System.out.println("'" + s + "'" + " is " + result + "a relaxed palindrome.");