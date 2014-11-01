// 2.2 Fibonacci

int fibonacciIterative(int n) {
	int result = 1;
	int count = 2;
	int next = 1;
	int previous = 1;
	if (n < 1) {
		System.exit(1);
	} else if (n == 1 || n == 2) {
		return 1;
	} else {
		while(count < n) {
			result = result + previous;
			previous = next;
			next = result;
			count++;
		}
	}
	return result;
}

int fibonacciRecursive(int n) {
	if (n < 1) {
		System.exit(1);
	} else if (n == 1 || n == 2) {
		n = 1;
	} else {
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
}