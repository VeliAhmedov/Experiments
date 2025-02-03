package overloading.classCasting;

public class B1 extends A1{
    public void m2() {
        System.out.println("Subclass method");
    }
    public void m1() {
        System.out.println("Subclass method");
    } //if not override, then A1's m1 method will be shown when called A1 a1 = (A1) new B1(); a1.m1();
    //
}
