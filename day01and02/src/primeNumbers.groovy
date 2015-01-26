
print("Please enter a number: ");
String s = System.console().readLine()
int n = Integer.parseInt(s)
int divisor = 2
boolean prime = true;
if (n < 2) {
	prime = false;
} else {
	while(divisor < n) {
		if (n%divisor == 0) {
			prime = false;
			break;
		}
		divisor++;
	}
}
if (!prime) {
	println("The number is not a prime.")
} else {
	println("The number is a prime.")
}

