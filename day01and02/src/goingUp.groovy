
boolean consecutive = true;
println("Please enter a positive sequence of numbers, finish with -1:");
String s = System.console().readLine()
long n1 = Long.parseLong(s)
s = System.console().readLine()
long n2 = Long.parseLong(s)
while(n2 == -1) {
	println("Please enter at least two numbers")
	s = System.console().readLine()
	n2 = Long.parseLong(s)
}
if(n2<0 || n2-n1 != 1) {
	consecutive = false;
}
while (true) {
	n1 = n2;
	s = System.console().readLine()
	n2 = Long.parseLong(s)
	if (n2 == -1) {
		break;
	} else if (n2<0 || n2-n1 !=1) {
		consecutive = false;
	}
}
if (consecutive) {
	println("Yes");
} else {
	println("No");
}
 
	