package genericLists;

public class CompanyTest {

    public static void main(String[] args) {
        Company one = new Company();
        System.out.println("one.add(\"John\", 123123");
        one.add("John", 123123);
        one.printList();
        System.out.println("one.add(\"Lol\", 21123)");
        one.add("Lol", 21123);
        one.printList();
        System.out.println("one.delete(21123)");
        one.delete(21123);
        one.printList();
        one.add("Bob", 234);
        one.add("Tom", 234);
        System.out.println("one.add(\"Bob\", 234);\n" + "one.add(\"Tom\", 234);");
        one.printList();
        System.out.println("delete(\"John\")");
        one.delete("John");
        one.printList();
        one.delete("Bob");
        System.out.println("delete(\"Bob\")");
        one.printList();
    }
}
