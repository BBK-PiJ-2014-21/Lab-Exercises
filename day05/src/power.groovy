/* 5. Power
	    implemented to work with negative powers as well.
TODO	need to add a time counter to prove difference in time execution between the two methods.

*/
public class Power {
	
	static double powRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent == 1) {
			return base;
		} else if (exponent == -1) {
			return (1/base);
		}
		if (exponent > 0) {
			return base*powRecursive(base, exponent-1);
		} else {
			return (1/base)*powRecursive(base, exponent+1);
		}
	}
	
	static double powIterative(int base, int exponent) {
		int count = 0;
		double result = base;
		if (exponent == 0) {
			return 1;
		}
		if (exponent > 0) {
			for (; count < (exponent-1); count++) {
				result = result*base;
			}
		return result;
		} else if (exponent<0) {
			for (; count > (exponent+1); count--) {
				result = result*base;
			}
		return 1/result;
		}	
	}
	
}

Power power = new Power();
System.out.print("Enter a number for the base: >> ");
String s = System.console().readLine();
int x = Integer.parseInt(s);
System.out.print("Enter a number for the exponent: >> ");
s = System.console().readLine();
int y = Integer.parseInt(s);
System.out.println("----------------");
System.out.println("RECURSIVE METHOD");
System.out.print(x + " to the power of " + y + " is ");
System.out.println(power.powRecursive(x,y));
System.out.println("----------------");
System.out.println("ITERATIVE METHOD");
System.out.print(x + " to the power of " + y + " is ");
System.out.println(power.powIterative(x,y));
System.out.println("----------------");



