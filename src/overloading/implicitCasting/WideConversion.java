package overloading.implicitCasting;
public class WideConversion {
    int a = 50;
    double d = 100;
    // Automatic type conversion
    long l = a;
//  int i = l; // Type mismatch: cannot convert from long to int.
    // Automatic type conversion
    float f = l;
    // int i1 = f; // Type mismatch: cannot convert from float to int.
// float f1 = d; // Type mismatch.
    double d1 = f;
}
//implicit casting also called upcasting
