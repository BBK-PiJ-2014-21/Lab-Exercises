package calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 */
public class CalculatorClient {

    public static void printUsageAndExit() {
        System.out.print("USAGE: This version allows just one operation ");
        System.out.println("and strictly three arguments: an integer, an operator, a second integer.");
        System.exit(1);
    }

    public static void main(String[] args) throws RemoteException {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Remote service = Naming.lookup("Calculator");
            CalculatorService cService = (CalculatorService) service;
            if (args.length != 3) {
                System.out.println("1");
                printUsageAndExit();
            } else if(!args[1].equals("+") && !args[1].equals("-") && !args[1].equals("*") && !args[1].equals("/")) {
                System.out.println("2");
                printUsageAndExit();
            } else {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[2]);
                int result = 0;
                if (args[1].equals("+")) {
                    result = cService.add(x, y);
                } else if (args[1].equals("-")) {
                    result = cService.subtract(x, y);
                } else if (args[1].equals("*")) {
                    result = cService.multiply(x, y);
                } else if (args[1].equals("/")) {
                    result = cService.divide(x, y);
                } else {
                    System.out.println("3");
                    printUsageAndExit();
                }
                cService.print(result);
            }
        } catch (MalformedURLException ex){
            ex.printStackTrace();
        }catch(NotBoundException ex){
            ex.printStackTrace();
        }
    }
}
