package Phase3.overriding.covariantReturnType;

public class B2 extends A2{
    @Override
    public String m1()
    {
        System.out.println("Hello, this is the subclass");
        return null;
    }
    //in parent, it was Object but here you can override to String
//    @Override
//    public Object m2()
//    {
//        System.out.println("Hello, this is the subclass");
//        return null;
//    }
    //this isn't possible because object is parent class of string, you need child class of parent type for this
}
