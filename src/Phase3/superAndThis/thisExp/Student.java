package Phase3.superAndThis.thisExp;

public class Student {
    public void msg(){
        System.out.println(this); //this will print referance id in main result like thisKeyword.Hi@1db9742
        //same as Hi h = new Hi(); System.out.println(h); where h is thisKeyword.Hi@1db9742
    }
    public void m1(){
        System.out.println("m1");
    }
    public void n1(){
        this.m1();
        // m1(); or this but java will put automatically this behind it
        //Student student = new Student();
        // student.n1();
        //in main will give answer of m1 method because via this we choose m1
    }
}
//this.a;      // It calls the current class instance variable where a is an instance variable.
//this.msg();  // It calls the current class instance method where msg() is an instance method.
//this(int a); // To call parameterized constructor of the current class object.\
/*
The current class object can be referred by using this reference anywhere in the class.
The keyword “this” can be applied to instance variables, constructors, and methods.
It is used only within the member functions of the class.
In other words, it can only be used within the non-static method of a class.
This reference cannot be used outside the class.
 */

