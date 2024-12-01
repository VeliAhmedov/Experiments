package privateConstructor;

public class PrvCons {
    int age;
    String name;

    private PrvCons(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void display() {
        System.out.println("age "+age);
        System.out.println("name "+name);
    }
    //we can only create object of this class inside this class not in main because constructor is private
    //but if we declared public or default constructor then we can use
}
