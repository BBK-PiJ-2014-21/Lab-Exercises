package e03;// 3.2 Implementation as a tree - test

public class TreeIntSortedListTest {
	
	public static void main(String[] args) {
		TreeIntSortedList tree = new TreeIntSortedList(10);
		System.out.println("new e03.TreeIntSortedList(10) created.");
		System.out.print("test contains(5) >> ");
		System.out.println(tree.contains(5));
		System.out.print("test contains(10) >> ");
		System.out.println(tree.contains(10));
		System.out.println("add(5)");
		tree.add(5);
		System.out.print("test contains(5) >> ");
		System.out.println(tree.contains(5));
	}

}
	
