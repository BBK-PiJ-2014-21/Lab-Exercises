// 2.2 Fibonacci

int fibonacciIterative(int n) {
	int result = 0;
	int count = 2;
	int next = 1;
	int previous = 1;
	int temp = 0;
	if (n < 1) {
		System.exit(1);
	} else if (n == 1 || n == 2) {
		result = 1;
	} else {
		while(count < n) {
			result = next + previous;
			temp = next;
			next = result;
			previous = temp;
			count++;
		}
	}
	return result;
}

println(fibonacciIterative(1));
println(fibonacciIterative(2));
println(fibonacciIterative(3));
println(fibonacciIterative(4));
println(fibonacciIterative(5));
println(fibonacciIterative(6));
println(fibonacciIterative(7));
println(fibonacciIterative(8));
println(fibonacciIterative(9));
println(fibonacciIterative(10));
println(fibonacciIterative(11));
println(fibonacciIterative(12));
