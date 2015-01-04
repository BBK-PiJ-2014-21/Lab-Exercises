/* 3. Paper sizes(*)
	A Din-A0 sheet of paper is 841mm x 1189mm (its surface is one square meter).
	Successive measurements of paper are defined recursively as "half" or "double"
	the preceding size. Therefore, a Din-A1 sheet of paper is half of Din-A0,
	or 594mm x 841mm; while a Din-A00 is double of Din-A0, or 1189mm x 1682mm.
		Create a method that takes a String parameter representing a size 
	(e.g. "A4", "A00000") and prints on screen the size of the corresponding
	sheet of paper. For simplicity, you can ignore rounding errors when 
	calculating smaller sizes. 
		Hint: note that two consecutive sizes always share one side and only 
	the other one is multiplied or divided by two, e.g. the short side of Din-A2 
	is as long as the long side of Din-A3, while the long side of Din-A2 is
	twice as long as the short side of Din-A3.
*/

print("Please enter a Din-SIZE: ");
String s = System.console().readLine();
println(calculateSize(s));

String calculateSize(String size) {
	int dinShort = 841;
	int dinLong = 1189;
	int temp = 0;
	String result = dinShort + "mm x " + dinLong + "mm";
	if(!validInput(size)) {
		return "Invalid input";
	} else if(size.equals("A0")) {
		return result;
	}

}
	
/*	} else if(size.length()>2) {
		dinShort = temp;
		dinShort = dinLong;
		dinLong = temp*2;
		result = dinShort + "mm " + dinLong + " mm";
		calculateSize(size.substring(0,size.length()-2));
	}
*/		
		
boolean validInput(String size) {
	if(!size.substring(0,1).equalsIgnoreCase("A")) {
		return false;
	} else if(size.substring(1,2).equals("0")) {
		if(size.length()==2) {
			return true;
		} else for(int i=2; i<size.length(); i++) {
				if(!size.substring(i,i+1).equals("0")) {
					return false;
				}
		}
	} else {
		boolean valid = false;
		for(String i="1"; i<="9"; i++) {
			if(size.substring(1,2).equals(i)) {
				valid = true;
			}
		}
		if(!valid) {
			return false;
		} else for(int i=2; i<size.length(); i++) {
			if(!size.charAt(i).equals('0')) {
				return false;
			}
		}
	}
	return true;
}