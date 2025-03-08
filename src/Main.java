//import Phase3.inheritance.diamondProblem.C;


import Phase4.CustomException;
import Phase4.collection.HashSetExample;
import Phase4.collection.compareToExample.StudentCompareTo;
import Phase4.collection.example2.DepartmentCollection;
import Phase4.collection.example2.EmployeeCollection;
import Phase4.collection.example3.EmpCol;
import Phase4.collection.example3.ManagerCol;

import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException, CustomException {
        Scanner sc = new Scanner(System.in);
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
        /*
        System.out.println("Enter x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Calculation.calculationSum(x,y);
         */

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

        //how Phase3.inheritance works
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

        //to show Phase3.inheritance between sub and super class
        /*
        M2 m2 = new M2("Toyota", "Corolla");
        M3 m3 = new M3("Schwinn");
        m2.drive();
        m2.honk();
        System.out.println();
        m3.pedal();
        m3.honk();
         */

        //super keyword in Phase3.inheritance
        /*
        Number2 n2 = new Number2();
        n2.show();
        n2.showSuper();
         */

        //how access modifiers differ inside packages in Phase3.inheritance
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

        //this way without multiple Phase3.inheritance or not causing diamond problem we can call A from C
        /*
        C c = new C();
        c.m2();
         */

        //simple Phase3.overloading
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

        //Phase3.overloading after extend
        /*
        Sub sub = new Sub();
        sub.msg(1,2);
        sub.msg(1.1,2.2);
         */

        //Phase3.overloading via objects
        /*
        // In method Phase3.overloading, the resolution is always taken care of by the compiler based on the reference type only.
        // Runtime object never plays any role in Phase3.overloading.
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
        System.out.print("Count: ");
        int count = sc.nextInt();
        System.out.print("typeName: ");
        String typeName = sc.next();
        ExpClass expClass = new ExpClass();
        expClass.setCount(count);
        expClass.setTypeName(typeName);
        expClass.display();
        System.out.println(expClass.toString());
         */

        //override example
        /*
        Change change = new Change();
        change.marryDate();
        change.engagementDate();
         */

        //override return type change
        /*
        B2 b2 = new B2();
        A2 a2 = new A2();
        A2 a3 = new B2();
        b2.m1();
        a2.m1();
        a3.m1();
         */

        //abstract example
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum sum = new Sum();
        Deduct deduct = new Deduct();
        Multip multiply = new Multip();
        sum.calculate(a, b);
        deduct.calculate(a, b);
        multiply.calculate(a, b);
         */

        //interface example
        /*
        B3 b3 = new B3();
        b3.msg();
        b3.msg2();
        A3 a3 = new B3();
        a3.msg();
        //a3.show() | will not work because a3 is referenced to B3 so compiler checks and give compiler error
        // A3 a4 = new A3() | you can't create object of abstract (both abstract class and interface)
         */

        //interface example with 2 classes
        /*
        Rectangle rectangle = new Rectangle(1.2,3.2);
        Circle circle = new Circle(1.7);
        rectangle.draw();
        circle.draw();
        rectangle.coloring();
        circle.coloring();
        Drawable.ready();
         */

        //PHASE4
        //Exception test
        /*
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        try {
            //Note: if it was double instead of int, it will give answer infinity instead dof
            System.out.println("Calculation begins");
            int result = number1 /number2;
            System.out.println(number1 + "/" + number2 + " is " + result);
        }catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        }
        System.out.println("calculation end here");
         */

        //inside catch
        /*
        System.out.println("111");
        try {
            System.out.println("222");
            int y = 1 / 0;
        } catch (ArithmeticException e) {
            try {
                System.out.println("Hello");
                int x = 20 / 0;
            } catch (NullPointerException np) {
                System.out.println("333");
            }
        }
        System.out.println("444");
         */

        //Note: you can have multiple catch in your exception handling

        //return statement in try catch block
        //as you see end 100 isn't printed because return in method finished method overall
        /*
        ExceptionTest exceptionTest = new ExceptionTest();
        System.out.println(exceptionTest.m1());
         */

        //throw example
        /*
        int num = 1;
        for(num = 1; num <= 10; num++) {
            try
            {
                if(num == 5)
                    throw new ArithmeticException("ArithmeticException");
                else if(num < 2)
                    throw new RuntimeException("RuntimeException");
                else if(num > 9)
                    throw new NullPointerException("NullPointerException");
            }
            catch(Exception e)
            {
                System.out.println("Caught an exception");
                System.out.println(e.getMessage());
            }
        }
         */

        //throws example
        //throws IOexception used in main method
        /*
        ThrowsExample te = new ThrowsExample();
        te.accept();
        te.display();
         */

        //custom exception
        /*
        try {
            System.out.println("Enter numbers");
            int expNum1 = sc.nextInt();
            int expNum2 = sc.nextInt();
            int result = expNum1*expNum2;
            if (result>=100){
                throw new CustomException("value is bigger than 100");
            }else {
                System.out.println("result is "+result);
            }
        }catch (CustomException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
         */


//        NullPointerException e = new NullPointerException("Primary Exception");
//        e.initCause(new ArithmeticException("Root Cause: Division by zero"));
//        System.out.println(e); // Output: java.lang.NullPointerException: Primary Exception
//        System.out.println(e.getCause());

        //chained exception example
        /*
        try {
            int result = 10/0;
        } catch (Exception e) {
            // Create an instance of exception and set 'e' as its cause
            CustomException customException = new CustomException("An error occurred");
            customException.initCause(e);
            // Throw the new exception
            throw customException;
        }
         */
        //chain after chain after chan exception example
        /*
        try {
            processData();
        } catch (DataProcessingException e) {
            System.err.println("Exception: " + e.getMessage());

            // Retrieve and print the cause chain
            Throwable cause = e.getCause();
            while (cause != null) {
                System.err.println("Caused by: " + cause.getMessage());
                cause = cause.getCause();
            }
        }
         */

        //Immutable class example
        /*
        //accessing to immutable class
        List<String>hobbies = Arrays.asList("Swimming", "Reading");
        ImmutableClassExp ice = ImmutableClassExp.createInstance("Vali", 22, hobbies);
        System.out.println(ice);

        // Trying to modify the hobbies list
        hobbies.add("Hiking"); // This won't affect ImmutablePerson's hobbies
        System.out.println(ice.getHobbies());
         */
//        LocalDate ld = LocalDate.now();
//        LocalDateTime ldt = LocalDateTime.now();
//        LocalTime lt = LocalTime.now();
//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println(ld);
//        System.out.println(lt);
//        System.out.println(ldt);
//        System.out.println(zdt);
//        System.out.println(ld.getEra());
//        System.out.println(ld.minusDays(100));

//        String text = sc.nextLine().toLowerCase().trim();
//        text = text.replaceAll("[^a-z\\s]", "");
//        String[] words = text.split("\\s+");
//        Set<String> seen = new HashSet<>();
//        Set<String> duplicates = new HashSet<>();
//        for (String word : words) {
//            if (!seen.add(word)) { // If already seen, it's a duplicate
//                duplicates.add(word);
//            }
//        }
//        for (String word : duplicates) {
//            System.out.println(word);
//        }
//        sc.close();

        //via fixed size array and loop adding student info
        /*
        NewStudent[] NewStudents = new NewStudent[3];
        for (int i = 0; i < NewStudents.length; i++) {
            NewStudents[i] = new NewStudent();
            NewStudents[i].setFirstName(sc.nextLine());
            NewStudents[i].setRollNo(sc.nextInt());
            sc.nextLine();
        }
        for (NewStudent newStudent : NewStudents) {
            System.out.println(newStudent.getFirstName() + " " + newStudent.getRollNo());
        }
         */

        //2D array to sum of all elements and column each
        /*
        int [] [] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j] + "\t");
                sum += nums[i][j];
            }
            System.out.println();
        }
        for (int j = 0; j <nums[0].length; j++) {
            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += nums[i][j];
            }
            System.out.println("Sum of column["+j+"] = "+total);
        }
        System.out.println("Sum of all numbers: " + sum);
         */

        // showing total mark of each student on row
        /*
        String[ ] str = {"Deep", "Amit","Larry"}; // One dimensional array.
        int[ ][ ] marks = new int[3][5]; // Two dimensional array.
        // Allocating memory for marks obtained in three subjects by student Deep.
        marks[0][0] = 80;
        marks[0][1] = 97;
        marks[0][2] = 80;
        // Allocating memory for marks obtained in three subjects by student Amit.
        marks[1][0] = 99;
        marks[1][1] = 98;
        marks[1][2] = 100;
        // Allocating memory for marks obtained in three subjects by student Larry.
        marks[2][0] = 87;
        marks[2][1] = 99;
        marks[2][2] = 93;
        for (int i = 0; i <marks.length ; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            double percentage = (double) total / marks[i].length * 100 / 100; // Fix percentage calculation
            System.out.println(str[i] + "'s total marks: " + total);
            System.out.println(str[i] + "'s percentage: " + percentage + "%");
        }
         */

        //jagged array example
        /*
        int[ ][ ] x = new int[4][ ];
        x[0] = new int[1];
        x[1] = new int[2];
        x[2] = new int[3];
        x[3] = new int[4];
        int i, j, k = 0;
        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < i + 1; j++)
            {
                x[i][j] = k;
                k++;
            }
        }
        for(i=0; i<4; i++)
        {
            for(j=0; j<i+1; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
         */

        //transpose array example
        /*
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
         */

        //transpose matrix but we add values via scanner
        /*
        System.out.println("Enter row then column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println("Transpose matrix");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
         */

        //3D array matrix printing and showing sum of each score for each student for each department
        /*
        String[ ] department = {"Electronics", "CS", "IT"};
        String[ ] student = {"Emil","Mark", "Jason"};
        int depart, std, score, total = 0;
        double perc = 0;
        int[ ][ ][ ] scores = {
                {{75, 87, 69}, {90, 87, 85},{56, 67, 76}},
                {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}},
                {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}
        };
        for (depart = 0; depart < department.length; depart++) {
            System.out.println("Department: " + department[depart]);

            for (std = 0; std < 3; std++) {
                System.out.println(student[std]+"'s score:");

                total = 0; // Reset total for each student
                for (score = 0; score < 3; score++) {
                    System.out.print(scores[depart][std][score] + "\t");
                    total += scores[depart][std][score];
                }

                System.out.println("\nTotal scores: " + total);
                perc = (double) total / (3 * 100) * 100; // Assuming max marks per subject is 100
                System.out.println("Percentage: " + perc + "%\n");
            }
            System.out.println("-------------------");
        }
         */

        //giving fixed size to 3D array then adding  values then printing
        /*
        System.out.print("Enter number of tables: ");
        int tables = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][][] num = new int[tables][rows][cols];
        //input values
        for (int i = 0; i < tables; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print("Enter value for num[" + i + "][" + j + "][" + k + "]: ");
                    num[i][j][k] = sc.nextInt();
                }
            }
        }
        // Output values
        for (int i = 0; i < tables; i++) {
            System.out.println("Table " + (i + 1));
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(num[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
         */

        //changing value in array
        /*
        int [] nums = {10,20,30,40,50};
        ArrayValueChanger avc = new ArrayValueChanger();
        System.out.println("After array as whole modification");
        System.out.println("Original");
        for (int num : nums) {
            System.out.printf(" %d", num);
        }
        System.out.println();
        System.out.println("After");
        avc.modifyArray(nums);
        for (int num : nums) {
            System.out.printf(" %d", num);
        }
        System.out.println();

        System.out.println("Now we will modify single element of the array nums[3] before change:"+nums[3]);
        avc.modifyArrayElement(nums[3]);
        System.out.println("nums[3] after change:"+nums[3]);
         */

        //2D array passing to method
        /*
        int [][] nums = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        ArrayClassPrint acp = new ArrayClassPrint();
        acp.array2DPrint(nums);
         */

        //array as return value
        /*
        ArrayAsReturnType aart = new ArrayAsReturnType();
        int [] nums = aart.display();
        int result =0;
        for (int num : nums) {
            System.out.print(num + "\t");
            result += num;
        }
        System.out.println();
        System.out.print("sum of numbers: " + result);
         */

        //2D array to use to find sum of 2 2D arrays
        /*
        int [][] x = {
                {1,2,3},
                {4,5,6},
        };
        int [][] y = {
                {7,8,9},
                {10,11,12},
        };
        ArrayAsReturnType aart = new ArrayAsReturnType();
        int [][] z = aart.sum(x,y);
        System.out.println("2D array x:");
        aart.show(x);
        System.out.println("2D array y:");
        aart.show(y);
        System.out.println("sum of 2D array x and y:");
        aart.show(z);
         */

        //in between prime number finder
        /*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //this here put num1 to num2 and num2 to num1 if num1 is bigger number than num2
        if (num1 > num2) {
            int temp = 0;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        FindPrimeNumberInBetween.findPrimeNumberInBetween(num1, num2);
         */

        //Array copy methods
        /*
        int [] num = {1,2,3,4,5};
        int [] num1 = Arrays.copyOf(num,5);
        int [] num2 = Arrays.copyOf(num,3);
        int [] num3 = Arrays.copyOf(num,8);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
         */

        //Array stream method
        /*
        //printing
        Arrays.stream(new int[]{1, 2, 3}).forEach(System.out::println);
        //using map to print their multiplied by 2
        Arrays.stream(new int[]{1, 2, 3})
                .map(x -> x * 2)
                .forEach(System.out::println);
        //filtering by even numbers
        Arrays.stream(new int[]{1, 2, 3, 4})
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        //combining(sum) of all values
        int sum = Arrays.stream(new int[]{1, 2, 3, 4})
                .reduce(0, Integer::sum);
        System.out.println(sum);
        //collecting to list like asList does
        List<Integer> list = Arrays.stream(new Integer[]{1, 2, 3})
                .collect(Collectors.toList());
        System.out.println(list);
        //sorting array
        Arrays.stream(new int[]{3, 1, 4, 2})
                .sorted()
                .forEach(System.out::println);
        //removing duplicates
        Arrays.stream(new int[]{1, 2, 2, 3, 3})
                .distinct()
                .forEach(System.out::println);
        //restricting to specified size like copyOfRange
        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .limit(3)
                .forEach(System.out::println);
        //skipping first n elements after specified index
        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .skip(2)
                .forEach(System.out::println);
        //checking if array satisfy condition in this case if array has even number, one is enough
        boolean hasEven = Arrays.stream(new int[]{1, 2, 3})
                .anyMatch(x -> x % 2 == 0);
        System.out.println(hasEven);
         */

        //to find target number inside array via linear search
        /*
        int[ ] numbers = new int[10];
        for (int i = 0; i < 10; i++ ) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter target number");
        int number = sc.nextByte();
        boolean flag = false;
        int indexLocation = 0;
        for (int j = 0; j < 10; j++) {
            if (numbers[j] == number) {
                flag = true;
                indexLocation = j;
                break;
            }
        }
        if (flag) {
            System.out.println(number+" does exist in numbers array in index["+indexLocation+"]");
        }else {
            System.out.println(number+" does not exist in numbers array");
        }
         */

        //bubble sort algorithm example
        /*
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int length = arr.length;
        BubbleSortAlgorithm.bubbleSort(arr, length);
        System.out.println("Sorted array:");
        BubbleSortAlgorithm.printArray(arr);
         */

        //user defined object array here
        /*
        StudentArray [] sta = new StudentArray[6];
        sta[0] = new StudentArray("Vali", 22);
        sta[1] = new StudentArray("Ali", 23);
        sta[2] = new StudentArray("Murad", 39);
        sta[3] = new StudentArray("Hasan", 12);
        sta[4] = new StudentArray("Nadir", 33);
        sta[5] = new StudentArray("Samir", 25);

        for(int i =0; i <sta.length; i++){
            System.out.println("Student name: "+ sta[i].getStdName()+", student age: "+ sta[i].getAge());
        }
         */

//        Car car = new Car(4, new Engine("combusted", 6));
//        car.display();


        //random class
        /*
        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextLong());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextDouble(2,10));
        System.out.println(rand.nextFloat(2,10));
        System.out.println(rand.nextLong(2,10));
        System.out.println(rand.nextInt(2,10));
        System.out.println(rand.nextInt(10));
        byte [] randomBytes = new byte[5];
        rand.nextBytes(randomBytes);
        System.out.println(Arrays.toString(randomBytes));
        int [] randomInts = new int[5];
        RandomGenerator rg1 = new SecureRandom();
        RandomGenerator rg2 = new Random();
        IntStream intStream = rg1.ints(3,1,10);
        DoubleStream doubleStream = rg2.doubles(3,1,10);
        LongStream longStream = rg1.longs(2,10,100);
        intStream.forEach(System.out::println); //3,8,6
        doubleStream.forEach(System.out::println); // 6.9437463098716865 | 4.860742741450132 | 7.44673824345026
        longStream.forEach(System.out::println); //17, 71
        RandomGenerator rg = new SecureRandom();
        SecureRandom sr = new SecureRandom();
         */

        //Has a relationship in java
        /*
        Car [] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("How many wheels:");
            int wheels = sc.nextInt();
            sc.nextLine();
            System.out.println("Name of engine part:");
            String enginePart = sc.nextLine();
            System.out.println("Amount of cylinders:");
            int cylinders = sc.nextInt();
            cars[i] = new Car(wheels, new Engine(enginePart, cylinders));
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println("vehicle"+(i+1)+":");
            cars[i].display();
        }
         */
//        StringJoiner sj = new StringJoiner("| ");
//        RandomGenerator generator = new Random();
//        for (int i = 0; i <10; i++){
//            sj.add(String.format("%.4f",generator.nextDouble(10,20)));
//        }
//        System.out.format(sj.toString());

//        // Get library info
//        System.out.println("Enter library name:");
//        String libName = sc.nextLine();
//        System.out.println("Enter library address:");
//        String libAddress = sc.nextLine();
//        // Create library
//        Library library = new Library(libName, libAddress);
//        // Add a book
//        System.out.println("Enter book title:");
//        String title = sc.nextLine();
//        System.out.println("Enter book author:");
//        String author = sc.nextLine();
//        System.out.println("Enter ISBN:");
//        String isbn = sc.nextLine();
//        Book book1 = new Book(title, author, isbn);
//        library.addBook(book1);
//        // Display books
//        System.out.println("\nAfter adding a book:");
//        library.displayBooks();
//        // Add another book
//        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227");
//        library.addBook(book2);
//        // Display again
//        System.out.println("\nAfter adding second book:");
//        library.displayBooks();
//        // Remove a book
//        library.removeBook(isbn);
//        System.out.println("\nAfter removing book with ISBN " + isbn + ":");
//        library.displayBooks();

        //creating object of class and storing them inside collection
        /*
        ArrayList<StudentCollection> studentList = new ArrayList<>();
        System.out.println("Amount of student:");
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            Long id = (long) (i+1);
            System.out.println("Enter student name:");
            String name = sc.next();
            System.out.println("Enter student number:");
            int rollNo = sc.nextInt();
            studentList.add(new StudentCollection(id, name, rollNo));
        }
        for (StudentCollection studentCollection : studentList) {
            System.out.println(studentCollection);
        }
         */

        //storing class object that has "has a" relationship
        /*
        ArrayList<DepartmentCollection> departmentCollections = new ArrayList<>();
        System.out.println("Number of departments:");
        int numberOfDepartments = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfDepartments; i++) {
            System.out.print("Department name:");
            String depName = sc.nextLine();
            DepartmentCollection dep = new DepartmentCollection(depName);
            System.out.print("Number of employees of "+ depName+":");
            int empNum = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < empNum; j++) {
                System.out.print("Name:");
                String name = sc.nextLine();
                System.out.print("Salary:");
                double salary = sc.nextDouble();
                sc.nextLine();
//          EmployeeCollection emp = new EmployeeCollection(name, salary);
                dep.addEmployeeCollection(new EmployeeCollection(name, salary));
            }
            departmentCollections.add(dep);
        }
        System.out.println("\nAll Departments:");
        for (DepartmentCollection dept : departmentCollections) {
            dept.showDepartmentEmployeeCollections();
            System.out.println(); // Add spacing between departments
        }
         */

        //collection for "is a" relationship
        /*
        ArrayList<EmpCol> empCols = new ArrayList<>();
        System.out.println("Enter the number of employees/Manager: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("is this Manager: ");
            String isManager = sc.nextLine().toLowerCase().trim();

            System.out.println("Enter name");
            String name = sc.nextLine().trim();
            System.out.println("Enter salary");
            double salary = sc.nextDouble();
            sc.nextLine();
            if (isManager.equalsIgnoreCase("yes")){
                System.out.println("Enter department: ");
                String department = sc.nextLine().trim();
                empCols.add(new ManagerCol(name,salary, department));
            }else {
                empCols.add(new EmpCol(name, salary));
            }
        }
        System.out.println("All employees and Managers");
        for (EmpCol empCol : empCols) {
            System.out.println(empCol);
        }
         */

        //ascending user defined objects via compareTo
        ArrayList<StudentCompareTo> students = new ArrayList<>();
        StudentCompareTo sct1 = new StudentCompareTo("Vali", 12, 23);
        StudentCompareTo sct2 = new StudentCompareTo("Ali", 33, 22);
        StudentCompareTo sct3 = new StudentCompareTo("Murad", 4, 24);
        students.add(sct1);
        students.add(sct2);
        students.add(sct3);
        Collections.sort(students);
        for (StudentCompareTo sct : students) {
            System.out.println(sct);
        }





    }
}




//when constructor is private, you can't extend and can't make instance of it outside
//2 use of private constructor are:
//1. We use private constructor when we want to prevent other classes from creating an object of a class.
//2. We can use it in single tone classes where the object of the class cannot be created outside the class.

