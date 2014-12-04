// 8. Stacks (*)

public class IntStackTest {
	public static void main(String[] args) {
		IntStack s = new IntStack();
		s.push(5);
		s.push(8);
		s.push(12);
		s.pop();
		s.push(13);
		s.pop();
		s.pop();
		s.pop();
		if(s.empty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Test failed");
		}
	}
}
