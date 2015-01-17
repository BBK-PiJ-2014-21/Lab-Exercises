package e02;// 2. Tree as sets - tests

public class IntSetTest {
	
	public static void main(String[] args) {
		IntSet l = new ListIntSet();
		IntSet t = new TreeIntSet();
		System.out.println(l.toString());
		l.add(1);
		l.add(1);
		l.add(3);
		l.add(8);
		l.add(5);
		l.add(3);
		System.out.println(l.toString());
		System.out.println("contains(4): " + l.contains(4));
		System.out.println("contains(3): " + l.contains(3));
		System.out.println("containsVerbose(3): " + l.containsVerbose(3));
		l.toString();
		TreeIntSet t = new TreeIntSet();
		System.out.println(t.contains(1));
		t.add(1);
		t.add(9);
		t.add(4);
		t.add(6);
		t.add(3);
		t.add(2);
		System.out.println(t.contains(1));
		System.out.println(t.toString());
	}

	// IT'S ALL WRONG !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

}