
System.out.println("Try to guess my number!");
int numberToGuess = Math.abs(1000 * Math.random());
int n = 0;
int count = 0;
while(true) {
	count++;
	String s = System.console().readLine();
	n = Integer.parseInt(s);
	if (n == numberToGuess) {
		System.out.println("CORRECT!");
		break;
	} else if (n > numberToGuess) {
		System.out.println("No! My number is lower.");
	} else if (n < numberToGuess) {
		System.out.println("No! My number is higher.");
	}
}
if (count == 1) {
	System.out.println("You needed just one guess!")
} else {
	System.out.println("You needed " + count + " guesses.");
}

	
