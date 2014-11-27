public class IntegerNodeTreeTest {
	
	public static void main(String[] args) {
		IntegerTreeNode test = new IntegerTreeNode(6);
		System.out.println("toString() " + test.toString());
		System.out.println("toStringSimplified() " + test.toStringSimplified());
		test.add(9);
		System.out.println("toString() " + test.toString());
		System.out.println("toStringSimplified() " + test.toStringSimplified());
		test.add(5);
		test.add(3);
		System.out.println("toString() " + test.toString());
		System.out.println("toStringSimplified() " + test.toStringSimplified());
		test.add(11);
		test.add(12);
		test.add(8);
		System.out.println("toString() " + test.toString());
		System.out.println("toStringSimplified() " + test.toStringSimplified() + '\n');
		System.out.println("TESTING getMax() and getMin() methods: ");
		System.out.println("Maximum value: " + test.getMax());
		System.out.println("Minimum value: " + test.getMin());
		System.out.println("TESTING contains() method:");
		System.out.println("The tree contains number 0: " + test.contains(0));
		System.out.println("The tree contains number 9: " + test.contains(9));
		System.out.println("The tree contains number 4: " + test.contains(4));
		System.out.println("The tree contains number 12: " + test.contains(12));
	}

}