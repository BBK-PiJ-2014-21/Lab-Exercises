/* 16. Rock, Paper, Scissors (*)
	Please note this version reads the characters just from the keyboard;
	need to be enhanced to get data from a file as well.
*/

String hand1 = "";
String hand2 = "";
String s = "";
int player1 = 0;
int player2 = 0;

System.out.println("---------------------");
System.out.println("Rock, Paper, Scissors");
System.out.println("---------------------");
System.out.print("First round! ");

while (true) {
	System.out.print(">> ")
	s = System.console().readLine();
	hand1 = s.substring(0,1);
	hand2 = s.substring(1,2);
	if (hand1.equals("R") && hand2.equals("R")) {
		System.out.println("TIE");
		System.out.println("Nobody gets a point.");
	} else if (hand1.equals("R") && hand2.equals("P")) {
		System.out.println("Player 2 gets a point.");
		player2++;
	} else if (hand1.equals("R") && hand2.equals("S")) {
		System.out.println("Player 1 gets a point.");
		player1++;
	} else if (hand1.equals("P") && hand2.equals("P")) {
		System.out.println("TIE");
		System.out.println("Nobody gets a point.");
	} else if (hand1.equals("P") && hand2.equals("R")) {
		System.out.println("Player 1 gets a point.");
		player1++;
	} else if (hand1.equals("P") && hand2.equals("S")) {
		System.out.println("Player 2 gets a point.");
		player2++;
	} else if (hand1.equals("S") && hand2.equals("S")) {
		System.out.println("TIE");
		System.out.println("Nobody gets a point.");
	} else if (hand1.equals("S") && hand2.equals("R")) {
		System.out.println("Player 2 gets a point.");
		player2++;
	} else if (hand1.equals("S") && hand2.equals("P")) {
		System.out.println("Player 1 gets a point.");
		player1++;
	}
	if ((player1==player2+3)||(player2==player1+3)) {
		break;
	} else {
		System.out.println("Player One: " + player1);
		System.out.println("Player Two: " + player2);
		System.out.print("Next Round! ");
	}
}
if (player1>player2) {
System.out.println("Player One WINS " + player1 + " to " + player2);
} else {
	System.out.println("Player Two WINS " + player2 + " to " + player1);
}
	