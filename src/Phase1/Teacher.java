package Phase1;

public class Teacher {
    int age;
    String name;
    static String surname;
    public Teacher(){
    }
    public Teacher(int right, String name) {
        this.age = right;
        this.name = name;
    }
    public void whatIsAge() {
        System.out.println("age is " + age);
    }
    public static void Calculate() {
        Teacher teacher = new Teacher();
        teacher.whatIsAge();
    }
    public void finder(){

    }
}
