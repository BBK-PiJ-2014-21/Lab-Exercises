// 11. Poker hands (*)

String card = "";
boolean consecutive = true;
int rank1, rank2, rank3, rank4, rank5 = 0;
int suite1, suite2, suite3, suite4, suite5 = 0;
print("Please enter the first card's rank (either 1 to 10, J, Q or K): ");
card = System.console().readLine()
if (card == "J") {
	rank1 = 11
} else if (card == "Q") {
	rank1 = 12
} else if (card == "K") {
	rank1 = 13
} else {
	rank1 = Integer.parseInt(s1r)
	}
} if (rank1 < 1 || rank1 > 13) {
	println("Invalid input.")
	System.exit(1);
}
print("Now enter the suit (spades, hearts, diamonds, clubs): ");
card = System.console().readLine()
if (card == "spades" || "Spades" || "SPADES") {
	suite1 = 1 
} else if (card == "hearts" || "Hearts" || "HEARTS") {
	suite1 = 2
} else if (card = "diamonds" || "Diamonds" || "DIAMONDS") {
	suite1 = 3
} else if (card == "clubs" || card == "Clubs" || card == "CLUBS") {
	suite1 = 4
} else {
	println ("Invalid input.")
	System.exit(1);
}
print("Please enter the second card's rank (either 1 to 10, J, Q or K): ");
card = System.console().readLine()
if (card == "J") {
	rank2 = 11
} else if (card == "Q") {
	rank2 = 12
} else if (card == "K") {
	rank2 = 13
} else {
	rank2 = Integer.parseInt(s1r)
	}
} if (rank2 < 1 || rank2 > 13) {
	println("Invalid input.")
	System.exit(1);
}
print("Now enter the suit (spades, hearts, diamonds, clubs): ");
card = System.console().readLine()
if (card == "spades" || "Spades" || "SPADES") {
	suite2 = 1 
} else if (card == "hearts" || "Hearts" || "HEARTS") {
	suite2 = 2
} else if (card = "diamonds" || "Diamonds" || "DIAMONDS") {
	suite2 = 3
} else if (card == "clubs" || card == "Clubs" || card == "CLUBS") {
	suite2 = 4
} else {
	println ("Invalid input.")
	System.exit(1);
}
print("Please enter the third card's rank (either 1 to 10, J, Q or K): ");
card = System.console().readLine()
if (card == "J") {
	rank3 = 11
} else if (card == "Q") {
	rank3 = 12
} else if (card == "K") {
	rank3 = 13
} else {
	rank3 = Integer.parseInt(s1r)
	}
} if (rank3 < 1 || rank3 > 13) {
	println("Invalid input.")
	System.exit(1);
}
print("Now enter the suit (spades, hearts, diamonds, clubs): ");
card = System.console().readLine()
if (card == "spades" || "Spades" || "SPADES") {
	suite3 = 1 
} else if (card == "hearts" || "Hearts" || "HEARTS") {
	suite3 = 2
} else if (card = "diamonds" || "Diamonds" || "DIAMONDS") {
	suite3 = 3
} else if (card == "clubs" || card == "Clubs" || card == "CLUBS") {
	suite3 = 4
} else {
	println ("Invalid input.")
	System.exit(1);
}
print("Please enter the fourth card's rank (either 1 to 10, J, Q or K): ");
card = System.console().readLine()
if (card == "J") {
	rank4 = 11
} else if (card == "Q") {
	rank4 = 12
} else if (card == "K") {
	rank4 = 13
} else {
	rank4 = Integer.parseInt(s1r)
	}
} if (rank4 < 1 || rank4 > 13) {
	println("Invalid input.")
	System.exit(1);
}
print("Now enter the suit (spades, hearts, diamonds, clubs): ");
card = System.console().readLine()
if (card == "spades" || "Spades" || "SPADES") {
	suite4 = 1 
} else if (card == "hearts" || "Hearts" || "HEARTS") {
	suite4 = 2
} else if (card = "diamonds" || "Diamonds" || "DIAMONDS") {
	suite4 = 3
} else if (card == "clubs" || card == "Clubs" || card == "CLUBS") {
	suite4 = 4
} else {
	println ("Invalid input.")
	System.exit(1);
}
print("Please enter the fifth card's rank (either 1 to 10, J, Q or K): ");
card = System.console().readLine()
if (card == "J") {
	rank5 = 11
} else if (card == "Q") {
	rank5 = 12
} else if (card == "K") {
	rank5 = 13
} else {
	rank5 = Integer.parseInt(s1r)
	}
} if (rank5 < 1 || rank5 > 13) {
	println("Invalid input.")
	System.exit(1);
}
print("Now enter the suit (spades, hearts, diamonds, clubs): ");
card = System.console().readLine()
if (card == "spades" || "Spades" || "SPADES") {
	suite5 = 1 
} else if (card == "hearts" || "Hearts" || "HEARTS") {
	suite5 = 2
} else if (card = "diamonds" || "Diamonds" || "DIAMONDS") {
	suite5 = 3
} else if (card == "clubs" || card == "Clubs" || card == "CLUBS") {
	suite5 = 4
} else {
	println ("Invalid input.")
	System.exit(1);
}
if (suite1-suite2 == 0 && suite2-suite3 == 0 && suite3-suite4 == 0 && suite4-suite5 == 0) {
	for (int i = 1, i <= 13, i++) {
		if (rank1 == i) {
			