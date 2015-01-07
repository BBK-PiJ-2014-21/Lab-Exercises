/* 4. Line to column

------------------------------------------------------

System.out.println("Please enter some text: ");
String s = System.console().readLine();
int n = 0;
for (n=0; n<s.length(); n++) {
	char letter = s.charAt(n);
	System.out.println(letter)
	}
	
------------------------------------------------------

*/

System.out.println("Please enter some text: ");
String s = System.console().readLine();
int a = 0;
int b = 0;

for (b=0; b<s.length(); b++) {
	char space = s.charAt(b);
	if (space == ' ') {
		System.out.println(s.substring(a,b));
		a = b+1;
	}
}
System.out.println(s.substring(a));
	


