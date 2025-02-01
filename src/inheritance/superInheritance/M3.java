package inheritance.superInheritance;

public class M3 extends M1{
   public M3(String brand) {
        super(brand);
    }
    public void pedal() {
        System.out.println("Pedaling the " + brand + " bicycle");
    }
}
