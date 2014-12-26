/* 12. Number piramids
 *	Write a program that output a number piramid like the one below.
 *	
 *	1
 *	22
 *	333
 *	4444
 *	55555
 *	666666
 *	7777777
 *	\ldots
 *
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

		
