package Phase4.generics.interfaceGeneric;

public class GenericClassThatImp <T> implements GenericInterface<T>{
    private T t;
    @Override
    public void m1(T t) {
        System.out.println("M1 test");
        System.out.println("T value is "+ t);
    }
}
