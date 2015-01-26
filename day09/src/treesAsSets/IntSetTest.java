package treesAsSets;

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
        System.out.println("EMPTY LIST: " + t.toString());
        t.add(1);
        System.out.println("LIST AFTER add(1): " + t.toString());
        t.add(10);
        t.add(3);
        t.add(4);
        t.add(3);
        System.out.println("LIST AFTER add(10,3,4,3): " + t.toString());
        System.out.println("contains(1): " + t.contains(1));
        System.out.println("contains(41): " + t.contains(41));
        System.out.println("contains(10): " + t.contains(10));
        System.out.println("contains(1): " + t.contains(1));
        System.out.println("contains(3): " + t.contains(3));
        System.out.println("containsVerbose(5)");
        System.out.println(t.containsVerbose(5));
        System.out.println("containsVerbose(4)");
        System.out.println(t.containsVerbose(4));
        System.out.println();
	}

}