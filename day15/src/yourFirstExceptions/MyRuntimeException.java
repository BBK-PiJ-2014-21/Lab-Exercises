package yourFirstExceptions;

/**
 *
 */
public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super();
    }
    
    public MyRuntimeException(String s) {
        super(s);
    }
    
}
