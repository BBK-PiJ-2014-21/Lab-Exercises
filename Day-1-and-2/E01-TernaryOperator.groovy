/* 1. Ternary operator
	this code will ask the user to enter the year of birth, then it will compute the approximate age in 2012
	(without considering the month). If the result is less than 17, it will print "It seems you are not an adult.",
	otherwise it will print "It seems you are an adult."
*/

int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."

