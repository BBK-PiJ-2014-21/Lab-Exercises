package memoizedFibonacci;
/**
 *
 */
 public class FibonacciTest {
	
	public static void printStandardFibonacci() {
		Fibonacci f = new Fibonacci();
		System.out.println("STANDARD RECURSIVE:");
		long start = System.nanoTime();
		for(int i=0; i<30; i++) {
			System.out.println(f.recFibonacci(i));
		}
        long time = (System.nanoTime()-start);
		System.out.println("Elapsed time (nanoseconds): " + time + " (" + time/1000000 + " millisecond)");
	}
	
	public static void printMemoizedFibonacci() {
		System.out.println("MEMOIZED FIBONACCI:");
		long start = System.nanoTime();
		for(int i=0; i<30; i++) {
            Fibonacci f = new Fibonacci();
			System.out.println(f.memoFibonacci(i));
		}
		long time = (System.nanoTime() - start);
		System.out.println("Elapsed time: (nanoseconds): " + time + " (" + time/1000000 + " milliseconds)");
	}

}