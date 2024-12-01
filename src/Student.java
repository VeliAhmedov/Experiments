
// this here for checking static and non-static connection
public class Student {
    static int a = 5;
    int num = 1;
    public Student() {
        System.out.println("Student Constructor");
        System.out.println("int num is "+ num);
    }
    public Student(int num) {
        System.out.println("number is "+ num);
    }
    public static void studying(){
        int b = Student.a= 10;
        System.out.println("studying");
        System.out.println(b);
    }
    public static void talking(){
        Student s = new Student();
    }
    public void learning(){
        System.out.println("learning");
        System.out.println(" int num is "+ num);
    }
    public void interesting(int x){
        System.out.println("answer is "+ x);
    }
    int m1(){
        return this.num;
    }
    //1. we can call instance variable inside constructor
    //2. we can't call instance variable inside static method
    //3. we can call instance variable inside non-static method
    //4. we can call static method inside static method
    //5. we can call non-static method only by creating object of self class and using dot via that in static method
    //6. we can call non-static method only by creating object of self class and using dot via that in non-static method
}
