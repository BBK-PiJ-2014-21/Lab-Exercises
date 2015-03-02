package yourFirstExceptions;

import java.util.Scanner;

/**
 *
 */
public class Launcher {
    
    public void checkedInsideTry() {
        try {
            throw new MyCheckedException();
        } catch (MyCheckedException ex) {
            System.out.println("MyCheckedException thrown and caught inside a try-catch block");
        }
    }
    
    public void checkedOutsideTry() throws MyCheckedException {
        throw new MyCheckedException("MyCheckedException thrown outside a try-catch block");
    }
    
    public void runtimeInsideTry() {
        try {
            throw new MyRuntimeException();
        } catch (MyRuntimeException ex) {
            System.out.println("MyRuntimeException thrown and caught inside a try-catch block");
        }
    }
    
    public void runtimeOutsideTry() {
        throw new MyRuntimeException("MyRuntimeException thrown outside a try-catch block");
    }
    
    public void launch() throws MyCheckedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for MyCheckedExpression inside a try-catch block");
            System.out.println("Press 2 for MyCheckedExpression outside a try-catch block");
            System.out.println("Press 3 for MyRuntimeException inside a try-catch block");
            System.out.println("Press 4 for MyRuntimeException outside a try-catch block");
            System.out.print(">> ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    try {
                        throw new MyCheckedException();
                    } catch (MyCheckedException ex) {
                        System.out.println("MyCheckedException thrown and caught inside a try-catch block");
                        System.out.println();
                        break;
                    }
                case 2:
                    throw new MyCheckedException("MyCheckedException thrown outside a try-catch block");
                case 3:
                    try {
                        throw new MyRuntimeException();
                    } catch (MyRuntimeException ex) {
                        System.out.println("MyRuntimeException thrown and caught inside a try-catch block");
                        System.out.println();
                        break;
                    }
                case 4:
                    throw new MyRuntimeException("MyRuntimeException thrown outside a try-catch block");
                default:
                    System.out.println("Invalid input");
            }
        }
    }
    
    public static void main(String[] args) throws MyCheckedException {
        Launcher x = new Launcher();
        x.launch();
    }
    
}
