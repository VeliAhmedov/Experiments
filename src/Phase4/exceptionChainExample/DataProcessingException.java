package Phase4.exceptionChainExample;

public class DataProcessingException  extends Exception{
    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);  // Exception Chaining Constructor
    }
}
