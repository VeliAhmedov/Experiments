package Phase3.abstraction.interfaceExp2;

public class Circle implements Drawable{
    private double radius;
    private static final double pi = 3.14;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void radiusSet(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public void draw() {
        double length = 2 * pi * radius;
        System.out.println("Length to draw circle: " + length);
    }
}
