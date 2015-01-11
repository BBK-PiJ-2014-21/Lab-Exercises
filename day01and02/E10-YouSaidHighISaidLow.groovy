/* 10. You said high, I said low...
 *	Modify your former program so that it outputs "Yes"
 *	when the numbers are consecutive, regardless of whether
 *	they go up or down. For example, both "2,3,4,5,6,-1" and 
 *	"10,9,8,7-1" should now result in "Yes".
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
if(n2==n1+1) {
	while(true) {
		n1=n2;
		s = System.console().readLine()
		n2 = Long.parseLong(s)
		if(n2==-1) {
			break
		} else if(n2!=n1+1) {
			consecutive = false
		}
	}
} else if(n2==n1-1) {
	while (true) {
		n1 = n2;
		s = System.console().readLine()
		n2 = Long.parseLong(s)
		if(n2==-1) {
			break;
		} else if(n2!=n1-1) {
			consecutive = false
		}
	}
} else {
	consecutive = false
	while(n2!=-1) {
		s = System.console()readLine()
		n2 = Long.parseLong(s)
	}
}
if (consecutive) {
	println("Yes");
} else {
	println("No");
}