package memoizedFibonacci;
/**
 *
 */
 public class Fibonacci {
	private int[] precalculated;
	
	public Fibonacci() {
		precalculated = null;
	}
	
	public int recFibonacci(int n) {
		if(n==0) {
            return 0;
        } else if(n==1) {
			return 1;
		} else {
			return recFibonacci(n-1) + recFibonacci(n-2);
		}
	}
	
	public int memoFibonacci(int n) {
        if(n<1) {
            return 0;
        } else if(precalculated==null) {
            initPrecalculatedArray(n);
		}
        if(precalculated[n] != -1) {
			return precalculated[n];
		} else {
			int result = memoFibonacci(n-1) + memoFibonacci(n-2);
			precalculated[n] = result;
			return result;
		}	
	}

	private void initPrecalculatedArray(int size) {
        precalculated = new int[size+1];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1;    // to indicate "not calculated yet"
        }
        precalculated[0] = 0;    // F(0)
        precalculated[1] = 1;    // F(1)
    }
	
}