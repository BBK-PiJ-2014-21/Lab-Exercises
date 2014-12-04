// 9. Going Up!

boolean consecutive = true;
println("Please enter a positive sequence of numbers, finish with -1:");
String s = System.console().readLine()
long n1 = Long.parseLong(s)
s = System.console().readLine()
long n2 = Long.parseLong(s)
if (n2 == -1) {
	consecutive = false;
} else {
	n1 = n2;
	while (true) {
		s = System.console().readLine()
		n2 = Long.parseLong(s)
		if (n2 == -1) {
			break;
		} else if (n2 <=0) {
			println("Invalid input.")
			System.exit(1);
		} else if (n2-n1 != 1) {
			consecutive = false;
		}
		n1 = n2;
	}
}

if (consecutive) {
	println("Yes");
} else {
	println("No");
}
 
	