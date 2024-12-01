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
//explanation why super() called by compiler in Source(int s)
/*
**Understanding the Constructor Chain**

In the provided Java code, the `Proteins` constructor is indeed called, even though there's no explicit call to it in the `Source` class. This is due to Java's constructor chaining mechanism.

**How it Works:**

1. **Implicit Superclass Constructor Call:**
   - Whenever a subclass constructor is invoked, the first thing the JVM does is call the superclass's constructor.
   - If you don't explicitly call a superclass constructor using the `super()` keyword, the compiler automatically inserts a call to the default (no-argument) constructor of the superclass.

2. **Constructor Execution Order:**
   - In the `Source` class, the two-argument constructor is called first.
   - Within this constructor, the `this(1)` statement is used to call the one-argument constructor of the same class.
   - **Before the one-argument constructor executes, the implicit call to the superclass (Proteins) constructor takes place.**

**Why the `Proteins` Constructor is Called:**

The `Proteins` constructor is essential for initializing the base class's state. In this case, it prints the basic information about proteins. By calling this constructor, the `Source` class ensures that the fundamental properties of proteins are established before proceeding with its own specific initializations.

**In summary:**

- The `Source` class inherits from the `Proteins` class.
- When an instance of `Source` is created, its constructor chain is triggered.
- The implicit call to the `Proteins` constructor is the first step in this chain, ensuring that the base class is properly initialized.

This mechanism guarantees that the subclass inherits and builds upon the properties and behaviors of its superclass, ensuring a well-structured and organized object-oriented design.

 */
