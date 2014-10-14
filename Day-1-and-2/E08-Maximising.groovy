// 8. Maximising

String s = "";
long n1, n2 = 0;
boolean start = true;
while (start) {
	println("Please enter a series of positive numbers, end with -1: ")
	s = System.console().readLine()
	n = Long.parseLong(s)
	if (n == -1) {
		println("You would have to enter at least one number.");
	} else if (n <= 0) {
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