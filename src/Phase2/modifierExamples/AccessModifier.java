package Phase2.modifierExamples;
//outer class can't be private
public class AccessModifier {
    // just int access doesn't let you call it in main method
    public int access;
    public AccessModifier(){

    }
    public void ModifierMethod(int access) {

    }
}
/*
for private:
1. when it is in package, you need to make constructor public (default doesn't work),for using class
2. same goes for methods and variables as if you don't make them public you can't call them because they are in difference package
3. Private members of a superclass cannot be inherited to the subclass. Therefore, they are not accessible in subclasses.
4. If we make any constructor as private, we cannot create an object of that class from another class and also cannot create the subclass of that class.
5. If we declare a method as private, it behaves as a method declared as final. We cannot call the private method from outside the class.
 */
/*
for default:
1. If we declare a method as private, it behaves as a method declared as final. We cannot call the private method from outside the class.
 */
/*
for protected:
1. Protected members are accessible inside the class and everywhere within classes in the same package and outside the package but through Phase3.inheritance only.
2. If we make constructor as protected then we can create the subclass of that class within the same package but not outside the package
 */
/*
for public:
1. Public members of a class can be used anywhere. Public members of a class can be inherited to any subclass.
 */
/*
for private protected:
1. It provides the visibility level in between the “protected access” and “private access”.
This modifier makes the variable visible in all the subclasses regardless of what package
they are in but the field cannot be accessed by other classes in the same package.
 */
