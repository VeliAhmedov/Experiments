public class Car {
    private int wheels;
    private  Engine engine;
    public Car(int wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }
    public int getWheels() {
        return wheels;
    }

    public void display(){
        System.out.println("wheel amount: " + wheels);
        engine.info();
    }
}
