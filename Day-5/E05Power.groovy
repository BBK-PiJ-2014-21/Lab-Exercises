// 5. Power

public class Power {
	
	static int powRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 0;
		} else if (exponent == 1) {
			return base;
		}
		return base*powRecursive(base, exponent-1);
	}
	
	static int powIterative(int base, int exponent) {
		int count = 0;
		int result = base;
		if (exponent == 0) {
			return 0;
		} 
		for (; count < (exponent-1); count++) {
				result = result*base;
			}
		return result;
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
double start = System.nanoTime();
System.out.println(power.powRecursive(x,y));
double end = System.nanoTime();
System.out.println("Time elapsed: " + end-start + " nanoseconds.");
System.out.println("----------------");
System.out.println("ITERATIVE METHOD");
System.out.print(x + " to the power of " + y + " is ");
start = System.currentTimeMillis();
System.out.println(power.powIterative(x,y));
end = System.currentTimeMillis();
System.out.println("Time elapsed: " + (end-start)/1000 + " milliseconds.");
System.out.println("----------------");



