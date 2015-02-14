package practicingTDD;

import java.util.Scanner;

/**
 * 
 */
public class TestScript {
    
    public Library getLibrary(int n) {
        Library l = new LibraryImpl("National Library", n);
        l.addBook("Book1", "Author1");
        l.addBook("Book2", "Author2");
        l.addBook("Book3", "Author3");
        l.addBook("Book4", "Author4");
        l.addBook("Book5", "Author5");
        l.addBook("Book6", "Author6");
        return l;
    }
    
    public static void main(String[] args) {
        TestScript t = new TestScript();
        System.out.print("Set max book policy: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("TEST1 (Policy: 3 books)");
        t.test1(n);
        System.out.println();
        System.out.println("TEST2 (Policy: 3 books)");
        t.test2(n);
        System.out.println("TEST3 (Policy: 3 books)");
        t.test3(n);
    }
    
    public void test1(int n) {
        Library l = getLibrary(n);
        User john = new UserImpl("John");
        john.register(l);
        john.takeBook("Book1");
        john.returnBook("Book1");
        printUserBorrowingList(john);
    }
    
    public void test2(int n) {
        Library l = getLibrary(n);
        User john = new UserImpl("John");
        john.register(l);
        john.takeBook("Book1");
        john.takeBook("Book2");
        john.takeBook("Book3");
        john.takeBook("Book4");
        printUserBorrowingList(john);
        john.returnBook("Book3");
        john.takeBook("Book4");
        printUserBorrowingList(john);
    }
    
    public void test3(int n) {
        Library l = getLibrary(n);
        User john = new UserImpl("John");
        User timmy = new UserImpl("Timmy");
        User jimmy = new UserImpl("Jimmy");
        User lenny = new UserImpl("Lenny");
        john.register(l);
        timmy.register(l);
        jimmy.register(l);
        lenny.register(l);
        john.takeBook("Book1");
        john.takeBook("Book2");
        timmy.takeBook("Book3");
        timmy.takeBook("Book4");
        timmy.takeBook("Book5");
        timmy.takeBook("Book6");    // out of policy of 3 books.
        timmy.takeBook("Book5");    // already borrowed with policy of 3 books
        lenny.takeBook("Book6");
        System.out.println("Borrower of \"Book6\":");
        System.out.println(l.getBorrower("Book6"));
    }
    
    public void printUserBorrowingList(User user) {
        System.out.println(user.getName() + "'s borrowed list:");
        if(user.listBorrowed().isEmpty()) {
            System.out.println("<borrowed list empty>");
        } else {
            for (int i = 0; i < user.listBorrowed().size(); i++) {
                System.out.println(user.listBorrowed().get(i));
            }
        }
    }
        
}
