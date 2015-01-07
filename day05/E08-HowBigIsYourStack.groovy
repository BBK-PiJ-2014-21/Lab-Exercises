// 8. How big is your stack? (*)

public class Stack {
	
	int count = 0;
	
	void printSize() {
		int size = count++;
		System.out.println("Method calls: " + size);
	}
	
	int infiniteAddition(BigInteger n) {
		println(n/2)
		printSize();
		infiniteAddition(n+n);
	
	}

}


Stack stack = new Stack();

stack.infiniteAddition(2);

