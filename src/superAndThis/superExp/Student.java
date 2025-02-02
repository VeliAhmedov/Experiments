package superAndThis.superExp;

public class Student extends Person {
    int age = 30;
    public Student(){
        //super() we don't need to put this as ava automatically put here
        //when creating object of student it will call constructor of this which go to superclass via invisible super() keyword
        //this is called constructor chaining
        System.out.println("Student Constructor");
    }
    public void show(){
        int age = 20;
        System.out.println(age); // subclass local variable 20
        System.out.println(super.age); // superclass instance variable 50
        System.out.println(this.age); //subclass instance variable 30

        Person p = new Person();
        System.out.println(p.age); //can be used instead of super but not recommended because it use RAM just for this, use super
    }
    public void display(){
        System.out.println("Student display");
    }
    public void msg(){
        display(); //Student display
        super.display(); //Person display
    }
}
//overall super is used call anything from superClass (field, method, constructor)
