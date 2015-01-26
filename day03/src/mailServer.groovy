/**
 * as per exercise instructions, this program is case-sensitive (e.g. "quit" is not accepted); 
 * and will consider just the "@" char for validating the e-mail address 
 * (e.g. it won't check for a ".domain" at the end);
*/
String s = "";
String recipient = "";
String sender = "";
String data = "";
System.out.println("Welcome to My Mail Server!");
while(true) {
	int n = 0;
	int count = 0;
	System.out.print(">>> ");
	sender = System.console().readLine();
	if (sender.equals("QUIT")) {
		System.out.println("Bye!");
		System.exit(0);
	} else if (sender.length() < 10) {
		System.out.println("Invalid command.");
	} else if (sender.substring(0,10) != "MAIL FROM:") {
		System.out.println("Invalid command.");
	} else {
		sender = sender.substring(10);
		while (sender.charAt(n) == " ") {
			n++;
		}
		sender = sender.substring(n);
		if (sender.charAt(n) == "@" || sender.charAt(sender.length()-1) == "@") {
			System.out.println("Invalid email address.");
		} else {
			for (n=n; n<sender.length(); n++) {
				if (sender.charAt(n) == "@") {
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
	recipient = System.console().readLine();
	if (recipient.equals("QUIT")) {
		System.out.println("Bye!");
		System.exit(0);
	} else if (recipient.length() < 9) {
		System.out.println("Invalid command.");
	} else if (recipient.substring(0,9) != "RCPT TO: ") {
		System.out.println("Invalid command.");
	} else {
		recipient = recipient.substring(9);
		while (recipient.charAt(n).equals(" ")) {
			n++;
		}
		recipient = recipient.substring(n);
		if (recipient.charAt(n) == "@" || recipient.charAt(recipient.length()-1) == "@") {
			System.out.println("Invalid email address.");
		} else {
			for (n=n; n<recipient.length(); n++) {
				if (recipient.charAt(n) == "@") {
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
	data = "";
	System.out.print(">>> ");
	s = System.console().readLine();
	if (s.equals("QUIT")) {
		System.out.println("Bye!");
		System.exit(0);
	} else if (s.length() != 4) {
		System.out.println("Invalid command.");
	} else if (s.substring(0,4) != "DATA") {
		System.out.println("Invalid command");
	} else {
		s = System.console().readLine();
		if (s.equals(".")) {
			data = ("<empty message>");
		} else {
			data = data + s;
		}
		while (!s.equals(".")) {
			s = System.console().readLine();
			if (!s.equals(".")) {
				data = data + "\n" + s;
			}
		}
	System.out.println("Sending email...");
	System.out.println("from: " + sender);
	System.out.println("to: " + recipient);
	System.out.println(data);
	System.out.println("...done!");
	}	
}
		
	
	
	
	
	
	
	
