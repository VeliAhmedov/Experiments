package Phase3.overloading.explicitCasting;

public class NarrowConversion {
    int x;
    double y = 9.99;
    public void convert(){
        x = (int) y;
        System.out.println("from double to int, x is " + x);
    } //this will convert to 9, but we will lose 0.9 that is why it isn't safe
}
//explicit casting also called dawncasting
