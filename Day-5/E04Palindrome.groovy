// 4. Palindrome

boolean isPalindrome(String s) {
	s = s.toUpperCase();
	if (s.charAt(0)!=s.charAt(s.length()-1)) {
		return false;
	} else {
		isPalindrome(s.substring(1,s.length()-2));
	}
	return true;
}

println(isPalindrome("Ejababbaje"));
