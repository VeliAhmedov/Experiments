package inheritance.superInheritance;

public class M2 extends M1{
    String model;
    public M2(String brand, String model) {
        super(brand);
        this.model = model;
    }
    public void drive() {
        System.out.println("Driving the " + brand + " " + model);
    }
}
