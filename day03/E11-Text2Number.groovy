// 11. Text2number

System.out.print("Please enter a number: ");
String number = System.console().readLine();
String wholeNumber = "";
int decimalPlace = 0;
int counter = 0;
for (counter=0; counter<number.length(); counter++) {
	if (number.charAt(counter) == ',') {
		wholeNumber = wholeNumber + number.substring(0,counter);
		number = number.substring(counter+1);
		counter = 0;
	} else if (number.charAt(counter) == ".") {
		wholeNumber = wholeNumber + number.substring(0,counter) + number.substring(counter+1);
		decimalPlace = number.substring(counter+1).length();
	}
}
long wholeNumberLong = Long.parseLong(wholeNumber);
double wholeNumberDouble = wholeNumberLong * Math.pow(10,-decimalPlace);
System.out.println(wholeNumberDouble/2);

		
