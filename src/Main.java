import constructorChain.Source;
import executionOrder.ExeOrder;
import innerClass.AnonymousOuterClass;
import innerClass.BankSecurity;
import innerClass.OuterClass;
import modifierExamples.AccessModifier;
import staticExamples.StExp;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //checking static and non-static
        /*
        Student.studying();
        Student student = new Student();
        student.learning();
         */

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

    }
    }
    //when constructor is private, you can't extend and can't make instance of it outside
//2 use of private constructor are:
//1. We use private constructor when we want to prevent other classes from creating an object of a class.
//2. We can use it in single tone classes where the object of the class cannot be created outside the class.

