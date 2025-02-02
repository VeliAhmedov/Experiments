package innerClass;
//There are 4 types of inner class
/*
1. Normal or Regular inner class: inheritance.diamondProblem.A class created inside another class and outside the method without static modifier is called regular or normal inner class.
2. Method local inner class: inheritance.diamondProblem.A class declared within a method of the outer class is called method local inner class.
3. Anonymous inner class: inheritance.diamondProblem.A class declared without any name at all is called anonymous inner class.
4. Static nested inner class: inheritance.diamondProblem.A class declared with static modifier within a class is called static nested inner class. It is also known as a top-level nested class. It can access only the static members of the outer class.
 */
public class OuterClass { //enclosing class; top level class
    //inner class that is part of nested class is non-static
    public int exp = 1;
    static int aexp = 2;
    int x = 20;
    public void display(){
        System.out.println("This is outer class");
    }

    public class InnerClass { //nested class
        int x = 40;
        public void display() {
            int x = 50;
            System.out.println("This is inner class");
            System.out.println(x); //50
            System.out.println(this.x); //40
            System.out.println(OuterClass.this.x); //20
        }
    }
    //you can access inner class with simply creating object of its in outer class
    void InnerClassAccess(){
        InnerClass innerClass = new InnerClass();
        innerClass.display();
        //you can just write variable
        System.out.println(exp);
        System.out.println(aexp);
    }
    //when something is part of it, it is good to use inner class.
    //like University and Department. Department is part of University so user inner not inheritance
    //in this case University is outer and Department is inner class
    //Same can be said about car (outer) and engine (inner)
    /*
    overall The best use of Java inner class is when its functionality is tied to its outer class.
    That is, without an existing outer class object, there is no chance of existing inner class object.
    you can see real time example I told
     */
}
/*
in here inheritance.diamondProblem.A nested class in Java has access to the members ( including private members) of its enclosing class.
But, the enclosing class does not have access to the members of the nested class.
 */
/*
enclosed class (outer class) can be static or not, can also be private or protected, things that nested (inner class) can't be
When we declare a class inside another class without static modifier, it is called inner class in Java.
It is also commonly known as a non-static nested class in Java.
 */
/*
Java compiler generates a separate dot class file for each inner class named Outer$Inner.class and for an outer class named Outer.class.
For example, an inner class inheritance.diamondProblem.A is compiled into a class Test named Test$inheritance.diamondProblem.A.class.
If any dot class file name contains “$” symbol in its middle, it shows an inner class file.
The format of the class files for inner classes has the same as class files for the outer classes.
 */
/*
Since the inner class is a regular member of the outer class just like declared variables and methods in the class.
That’s why, we can apply all java access modifiers such as public, default, protected, and private to inner class similar to the other members of a class.
 */