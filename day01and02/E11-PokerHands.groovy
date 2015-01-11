/* 11. Poker hands (*)
 *	Read five cards from the user. For each card, read the rank (1,2,3,4,5,6,7,8,9,10,J,Q,K)
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

int rank1 = 0
int rank2 = 0
int rank3 = 0
int rank4 = 0
int rank5 = 0
String suit1 = ""
String suit2 = ""
String suit3 = ""
String suit4 = ""
String suit5 = ""

// ASSIGN RANK AND SUIT TO THE FIVE CARDS (Rank as int, Suit as String)

while(true) {
	print("Please enter the rank of the first card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10")) {
		rank1 = Integer.parseInt(s)
		break
	}	else if(s.equalsIgnoreCase("j")) {
		rank1 = 11
		break
	}	else if(s.equalsIgnoreCase("q")) {
		rank1 = 12
		break
	}	else if(s.equalsIgnoreCase("k")) {
		rank1 = 13
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
		suit1 = suit1 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}

while(true) {
	print("Please enter the rank of the second card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10")) {
		rank2 = Integer.parseInt(s)
		break
	}	else if(s.equalsIgnoreCase("j")) {
		rank2 = 11
		break
	}	else if(s.equalsIgnoreCase("q")) {
		rank2 = 12
		break
	}	else if(s.equalsIgnoreCase("k")) {
		rank2 = 13
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
		suit2 = suit2 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}

while(true) {
	print("Please enter the rank of the third card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10")) {
		rank3 = Integer.parseInt(s)
		break
	}	else if(s.equalsIgnoreCase("j")) {
		rank3 = 11
		break
	}	else if(s.equalsIgnoreCase("q")) {
		rank3 = 12
		break
	}	else if(s.equalsIgnoreCase("k")) {
		rank3 = 13
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
		suit3 = suit3 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}

while(true) {
	print("Please enter the rank of the fourth card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10")) {
		rank4 = Integer.parseInt(s)
		break
	}	else if(s.equalsIgnoreCase("j")) {
		rank4 = 11
		break
	}	else if(s.equalsIgnoreCase("q")) {
		rank4 = 12
		break
	}	else if(s.equalsIgnoreCase("k")) {
		rank4 = 13
		break
	} else {
		println("Invalid input")
	}
}
while(true) {
	print("Please enter the suit of the fourth card (spades, hearts, diamonds, clubs): ")
	s = System.console().readLine()
	if(s.equalsIgnoreCase("spades") || s.equalsIgnoreCase("hearts") 
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")) {
		suit4 = suit4 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}
		
while(true) {
	print("Please enter the rank of the fifth card (1 to 10, J, Q or K): ")
	String s = System.console().readLine()
	if(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
	|| s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10")) {
		rank5 = Integer.parseInt(s)
		break
	}	else if(s.equalsIgnoreCase("j")) {
		rank5 = 11
		break
	}	else if(s.equalsIgnoreCase("q")) {
		rank5 = 12
		break
	}	else if(s.equalsIgnoreCase("k")) {
		rank5 = 13
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
		suit5 = suit5 + s.substring(0,1)
		break
	} else {
		println("Invalid input")
	}
}

// SORT THE RANKS

int temp = 0;
String temp2 = ""

if(rank1>=rank2 && rank1>=rank3 && rank1>=rank4 && rank1>=rank5) {
	rank1 = temp
	rank1 = rank5
	rank5 = temp
	suit1 = temp
	suit1 = suit5
	suit5 = temp
} else if(rank2>=rank1 && rank2>=rank3 && rank2>=rank4 && rank2>=rank5) {
	rank2 = temp
	rank2 = rank5
	rank5 = temp
	suit2 = temp
	suit2 = suit5
	suit5 = temp
} else if(rank3>=rank1 && rank3>=rank2 && rank3>=rank4 && rank3>=rank5) {
	rank3 = temp
	rank3 = rank5
	rank5 = temp
	suit3 = temp
	suit3 = suit5
	suit5 = temp
} else if(rank4>=rank1 && rank4>=rank2 && rank4>=rank3 && rank4>=rank5) {
	rank4 = temp
	rank4 = rank5
	rank5 = temp
	suit4 = temp
	suit4 = suit5
	suit5 = temp
}

if(rank1>=rank2 && rank1>=rank3 && rank1>=rank4) {
	rank1 = temp
	rank1 = rank4
	rank4 = rank1
	suit1 = temp
	suit1 = suit4
	suit4 = temp
} else if(rank2>=rank1 && rank2>=rank3 && rank2>=rank4) {
	rank2 = temp
	rank2 = rank4
	rank4 = temp
	suit2 = temp
	suit2 = suit4
	suit4 = temp
} else if(rank3>=rank1 && rank3>=rank2 && rank3>=rank4) {
	rank3 = temp
	rank3 = rank4
	rank4 = temp
	suit3 = temp
	suit3 = suit4
	suit4 = temp
}

if(rank1>=rank2 && rank1>=rank3) {
	rank1 = temp
	rank1 = rank3
	rank3 = temp
	suit1 = temp
	suit1 = suit3
	suit3 = temp
} else if(rank2>=rank1 && rank2>=rank3) {
	rank2 = temp
	rank2 = rank3
	rank3 = temp
	suit2 = temp
	suit2 = suit3
	suit3 = temp
}

if(rank1>=rank2) {
	rank1 = temp
	rank1 = rank2
	rank2 = temp
	suit1 = temp
	suit1 = suit2
	suit2 = temp
}

// CHECK RANKS

boolean consecutive = false
boolean sameSuite = false

if(rank2-rank1!=1) {

				
				
			