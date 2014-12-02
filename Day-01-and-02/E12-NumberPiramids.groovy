/* 12. Number piramids
	This version let the user choose how many line should the pyramid have.
*/

System.out.print("Please enter the number of lines: ");
String s = System.console().readLine()
int maxNumber = Integer.parseInt(s)
int number, count = 1;
for (number=1; number<=maxNumber; number++) {
	count = number;
	while(count>0) {
		System.out.print(number);
		count--;
	}
	System.out.println();
}
System.out.println("\\ldots");

		
