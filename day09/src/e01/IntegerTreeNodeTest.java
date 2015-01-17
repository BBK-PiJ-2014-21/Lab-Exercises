package e01;

public class IntegerTreeNodeTest {
	
	public static void main(String[] args) {
		IntegerTreeNode test = new IntegerTreeNode(6);
		System.out.println("(a) " + test.toString());
		System.out.println("(a) toStringSimplified() " + test.toStringSimplified());
		System.out.println("(a) Depth: " + test.depth());
		test.add(9);
		System.out.println("(b) " + test.toString());
		System.out.println("(b) toStringSimplified() " + test.toStringSimplified());
		System.out.println("(b) Depth: " + test.depth());
		test.add(5);
		test.add(3);
		System.out.println("(c) " + test.toString());
		System.out.println("(c) toStringSimplified() " + test.toStringSimplified());
		System.out.println("(c) Depth: " + test.depth());
		test.add(11);
		test.add(12);
		test.add(8);
		System.out.println("(d) " + test.toString());
		System.out.println("(d) toStringSimplified() " + test.toStringSimplified());
		System.out.println("(d) Depth: " + test.depth() + '\n');
		System.out.println("TESTING getMax() and getMin() methods: ");
		System.out.println("Maximum value: " + test.getMax());
		System.out.println("Minimum value: " + test.getMin());
		System.out.println("TESTING contains() method:");
		System.out.println("The tree contains number 0: " + test.contains(0));
		System.out.println("The tree contains number 9: " + test.contains(9));
		System.out.println("The tree contains number 4: " + test.contains(4));
		System.out.println("The tree contains number 12: " + test.contains(12) + '\n');
		System.out.println(test.toStringSimplified());
		System.out.println("TESTING remove(5)");
		test.remove(5);
		System.out.println(test.toStringSimplified());
		System.out.println("TESTING remove(9)");
		test.remove(9);
		System.out.println(test.toStringSimplified());
	}

}