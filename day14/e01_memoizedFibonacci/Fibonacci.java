/**
 *
 */
 public class Fibonacci {
	private int[] precalculated;
	
	public Fibonacci() {
		precalculated = null;
	}
	
	public int recFibonacci(int n) {
		if((n==0) || (n==1)) {
			return 1;
		} else {
			return recFibonacci(n-1) + recFibonacci(n-2);
		}
	}
	
	public int memoFibonacci(int n) {
		if(precalculated==null) {
			initPrecalculatedArray(n);
		}
		if(precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = memoFibonacci(n-1) + memoFibonacci(n-2);
			precalculated[n-1] = result;
			return result;
		}	
	}

	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for(int i=0; i<precalculated.length; i++) {
			precalculated[i] = -1;	// to indicate "not calculated yet"
		}
		precalculated[0] = 1;	// F(1)
		precalculated[1] = 1;	// F(2)
	}
	
}