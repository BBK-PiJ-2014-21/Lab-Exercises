// 2.1 Factorial

	int factorialRecursive(int n) {
		if (n==0 || n==1) {
			return 1;
		} else {
			return n*factorialRecursive(n-1);
		}
	}
	
	int factorialIterative(int n) {
		int count = n;
		int result = 1;
		if (n==0 || n==1) {
			return 1;
		} else {
			for (; count>0; count--) {
				result = result*n;
				n--;
			}
		return result;
		}
	}

while (true) {
	System.out.print("Please enter a number: >> ");
	String s = System.console().readLine();
	int n = Integer.parseInt(s);
	System.out.println("RECURSIVE METHOD: Factorial of " + n + " is " + factorialRecursive(n));
	System.out.println("ITERATIVE METHOD: Factorial of " + n + " is " + factorialIterative(n));
	System.out.print("Press 'q' to quit, any other button to start again: >> ");
	s = System.console().readLine();
	if (s.equals("q")) {
		break;
	}
}
	