package Phase4;

public class ExceptionTest {
    public int m1 ()
    {
        try {
            System.out.println("I am in try block");
            int x = 20 / 0;
            System.out.println("Result: " + x);
        } catch (ArithmeticException ae) {
            System.out.println("I am in catch block");
            return 30;
        }
        return 100;
    }
}
