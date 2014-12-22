/* 8. Maximising
 *	Write a program that read a (arbitrary long) sequence 
 *	of positive numbers. The sequence is ended when the users
 *	enters "-1". At that point, the program must output the 
 *	highest number in the sequence.
 */

long n1 = 0;
long n2 = 0;
while (true) {
	println("Please enter a series of positive numbers, end with -1: ")
	String s = System.console().readLine()
	n1 = Long.parseLong(s)
	if (n1 == -1) {
		println("You would have to enter at least one number.");
	} else if (n1 <= 0) {
		println("You need to enter positive numbers.");
	} else {
		break;
	}
}
while (n2 != -1) {
	s = System.console().readLine()
	n2 = Long.parseLong(s)
	if (n2 == -1) {
		break;
	} else if (n2 <= 0) {
		println("You need to enter positive numbers (-1 to exit). Please try again:")
	} else if (n2>n1) {
		n1 = n2;
	}
}

println("The largest number you entered is " + n1);