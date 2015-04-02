package date;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Calendar;

/**
 *
 */
public class DateClient {

    public static void main(String[] args) throws RemoteException {
        if(System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1090/date");
            DateService dateService = (DateService) service;
            Calendar receivedDate = dateService.date();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }

}
