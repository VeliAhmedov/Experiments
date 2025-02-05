package Phase3.inheritance.superInheritance;

public class Number2 extends Number {
    int x = 20;
    //x here despite having same field name as superclass will show Number2's
    public void show(){
        System.out.println("Number is "+ x);
    }
    //via super, it will show super's x
    public void showSuper(){
        System.out.println("Super Number is "+super.x);
    }
}
//Thus, when superclass and subclass members have the same name in any Java program,
// we can access superclass members from the subclass by using the super keyword.
