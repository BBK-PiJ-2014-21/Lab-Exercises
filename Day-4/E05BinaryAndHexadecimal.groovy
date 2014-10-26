/* 5. Binary and hexadecimal (*)
	this program is not case-sensitive for hex letters `x` and `a-f`.
	convertToHex() still to be done
*/

public static void main(String[] args) {

	System.out.print("Please enter either a positive decimal or hexadecimal: ");
	String str = System.console().readLine();
	if (isDecimal(str) == true) {
		System.out.println("This is a decimal number.");
		System.out.println("I will implement a method to convert to Hex very soon.");
		System.exit(0);
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
				if (isPositionHex == false) {
					for(value="A"; value <"G"; value++) {
						if (s.charAt(position) == (value)) {
							isPositionHex = true;
							break;
						}
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