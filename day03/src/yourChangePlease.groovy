
// TODO Unicode to print char '£' to be fixed (it outputs 'ú' for some unknown reason);
// could be enhanced to make a loop in case the amount entered is less than the price to pay;
// could also be modified not to print the currency with amount zero.

System.out.print("Please enter the total cost of the purchase: \u00A3");
String s = System.console().readLine();
Double cost = Double.parseDouble(s);
Double change = 0.0;

System.out.print("Please enter the amount paid: \u00A3");
s = System.console().readLine()
Double payment = Double.parseDouble(s);
if (payment>=cost) {
	change = (payment-cost);
}

// CREATE THE CURRENCIES
int fiftyPounds = change/50;
double leftOver = change%50;
int twentyPounds = leftOver/20;
leftOver = leftOver%20;
int tenPounds = leftOver/10;
leftOver = leftOver%10;
int fivePounds = leftOver/5;
leftOver = leftOver%5;
int twoPounds = leftOver%2;
leftOver = leftOver%2;
int onePound = leftOver/1;
leftOver = leftOver%1;
int fiftyPence = leftOver/0.50;
leftOver = leftOver%0.50;
int twentyPence = leftOver/0.20;
leftOver = leftOver%0.20;
int tenPence = leftOver/0.10;
leftOver = leftOver%0.10;
int fivePence = leftOver/0.05;
leftOver = leftOver%0.05;
int twoPenny = leftOver/0.02;
leftOver = leftOver%0.02;
int onePenny = leftOver/0.01;
leftOver = leftOver%0.01;

if (payment>cost) {
	System.out.println("THIS IS YOUR CHANGE:");
	System.out.println("amount of 50 notes = " + fiftyPounds);
	System.out.println("amount of 20 notes = " + twentyPounds);
	System.out.println("amount of 10 notes = " + tenPounds);
	System.out.println("amount of 5 notes = " + fivePounds);
	System.out.println("amount of 2 coins = " + twoPounds);
	System.out.println("amount of 1 coins = " + onePound);
	System.out.println("amout of 0.50 coins = " + fiftyPence);
	System.out.println("amount of 0.20 coins = " + twentyPence);
	System.out.println("amount of 0.10 coins = " + tenPence);
	System.out.println("amount of 0.05 coins = " + fivePence);
	System.out.println("amount of 0.02 coins = " + twoPenny);
	System.out.println("amount of 0.01 coins = " + onePenny);
}

	
