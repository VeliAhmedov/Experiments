package Phase3.abstraction.interfaceExp2;

public interface Drawable {
    public void draw();
    //via default keyword you can use method that doesn't need to be defined on other classes that implements
    default void coloring(){
        System.out.println("coloring");
    }
    //same after java 8 you can have static method inside interface
    static void ready(){
        System.out.println("ready drawing");
    }
}
