/* 15. Guess my number (*)
 *	Write a program that thinks of a random number between 0 and 1000, and then lets
 *	the user try to guess it. For every guess, the computer says whether the guess
 *	is correct, or too low, or too high. When the user finds the number, the computer
 *	will tell how many guesses were needed. The output could be similar to the 
 *	following example:
 *
 *	Try to guess my number!
 *	Tell me a number: 2
 *	No! My number is higher.
 *	Tell me a number: 800
 * 	No! My number is lower.
 *	Tell me a number: 500
 *	No! My number is lower.
 *	Tell me a number: 350
 *	No! My number is higher.
 *	Tell me a number: 376
 *	CORRECT!
 *	You needed 5 guesses.
 *
 *	(Hint: to get a random number between 0 and 1000, use the following line:)
 *	int numberToGuess = Math.abs(1000 * Math.random())
 */

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

	
