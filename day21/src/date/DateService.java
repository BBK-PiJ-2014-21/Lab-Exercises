package date;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * This service answers requests for the time and date with the current time and date.
 * A similar service has traditionally listened at port 37.
 */
public interface DateService extends Remote {
    /**
     * Returns the current date and time
     * @return the current date and time.
     */
    public Calendar date() throws RemoteException;
}
