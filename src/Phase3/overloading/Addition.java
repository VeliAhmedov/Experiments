package Phase3.overloading;
public class Addition {
    //this is example by changing amount of parameters
    private int a;
    private int b;
    private int c;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    // Method to calculate the sum of two numbers.
// Declare an instance method sum with two parameters a and b having data type int.
    public void sum(int a, int b)
    {
        int s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }
    // Method to calculate sum of three numbers.
// Declare an instance method sum with three parameters a,b, and c having data type int.
// Here, the method sum() is overloaded having the same method name.
    public void sum(int a, int b, int c)
    {
        int t = a + b + c;
        System.out.println("Sum of three numbers: " +t);
    }
}
