package executionOrder;

public class ExeOrder {
    // Static Variable 1
    static int staticVar1 = initStaticVar1();
    // Static Variable 2
    static int staticVar2 = initStaticVar2();

    // Instance Variable 1
    int instanceVar1 = initInstanceVar1();
    // Instance Variable 2
    int instanceVar2 = initInstanceVar2();

    // Static Block 1
    static {
        System.out.println("Static Block 1");
    }

    // Static Block 2
    static {
        System.out.println("Static Block 2");
    }

    // Instance Block 1
    {
        System.out.println("Instance Block 1");
    }

    // Instance Block 2
    {
        System.out.println("Instance Block 2");
    }

    // Default Constructor
    public ExeOrder() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public ExeOrder(int value) {
        System.out.println("Parameterized Constructor: " + value);
    }

    // Static Method to Initialize Static Variable 1
    static int initStaticVar1() {
        System.out.println("Static Variable Initialization 1");
        return 101;
    }

    // Static Method to Initialize Static Variable 2
    static int initStaticVar2() {
        System.out.println("Static Variable Initialization 2");
        return 102;
    }

    // Instance Method to Initialize Instance Variable
    int initInstanceVar1() {
        System.out.println("Instance Variable Initialization 1");
        return 201;
    }

    // Instance Method to Initialize Instance Variable
    int initInstanceVar2() {
        System.out.println("Instance Variable Initialization 2");
        return 202;
    }
    //when ExeOrder exeOrder = new ExeOrder(); , ExeOrder exeOrder1 = new ExeOrder(300);
    /*
    output:
    Main method starts
Static Variable Initialization 1
Static Variable Initialization 2
Static Block 1
Static Block 2
Instance Variable Initialization 1
Instance Variable Initialization 2
Instance Block 1
Instance Block 2
Default Constructor
Instance Variable Initialization 1
Instance Variable Initialization 2
Instance Block 1
Instance Block 2
Parameterized Constructor: 300
Main method ends
     */
}
