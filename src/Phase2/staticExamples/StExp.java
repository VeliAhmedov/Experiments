package Phase2.staticExamples;
public class StExp {
        // Create a static variable and initialize it 0.
        static int x = 0; // It will get memory only once and retain its value.
        // Declare a constructor.
        public StExp()
        {
            x++; // It will increment the static variable by 1 for each object creation.
        }
        // Declare an instance method.
        public void display()
        {
            System.out.println(x);
        }
}
