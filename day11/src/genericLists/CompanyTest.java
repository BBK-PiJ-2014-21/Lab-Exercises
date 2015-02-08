package genericLists;

// TODO test it, something is weirdly wrong
public class CompanyTest {

    public static void main(String[] args) {
        Company one = new Company();
        one.add("John", 123123);
        System.out.println(one.size());
   //     one.add("Lol", 21123);
   //     one.delete(21123);
        one.add("Bob", 234);
        one.add("Tom", 234);
        System.out.println("not ok");
        one.add("3", 33);
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
