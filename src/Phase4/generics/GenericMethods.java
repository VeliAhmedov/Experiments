package Phase4.generics;

public class GenericMethods {
    public static <T> void printArray(T [] array){
        for (T element : array){
            System.out.print(element + " ");
        }
    }
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T, U> void printPair(T first, U second) {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
