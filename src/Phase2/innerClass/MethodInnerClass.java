package Phase2.innerClass;

public class MethodInnerClass {
    int x = 10; // Instance variable of class OuterClass1.
    static int y = 20; // Static variable of class OuterClass1.

    // Declaration of the static method.
    static void m3() {
        System.out.println("I am in OuterClass1 static method");
    }

    // Declaration of a static method in OuterClass2.
    public void m1() {
        //in normal, you can't access local but with final you can. though beyond java 8, it isn't necessary, you should do it
        //because it will behave like final
        final int sys = 1;
// This is a static area of m1(). So we can call only static members.
// Method local inner class starts here.

        class InnerClass1 {
            public void m2() {
                System.out.println(sys);
                System.out.println("Value of x: " + x); //if method static, not access
                System.out.println("Value of y: " + y);
                m3();
            }
        }
        InnerClass1 ic = new InnerClass1();
        ic.m2();
    }
}
/*
java doesn't support nested methods but you can use method inner class (which is class that inside of method) to use method inside class inside method
in method inner class you can't directly access local variables of method you are inside. depending on static (only static) or non-static (both static and non) method you can access instance or static variables and methods
 */
