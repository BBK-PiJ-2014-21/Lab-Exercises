/* 4. Prime numbers
 *	Write a program that asks a number from the user, then says
 *	whether the number is prime or not. Remember that a number that
 *	is divisible by any number apart from 1 and itself is prime.
 *	You can use the modulo operator (if a%b is zero, then a is divisible by b).
 */
 
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

