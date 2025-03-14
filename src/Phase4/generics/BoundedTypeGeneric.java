package Phase4.generics;

public class BoundedTypeGeneric <T extends Number>{
    private T value;
    public BoundedTypeGeneric(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "value= " + value;
    }
}
