package e03;

public class IntSortedListTest {
	
	public static void main(String[] args) {
		IntSortedList tree = new TreeIntSortedList();
		System.out.println("new TreeIntSortedList() created.");
		System.out.print("test contains(5) >> ");
		System.out.println(tree.contains(5));
		System.out.print("test contains(10) >> ");
		System.out.println(tree.contains(10));
		System.out.println("add(5)");
		tree.add(5);
		System.out.print("test contains(5) >> ");
		System.out.println(tree.contains(5));
        IntSortedList link = new LinkedIntSortedList();
        System.out.println("new LinkedIntSortedList() created.");
        System.out.print("test contains(5) >> ");
        System.out.println(link.contains(5));
        System.out.print("test contains(10) >> ");
        System.out.println(link.contains(10));
        System.out.println("add(5)");
        link.add(5);
        System.out.print("test contains(5) >> ");
        System.out.println(link.contains(5));
	}

}
	
