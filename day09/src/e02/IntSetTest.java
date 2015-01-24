package e02;

public class IntSetTest {
	
	public static void main(String[] args) {
        System.out.println("Testing LISTINTSET");
		IntSet l = new ListIntSet();
		System.out.println("EMPTY LIST: " + l.toString());
		l.add(3);
        System.out.println("LIST AFTER add(3): " + l.toString());
        l.add(1);
        l.add(10);
        l.add(2);
        l.add(3);
		System.out.println("LIST AFTER add(1,10,2,3): " + l.toString());
		System.out.println("contains(4): " + l.contains(4));
		System.out.println("contains(3): " + l.contains(3));
		System.out.println("containsVerbose(3)");
        System.out.println(l.containsVerbose(3));
        System.out.println("containsVerbose(12)");
        System.out.println(l.containsVerbose(12));
		l.toString();
        System.out.println();
        System.out.println("Testing TREEINTSET");
        IntSet t = new TreeIntSet();
		t.add(1);
        System.out.println(t.contains(1));
	}

}