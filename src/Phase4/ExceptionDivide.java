package Phase4;

public class ExceptionDivide {
    public static int divide(int dividend, int divisor) throws CustomException {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            // Throw a new exception with additional context
            throw new CustomException("Division by zero is not allowed.", e);
        }
    }
}
