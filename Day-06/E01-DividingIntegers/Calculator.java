// 1. Dividing integers

public class Calculator {

	public int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}

	public int subtract(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
	
	public int multiply(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}	
	
	public int divide(int a, int b) {
		System.out.println((double)a/b);
		return a/b;
	}
	
	public int modulus(int a, int b) {
		System.out.println(a%b);
		return a%b;
	}
	
}