/* 9. Going Up!
 *	Read an arbitrary long sequence of positive numbers from the user,
 *	until -1 is entered. At that point, print "Yes" if the numbers were
 *	consecutive and increasing and "No" otherwise.
 *	Sequences "1,2,3,4,-1" and "5,6,7,8,9,10,11,-1" should output "Yes",
 *	but "2,3,5,6,7,-1", "10,9,8,7,-1", and "1,1,2,3,4,5-1" should output "No".
 */
	
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
 
	