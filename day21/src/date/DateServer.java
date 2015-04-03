package date;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

/**
 *
 */
public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
        // nothing to initialise for this server.
    }

    @Override
    public Calendar date() {
        Calendar date = Calendar.getInstance();
        System.out.println(date.getTime());
        return date;
    }
    

}
