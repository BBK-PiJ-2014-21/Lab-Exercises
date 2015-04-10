package calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 */
public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException {
        //
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        return x / y;
    }

    @Override
    public boolean print(int result) {
        System.out.println(result);
        return true;
    }

}
