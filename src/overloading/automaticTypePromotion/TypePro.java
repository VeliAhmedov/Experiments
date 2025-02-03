package overloading.automaticTypePromotion;

public class TypePro {
    static void m1(double a)
    {
        System.out.println("double-arg");
    }
    static void m1(int a)
    {
        System.out.println("int-arg");
    }
    //in main:
//    m1(2); // Exact match is found because 2 is an integer data type. So, output is int-arg.
//    m1(1.5f); // Exact match is found because 1.5f is an float data type. So, output is double-arg.

    public void m2(double a)
    {
        System.out.println(a*a);
    }
    public void m2(float a)
    {
        System.out.println(a*a);
    }
    //in main:
//    TypePro t = new TypePro();
//    t.m1(2); // Exact match is not found for passing argument 2 because 2 is an integer data type.
    //output will be "4.00"

    /*
    1. When an exact match is not found for passing argument then the compiler finds the method with the smallest argument.
    2. In the above example, float and double both belong to float category data type.
       Due to which an exact match is not found for passing argument 2 because 2 is an integer data type.
       Therefore, the compiler finds the method with the smallest argument float rather than double.
       The float data type is a smaller size than double and consumes less memory.
     */
    public void m3(double a)
    {
        System.out.println(a+a);
    }
    public void m3(short a)
    {
        System.out.println(a+a);
    }
    //in main, output is 4.00
    /*1. In this example program, 2 is an integer whereas short belongs to integer category data type but small size
      primitive data type and double belongs to the float category data type. So, the exact match is not found.
      2. Since the int (large size primitive data type) cannot be promoted to short (small size primitive data type).
      Therefore, 2 cannot be promoted to the short.
      3. Since the small size primitive data type can be promoted to large size primitive data type.
      Therefore, 2 will be promoted to double and the compiler will call the method with a double argument.
     */

    //if it is short and byte for both them it will give compile error because there is size for it

    //show all exmaples
    /*

   public void m1(int i)
   {
      System.out.println("Hello");
   }
   public void m1(float f)
   {
      System.out.println("Java");
   }
public static void main(String[] args)
{
      TypePro t = new TypePro();
      t.m1(10);
      t.m1(10.5f);
      t.m1('a');
      t.m1(10l);
   // t.m1(10.5); // Compile time error.

}
     */
}
