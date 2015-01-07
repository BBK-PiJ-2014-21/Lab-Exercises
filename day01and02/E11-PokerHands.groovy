/* 11. Poker hands (*)
 *	Read five cards from the user. For each card, read the rank (1,2,3,4,5,6,7,8,9, 10,J,Q,K)
 *	and the suit ("spades", "hearts", "diamonds", "clubs"). Each of the five cards must be valid
 *	before accepting the next one. Once the program has the five cards, it should tell the user
 *	what is the best hand she has got, as per the following list (from best to worst):
 *
 *	STRAIGHT FLUSH: all cards are of the same suite and their ranks are consecutive.
 *					note that they are probably not ordered as they were entered.
 *	POKER: four of the five cards have the same rank.
 *	FULL HOUSE: three of a kind plus two of a kind.
 *	FLUSH: all cards share the same suit, but are not consecutive.
 *	STRAIGHT: all cards are consecutive, but not of the same suit.
 *	THREE OF A KIND: three of the five cards have the same rank.
 *	TWO PAIRS: two pairs (see below).
 *	PAIR: two of the five cards have the same rank.
 *	NOTHING: any other situation.
 *
 *	If you ever launch an online poker business, this could be one (very small)
 *	piece of it.
 */	

String card1 = ""
String card2 = ""
String card3 = ""
String card4 = ""
String card5 = ""
boolean rank = false

// ASSIGN RANK AND SUIT TO THE FIVE CARDS (as two letters Strings)

while(true) {
	print("Please enter the rank of the first card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
		card1 = s
		break
	} else if(s.equals("10")) {
		card1 = "x"
		break
	}	else if(s.equalsIgnoreCase("q") || s.equalsIgnoreCase("j") || s.equalsIgnoreCase("k")) {
		card1 = s
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the first card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		card1 = card1 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the rank of the second card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
		card2 = s
		break
	} else if(s.equals("10")) {
		card2 = "x"
		break
	}	else if(s.equalsIgnoreCase("q") || s.equalsIgnoreCase("j") || s.equalsIgnoreCase("k")) {
		card2 = s
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the second card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		card2 = card2 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the rank of the third card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
		card3 = s
		break
	} else if(s.equals("10")) {
		card3 = "x"
		break
	}	else if(s.equalsIgnoreCase("q") || s.equalsIgnoreCase("j") || s.equalsIgnoreCase("k")) {
		card3 = s
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the third card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		card3 = card3 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the rank of the fourth card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
		card4 = s
		break
	} else if(s.equals("10")) {
		card4 = "x"
		break
	}	else if(s.equalsIgnoreCase("q") || s.equalsIgnoreCase("j") || s.equalsIgnoreCase("k")) {
		card4 = s
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the fifth card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		card5 = card5 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the rank of the fifth card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
		card5 = s
		break
	} else if(s.equals("10")) {
		card5 = "x"
		break
	}	else if(s.equalsIgnoreCase("q") || s.equalsIgnoreCase("j") || s.equalsIgnoreCase("k")) {
		card5 = s
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the fifth card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		card5 = card5 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}



	
	
		
			