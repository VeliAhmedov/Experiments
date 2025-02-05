package Phase3.inheritance.diamondProblem;

public class B extends A {
    public void m1(){
        System.out.println("A");
    }
    public void m2(){
        super.m2();
    }
}
