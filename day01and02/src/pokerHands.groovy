
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
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")
	|| s.equalsIgnoreCase("s") || s.equalsIgnoreCase("h") || s.equalsIgnoreCase("d") 
	|| s.equalsIgnoreCase("c")) {
		suit1 = s.substring(0,1)
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
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")
	|| s.equalsIgnoreCase("s") || s.equalsIgnoreCase("h") || s.equalsIgnoreCase("d") 
	|| s.equalsIgnoreCase("c")) {
		suit2 = s.substring(0,1)
		if(rank1==rank2 && suit1.equals(suit2)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else {
			break
		}
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
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")
	|| s.equalsIgnoreCase("s") || s.equalsIgnoreCase("h") || s.equalsIgnoreCase("d") 
	|| s.equalsIgnoreCase("c")) {
		suit3 = s.substring(0,1)
		if(rank1==rank3 && suit1.equals(suit3)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank2==rank3 && suit2.equals(suit3)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else {
			break
		}
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
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")
	|| s.equalsIgnoreCase("s") || s.equalsIgnoreCase("h") || s.equalsIgnoreCase("d") 
	|| s.equalsIgnoreCase("c")) {
		suit4 = s.substring(0,1)
		if(rank1==rank4 && suit1.equals(suit4)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank2==rank4 && suit2.equals(suit4)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank3==rank4 && suit3.equals(suit4)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else {
			break
		}
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
	|| s.equalsIgnoreCase("diamonds") || s.equalsIgnoreCase("clubs")
	|| s.equalsIgnoreCase("s") || s.equalsIgnoreCase("h") || s.equalsIgnoreCase("d") 
	|| s.equalsIgnoreCase("c")) {
		suit5 = s.substring(0,1)
		if(rank1==rank5 && suit1.equals(suit5)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank2==rank5 && suit2.equals(suit5)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank3==rank5 && suit3.equals(suit5)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else if(rank4==rank5 && suit4.equals(suit5)) {
			println("Cannot have two same cards, are you trying to cheat?")
		} else {
			break
		}
		println("Invalid input")
	}
}

println("card1 : " + rank1 + suit1)
println("card2 : " + rank2 + suit2)
println("card3 : " + rank3 + suit3)
println("card4 : " + rank4 + suit4)
println("card5 : " + rank5 + suit5)

// SORT THE RANKS

int temp = 0;
String temp2 = ""

if(rank1>=rank2 && rank1>=rank3 && rank1>=rank4 && rank1>=rank5) {
	temp = rank1
	rank1 = rank5
	rank5 = temp
	temp2 = suit1
	suit1 = suit5
	suit5 = temp2
} else if(rank2>=rank1 && rank2>=rank3 && rank2>=rank4 && rank2>=rank5) {
	temp = rank2
	rank2 = rank5
	rank5 = temp
	temp2 = suit2
	suit2 = suit5
	suit5 = temp2
} else if(rank3>=rank1 && rank3>=rank2 && rank3>=rank4 && rank3>=rank5) {
	temp = rank3
	rank3 = rank5
	rank5 = temp
	temp2 = suit3
	suit3 = suit5
	suit5 = temp2
} else if(rank4>=rank1 && rank4>=rank2 && rank4>=rank3 && rank4>=rank5) {
	temp = rank4
	rank4 = rank5
	rank5 = temp
	temp2 = suit4
	suit4 = suit5
	suit5 = temp2
}

if(rank1>=rank2 && rank1>=rank3 && rank1>=rank4) {
	temp = rank1
	rank1 = rank4
	rank4 = temp
	temp2 = suit1
	suit1 = suit4
	suit4 = temp2
} else if(rank2>=rank1 && rank2>=rank3 && rank2>=rank4) {
	temp = rank2
	rank2 = rank4
	rank4 = temp
	temp2 = suit2
	suit2 = suit4
	suit4 = temp2
} else if(rank3>=rank1 && rank3>=rank2 && rank3>=rank4) {
	temp = rank3
	rank3 = rank4
	rank4 = temp
	temp2 = suit3
	suit3 = suit4
	suit4 = temp2
}

if(rank1>=rank2 && rank1>=rank3) {
	temp = rank1
	rank1 = rank3
	rank3 = temp
	temp2 = suit1
	suit1 = suit3
	suit3 = temp2
} else if(rank2>=rank1 && rank2>=rank3) {
	temp = rank2
	rank2 = rank3
	rank3 = temp
	temp2 = suit2
	suit2 = suit3
	suit3 = temp2
}

if(rank1>=rank2) {
	temp = rank1
	rank1 = rank2
	rank2 = temp
	temp2 = suit1
	suit1 = suit2
	suit2 = temp2
}

// CHECK FOR CONSECUTIVE RANKS

boolean straight = false;

if ((rank5-rank4)==1 && (rank4-rank3)==1 && (rank3-rank2)==1 && (rank2-rank1)==1) {
	straight = true;
} else if (rank1==1 && rank2==10 && rank3==11 && rank4==12 && rank5==13) {
	straight = true;
}

// CHECK FOR PAIRS OR MORE

boolean pair = false
boolean twopairs = false
boolean three = false
boolean fullhouse = false
boolean poker = false

if(rank1==rank4 || rank2==rank5) {
	poker = true
} else if(rank1==rank3) {
	if(rank4==rank5) {
		fullhouse = true
	} else {
		three = true
	}
} else if(rank2==rank4) {
	three = true
} else if(rank3==rank5) {
	if(rank1==rank2) {
		fullhouse = true
	} else {
		three = true
	}
} else if(rank1==rank2) {
	if(rank3==rank4 || rank4==rank5) {
		twopairs = true
	} else {
		pair = true
	}
} else if(rank2==rank3) {
	if(rank4==rank5) {
		twopairs = true
	} else {
		pair = true
	}
} else if(rank3==rank4) {
	if(rank1==rank2) {
		twopairs = true
	} else {
		pair = true
	}
} else if(rank4==rank5) {
	if(rank1==rank2 || rank2==rank3) {
		twopairs = true
	} else {
		pair = true
	}
}

// CHECK FOR SAME SUITE

boolean flush = false

if(suit1.equals(suit2) && suit2.equals(suit3) && suit3.equals(suit4) && suit4.equals(suit5)) {
	flush = true
}

print("YOU HAVE ")

if(straight==true && flush == true) {
	println("STRAIGHT FLUSH")
} else if(poker==true) {
	println("POKER")
} else if(fullhouse==true) {
	println("FULL HOUSE")
} else if(flush==true) {
	println("FLUSH")
} else if(straight==true) {
	println("STRAIGHT")
} else if(three==true) {
	println("THREE OF A KIND")
} else if(twopairs==true) {
	println("TWO PAIRS")
} else if(pair==true) {
	println("A PAIR")
} else {
	println("NOTHING!")
} 	