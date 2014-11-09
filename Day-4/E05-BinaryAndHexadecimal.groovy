// 5. Binary and hexadecimal (*)

public static void main(String[] args) {

	System.out.print("Please enter either a positive decimal or hexadecimal: ");
	String str = System.console().readLine();
	if (isDecimal(str) == true) {
		System.out.println("This is a decimal number.");
		System.out.println("Converting to hex...");
		System.out.println("...");
		System.out.println(convertToHex(str));
	} else if (isHex(str) == true) {
		System.out.println("This is an hexadecimal number.");
		System.out.println("Converting to decimal...");
		System.out.println("...");
		System.out.println(convertToDecimal(str));
	} else {
		System.out.println("Input error.");
		System.exit(1);
	}

}

	boolean isDecimal(String s) {
		boolean isDecimal = true;
		boolean isPositionDecimal = false;
		int position = 0;
		String value = "0";
		for (position=0; position<s.length(); position++) {
			isPositionDecimal = false;
			for (value = "0"; value<="9"; value++) {
				if (s.charAt(position) == (value)) {
					isPositionDecimal = true;
					break;
				}
			}
			if (isPositionDecimal == false) {
				isDecimal = false;
				return isDecimal;
			}
		}
		return isDecimal;
	}
	
	boolean isHex(String s) {
		boolean isHex = true;
		boolean isPositionHex = false;
		int position=0;
		String value = "0";
		s = s.toUpperCase();
		if (s.length()<3) {
			isHex = false;
			return isHex;
		} else if (s.charAt(0) != "0") {
			isHex = false;
			return isHex;
		} else if (s.charAt(1) != "X") {
			isHex = false;
			return isHex;
		} else {
			for (position=2; position<s.length(); position++) {
				isPositionHex = false;
				for (value="0"; value <= "9"; value++) {
					if (s.charAt(position) == (value)) {
						isPositionHex = true;
						break;
					} 
				}
				for(value="A"; value <"G"; value++) {
					if (s.charAt(position) == (value)) {
						isPositionHex = true;
						break;
					}
				}
			}
			if (isPositionHex == false) {
				isHex = false;
				return isHex;
			}
		}
	return isHex;
	}
	
	int convertToDecimal(String s) {
		int decimal = 0;
		int position = 0;
		int base = 0;
		int power = s.length()-2;
		String value = "0";
		s = s.toUpperCase();
		for (position=2; position<s.length(); position++) {
			power--;
			base = 0;
			for (value = "0"; value <= "9"; value++) {
				if (s.charAt(position) == (value)) {
					decimal = decimal + base*Math.pow(15,power);
					break;
				}
				base++
			} 
			for (value = "A"; value < "G"; value++) {
				if (s.charAt(position) == (value)) {
					decimal = decimal + base*Math.pow(15,power);
					break;
				}
			base++;
			}	
		}
		return decimal;
	}
	
	String convertToHex(String s) {
		int decimal = Integer.parseInt(s);
		String hex = "";
		String letter = "";
		int remainder = 0;
		while(decimal != 0) {
			remainder = decimal%16;
			decimal = decimal/16;
			if (remainder > 9) {
				int count = 10;
				for (letter = "a"; letter<"g"; letter++) {
					if (count.equals(remainder)) {
						hex = letter + hex;
						break;
					} else {
						count++;
					}
				}
			} else {
				hex = remainder + hex;
			}
		}
	hex = "0x" + hex;
	return hex;
	}
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		