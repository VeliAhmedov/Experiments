package Phase3.overloading;

public class Multiplication {
    public void multiply(int a, double b){
        double c = a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + c);
    }
    public  void multiply(double a, int b){
        double c = a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + c);
    }

}
