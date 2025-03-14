package Phase4.generics;

public class TestGenericClass<T> {
    T obj;
    public TestGenericClass(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }
    @Override
    public String toString() {
        return "obj= {"  + obj + '}';
    }
}
