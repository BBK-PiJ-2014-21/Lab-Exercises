
System.out.print("Please enter a number: ");
String s = System.console().readLine();
int n = Integer.parseInt(s);
int k = 0;
double pi = 0;
double add = 0;
while(n>0) {
	add = 4*Math.pow(-1,k)/(2*k+1);
	pi = pi + add;
	System.out.println(pi);
	k++;
	n--;
}

System.out.println("Calculating terms needed to get the first three digits right...");
System.out.println("...");
pi=0;
add=0;
n=0;
k=0;
String piString  = "";
while(true) {
	add = 4*Math.pow(-1,k)/(2*k+1);
	pi=pi+add;
	System.out.println(pi);
	k++;
	n++;
	s = Double.toString(pi);
	if(s.length()>3) {
		if(s.substring(0,4).equals("3.14")) {
			break;
		}
	}
}
System.out.println("... it took " + n + " terms.");
System.out.println();
System.out.print("Would you like to calculate the terms needed to get the first ten digits right? > ");
s = System.console().readline();
boolean longwait = false;
if(s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes")) {
	System.out.print("Are you sure? It might take a while... >>> ");
	if(s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes")) {
		System.out.println("Ok then.");
		goingToCrash = true;
	}
}

if(goingToCrash) {		
	System.out.println("...");
	pi=0
	add=0
	n=0;
	k=0;
	while(true) {
		add = 4*Math.pow(-1,n)/(2*n+1);
		pi=pi+add;
		System.out.println(pi);
		k++;
		n++;
		s = Double.toString(pi);
		if(s.length()>10) {
			if(s.substring(0,11).equals("3.141592653")) {
				break;
			}
		}
	}
	System.out.println("... it took " + n + " terms.");
}

System.out.println("Goodbye.");