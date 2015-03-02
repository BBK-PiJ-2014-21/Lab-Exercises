package createExceptions;

/**
 *
 */
public class MyCheckedException extends Exception {
    private String errorMessage;
    
    public MyCheckedException(String errorMessage) {
        this.errorMessage = errorMessage;
    } 
    
    
    
}
