import inheritance.diamondProblem.A;
import inheritance.diamondProblem.B;
//import inheritance.diamondProblem.C;
import overloading.Addition;
import overloading.Multiplication;
import overloading.Subtraction;
import overloading.classCasting.A1;
import overloading.classCasting.B1;
import overloading.objectParameters.Animal;
import overloading.objectParameters.FoodTest;
import overloading.objectParameters.Lion;
import overloading.subAndSup.Sub;
import overloading.subAndSup.Sup;
import superAndThis.thisExp.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //checking static and non-static

//        Student.studying();
//        Student student = new Student();
//        student.learning();

        //this here checking method value connection
        /*
        student.interesting(student.num);
        int result = student.m1();
        System.out.println(result);
         */

        // for checking use of this on putting connection and using constructor to send value
        /*
        Teacher teacher = new Teacher(21,"Brian");
        teacher.whatIsAge();
         */

        // for checking super and this keyword constructor, sending value
        /*
        Dog dog = new Dog("buddy", "Golden");
        dog.Display();
         */

        //experiment on constructor chain via extend
        /*
        Source s = new Source();
         */

        //this ere checks how many times object ofc lass created via increment inside no-argument constructor
        /*
        StExp stExp = new StExp();
        stExp.display();
        StExp stExp2 = new StExp();
        stExp2.display();
        StExp stExp3 = new StExp();
        stExp3.display();
         */

        //adding value via constructor and calling method in car class
        /*
        Car car = new Car("BMW", 2004);
        Car.fueling(car);
         */

        //this is experiment  on execution order as for block (static or not), variables (same), methods (same)
        // constructor (all 3 type) and main method which is static
        /*
        System.out.println("Main method starts");
        ExeOrder exeOrder = new ExeOrder();
        ExeOrder exeOrder1 = new ExeOrder(300);
        System.out.println("Main method ends");
         */

        // you can assign values even in final reference.
        // final means that you can assign to new object
        /*
        final List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elem
         */

        //testing modifiers
        /*
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.access = 1;
         */

        //creation of inner class object and calling same named method
        /*
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.display();
        inner.display();
         */

        //Anonymous class example. here we call override method inside class
        /*
        AnonymousOuterClass a = new AnonymousOuterClass();
        a.aoco.MethodThatWillBeOverridden();
         */

        //Simple calculation
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter x and y");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        Calculation.calculationSum(x,y);

        //encapsulation example for encaps class
        /*
        EncaspClass encaspClass = new EncaspClass();
        encaspClass.setStdName("Kiran");
        encaspClass.setStdRollNo(4);
        encaspClass.setStdId(12334L);
        System.out.println("student name is " + encaspClass.getStdName());
        System.out.println("student roll no is " + encaspClass.getStdRollNo());
        System.out.println("student id is " + encaspClass.getStdId());
         */

        //how inheritance works
        /*
        SubClass subClass = new SubClass();
        subClass.features();
        subClass.ownFeature();
         */

        //when assigned to reference of superclass, depending on which class is assigned, it gives answer for that
        /*
        Animal animal;
        animal = new Rabbit();
        animal.makeSound();
        animal = new Parrot();
        animal.makeSound();
         */

        //when assigned to class reference animal even if assigned via rabbit can't use rabbit's methods. this is upcasting
        /*
        Animal animal = new Rabbit();
        animal.makeSound();
        animal.eat();
        // animal.munch   this here is wrong
        // but rabbit can do both its and animal's
        Rabbit rabbit = new Rabbit();
        rabbit.makeSound();
        rabbit.munch();
        rabbit.eat();
         */

        //to show inheritance between sub and super class
        /*
        M2 m2 = new M2("Toyota", "Corolla");
        M3 m3 = new M3("Schwinn");
        m2.drive();
        m2.honk();
        System.out.println();
        m3.pedal();
        m3.honk();
         */

        //super keyword in inheritance
        /*
        Number2 n2 = new Number2();
        n2.show();
        n2.showSuper();
         */

        //how access modifiers differ inside packages in inheritance
        /*
        BB bb = new BB();
        // This statement will generate compile-time error because we cannot access private members in the subclass.
        System.out.println(bb.a);
        // This statement will generate a compile time error
        // because we can access default members of the superclass in the subclass within the same package only.
        System.out.println(bb.b);
        // This statement will produce a compile time error
        // because we can access protected members of the superclass in the subclass within the same package only.
        System.out.println(bb.c);
        System.out.println(bb.d); // public members can be accessible anywhere.
         */

        //has a relationship
        /*
        //aggregation
        Address addr = new Address("New York", "NY", "USA", 10001);
        Student student = new Student("John Doe", 101, addr);
        student.display();
        student.getAddress().setCity("Los Angeles");
        student.getAddress().setState("California");
        student.display();
        //composition
        // Creating an object of Engine class.
        Engine engine = new Engine("Petrol", 300);
        Car car = new Car("Alto", engine);
        System.out.println("Name of car: " +car.getName()+ "\n" +"Type of engine: " +engine.getType()+ "\n" + "Horse power of Engine: " +engine.getHorsePower());
         */

        //this way without multiple inheritance or not causing diamond problem we can call A from C
        /*
        C c = new C();
        c.m2();
         */

        //simple overloading
        /*
        Addition a = new Addition();
        a.setA(10);
        a.setB(20);
        a.setC(3);
        int num1 = a.getA();
        int num2 = a.getB();
        int num3 = a.getC();
        a.sum(num1, num2, num3);
        a.sum(num1, num2);
        //or
        a.sum(10, 20); // It will call sum() method to calculate sum of two arguments.
        a.sum(50, 100, 200); // It will call sum() method to calculate sum of three arguments.
        //example for changing types
        Subtraction s = new Subtraction();
        s.sub(23,19);
        s.sub(12.3, 11.1);
        //example for changing sequence
        Multiplication m = new Multiplication();
        m.multiply(1.1, 3);
        m. multiply(4, 1.2);
         */

        //overloading after extend
        /*
        Sub sub = new Sub();
        sub.msg(1,2);
        sub.msg(1.1,2.2);
         */

        //overloading via objects
        /*
        // In method overloading, the resolution is always taken care of by the compiler based on the reference type only.
        // Runtime object never plays any role in overloading.
        FoodTest foodTest = new FoodTest();
        Animal animal = new Animal();
        foodTest.food(animal);
        Lion lion = new Lion();
        foodTest.food(lion);
        //it always first choose child class, that is why null choose lion subclass and not animal superclass
        foodTest.food(null);
         */

        //Class casting
        /*
        //this is generalization or widening as we assign subclass to super class which super is size wise bigger
        //that is why it is
        A1 a1 = (A1) new B1(); // A a = new B(); you can write like this because (B) is automatically put
        a1.m1();
        //a1.m2(); it isn't possible
        B1 b1 = (B1) a1; // this is down casting as we assign superclass to subclass
        b1.m2();
        b1.m1();
        //for this you will get all subclass methods with subclass's values
         */

        //simple code i did for some reason
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count: ");
        int count = scanner.nextInt();
        System.out.print("typeName: ");
        String typeName = scanner.next();
        ExpClass expClass = new ExpClass();
        expClass.setCount(count);
        expClass.setTypeName(typeName);
        expClass.display();
        System.out.println(expClass.toString());
         */

    }
    }
    //when constructor is private, you can't extend and can't make instance of it outside
//2 use of private constructor are:
//1. We use private constructor when we want to prevent other classes from creating an object of a class.
//2. We can use it in single tone classes where the object of the class cannot be created outside the class.

