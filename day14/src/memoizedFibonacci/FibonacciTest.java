package memoizedFibonacci;
/**
 *
 */
 public class FibonacciTest {
	
	public static void printStandardFibonacci(int n) {
		Fibonacci f = new Fibonacci();
		System.out.println("STANDARD RECURSIVE:");
		long start = System.nanoTime();
		for(int i=0; i<n; i++) {
			System.out.println(f.recFibonacci(i));
		}
        long time = (System.nanoTime()-start);
		System.out.println("Elapsed time: " + time + " ns (~= " + time/1000 + " microseconds)");
	}
	
	public static void printMemoizedFibonacci(int n) {
		System.out.println("MEMOIZED FIBONACCI:");
		long start = System.nanoTime();
		for(int i=0; i<n; i++) {
            Fibonacci f = new Fibonacci();
			System.out.println(f.memoFibonacci(i));
		}
		long time = (System.nanoTime() - start);
		System.out.println("Elapsed time: " + time + " ns (~= " + time/1000 + " microseconds)");
	}

}