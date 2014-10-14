/* 2. Yet another loop
	this piece of code will take a number n as input: if this is larger or equal to 10, it will print "finished";
	otherwise it will ask for 10-n times for another number as input: if this is equal to 0 it will stop the loop 
	and print "finished"; otherwise it will print the new number (unless this is equal to 1) until the 10-n time 
	when it will go out of the loop and print "finished".
*/

String str = System.console().readLine90
int i = Integer.parseInt(str)
while (i < 10) {
	i++;
	str = System.console().readLine()
	int j = Integer.parseInt(str)
	if (j == 0) {
		break;
	} else if (j != 1) {
		println j;
	}
}
println "finished"