package Phase4.generics;

public class MultipleTypeGeneric <K, V>{
    private K key;
    private V value;
    public MultipleTypeGeneric(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    @Override
    public String toString() {
        return "key=" + key + ", value=" + value;
    }
}
