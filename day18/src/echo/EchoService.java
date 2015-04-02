package echo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This simple service receives a String and returns the same String.
 * This service has traditionally listened at port 7.
 */
public interface EchoService extends Remote {
	/**
	 * Returns the same string passed as parameter
	 * @param s a string
	 * @return the same string passed as parameter
	 */
	public String echo(String s) throws RemoteException;
}

