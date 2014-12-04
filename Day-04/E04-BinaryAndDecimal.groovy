// 4. Binary and decimal

int binary2decimal(String s) {
	int i = 0;
	int count = s.length();
	int binary = 0;
	for (i=0; i<=s.length()-1; i++) {
		count--;
		if (s.charAt(i) == "1") {
			binary = binary + (1*Math.pow(2,count));
		} else if (s.charAt(i) != "0") {
			System.out.println("Invalid input.");
			System.out.println();
			return binary;
		}

	}
	System.out.println("The value in binary is " + binary);
	System.out.println();
	return binary;
}

String decimal2binary(int n) {
	String decimal = "";
	if(n<0) {
		System.out.println("Sorry this version doesn't support negative numbers.");
		System.out.println();
		return decimal;
	} else {
		while(n>0) {
			if (n%2 == 0) {
				decimal = "0" + decimal;
			} else {
				decimal = "1" + decimal;
			}
		n = n/2;
		}
	System.out.println("The value in binary is " + decimal);
	System.out.println();
	return decimal;
	}
}

while(true) {
	System.out.println("----------------------------");
	System.out.println("Binary and decimal converter");
	System.out.println("----------------------------");
	System.out.println("Press 1 to convert from binary to decimal." );
	System.out.println("Press 2 to convert from decimal to binary.");
	System.out.println("Press 0 to quit.");
	System.out.print(">> ");
	String str = System.console().readLine();
	switch(str) {
		case "1" :	
			System.out.print("Please enter a positive binary number: ");
			str = System.console().readLine();
			binary2decimal(str);
			break;
		case "2" :
			System.out.print("Please enter a positive decimal number: ")
			str = System.console().readLine();
			int number = Integer.parseInt(str);
			decimal2binary(number);
			break;
		case "0" :
			System.out.println("Goodbye.");	
			System.exit(0);
		default :
			System.out.println("Invalid input.");
	}
}
