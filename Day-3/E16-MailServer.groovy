/* 16. Mail server (*)
	as per exercise instructions, this program is case-sensitive (e.g. "quit" is not accepted);
	and will consider just the "@" char for validating the e-mail address 
	(e.g. it won't check for a ".domain" at the end);
	the recipient has the format "RCPT TO: " as in the example, not "RCPT FROM:" as in the exercise description.
	
	FIRST TWO PARTS DONE - NOT COMPLETED
	
	*/

String s = "";
System.out.println("Welcome to My Mail Server!");
while(true) {
	int n = 0;
	int count = 0;
	System.out.print(">>> ");
	s = System.console().readLine();
	if (s.equals("QUIT")) {
		System.exit(0);
	}
	else if (s.length() < 11) {
		System.out.println("Invalid command.");
	} else if (s.substring(0,11) != "MAIL FROM: ") {
		System.out.println("Invalid command.");
	} else {
		if (s.charAt(n) == "@" || s.charAt(s.length()-1) == "@") {
			System.out.println("Invalid email address.");
		} else {
			for (n=n; n<s.length(); n++) {
				if (s.charAt(n) == "@") {
					count++;
				}
			}
			if (count !=1) {
				System.out.println("Invalid email address.");
			} else {
				System.out.println("OK");
				break;
			}	
		}
	}
}

while(true) {
	int n = 0;
	int count = 0;
	System.out.print(">>> ");
	s = System.console().readLine();
	if (s.equals("QUIT")) {
		System.exit(0);
	}
	else if (s.length() < 9) {
		System.out.println("Invalid command1.");
	} else if (s.substring(0,9) != "RCPT TO: ") {
		System.out.println("Invalid command2.");
	} else {
		if (s.charAt(n) == "@" || s.charAt(s.length()-1) == "@") {
			System.out.println("Invalid email address.");
		} else {
			for (n=n; n<s.length(); n++) {
				if (s.charAt(n) == "@") {
					count++;
				}
			}
			if (count !=1) {
				System.out.println("Invalid email address.");
			} else {
				System.out.println("OK");
				break;
			}	
		}
	}
}