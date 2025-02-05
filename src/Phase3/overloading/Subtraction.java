package Phase3.overloading;
//this is by changing type of variable
public class Subtraction {
    // Declare an instance method sub with two parameters x and y having data type int.
    public int sub (int x, int y){
        int a = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is " + a);
        return a;
    }
    // Declare an instance method sub with two parameters x and y having data type double.
    public double sub (double x, double y){
        double b = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is " + b);
        return b;
    }
}
