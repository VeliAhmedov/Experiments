package constructorChain;

public class Source extends Protein{
    public Source()
    {
        this(1);
        System.out.println("Source of Proteins are milk, eggs, meat, pulses, soybeans");
    }
    Source(int s)
    {
        // Here, we have not placed super() keyword.
        // Compiler will automatically put the super() keyword.
        // JVM calls superclass constructor.
        System.out.println("Proteins are made up of amino acids");
    }
}
