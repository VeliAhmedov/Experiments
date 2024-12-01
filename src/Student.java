public class Student {

    static int a = 5;
    int num = 1;
    public Student() {
        System.out.println("Student Constructor");
    }
    public Student(int num) {
        System.out.println("number is "+ num);
    }
    public static void studying(){
        int b = Student.a= 10;
        System.out.println("studying");
        System.out.println(b);
    }
    public void learning(){
        System.out.println("learning");
    }
    public void interesting(int x){
        System.out.println("answer is "+ x);
    }
    int m1(){
        return this.num;
    }
}
