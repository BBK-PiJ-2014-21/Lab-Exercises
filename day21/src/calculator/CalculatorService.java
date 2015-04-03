package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 */
public interface CalculatorService extends Remote {

    public int add(int x, int y) throws RemoteException;

    public int subtract(int x, int y) throws RemoteException;

    public int divide(int x, int y) throws RemoteException;

    public int multiply(int x, int y) throws RemoteException;

    public boolean print(int result) throws RemoteException;

}
