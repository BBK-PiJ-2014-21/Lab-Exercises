
println("Please enter three numbers:");
String s = System.console().readLine()
long n1 = Integer.parseInt(s)
s = System.console().readLine()
long n2 = Integer.parseInt(s)
s = System.console().readLine()
long n3 = Integer.parseInt(s)
if (n1>=n2 && n1 >= n3) {
	if (n2>=n3) {
		println(n3 + ", " + n2 + ", " + n1);
	} else {
		println(n2 + ", " + n3 + ", " + n1);
	}
} else if (n2>n1 && n2 >= n3) {
	if (n1 >=n3) {
		println(n3 + ", " + n1 + ", " + n2);
	} else {
		println(n1 + ", " + n3 + ", " + n2);
	}
} else if (n3>n1 && n3>n2) {
	if (n1>=n2) {
		println(n2 + ", " + n1 + ", " + n3);
	} else {
		println(n1 + ", " + n2 + ", " + n3);
	}
}
