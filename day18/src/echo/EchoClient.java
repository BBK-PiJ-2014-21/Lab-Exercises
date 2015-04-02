package echo;

import java.net.MalformedURLException;
import java.rmi.*;

public class EchoClient {

    public static void main(String[] args) throws RemoteException {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/echo");
            EchoService echoService = (EchoService) service;
			String receivedEcho = echoService.echo("Hello!");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
	}

}