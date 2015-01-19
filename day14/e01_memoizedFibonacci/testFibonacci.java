/**
 *
 */
 public class testFibonacci {
	
	public static void printStandardFibonacci() {
		Fibonacci f = new Fibonacci();
		System.out.println("STANDARD RECURSIVE:");
		double start = System.currentTimeMillis();
		for(int i=0; i<10; i++) {
			System.out.println(f.recFibonacci(i));
		}
		double end = System.currentTimeMillis();
		System.out.println("Elapsed time: ");
	}
	
	public static void printMemoizedFibonacci() {
		Fibonacci f = new Fibonacci();
		System.out.println("MEMOIZED FIBONACCI:");
		double start = System.currentTimeMillis();
		for(int i=0; i<10; i++) {
			System.out.println(f.memoFibonacci(i));
		}
		double end = System.currentTimeMillis();
		System.out.println("Elapsed time: ");
	}
	
	public static void main(String[] args) {
		printStandardFibonacci();
		System.out.println("=================");
		printMemoizedFibonacci();
	}
	
}