package Phase2.innerClass;
//practical, If the requirement is temporary and required only once (instant use), you should go for Java anonymous inner class.
//usefully if it is required only 1 object of class
public class AnonymousOuterClass {
public AnonymousOuterClassOverride aoco = new AnonymousOuterClassOverride(){
    @Override
    public void MethodThatWillBeOverridden() {
        System.out.println("Here this is Anonymous Class that will be overridden");
    }
};
}
/*
Java anonymous inner classes are useful when we need only one object of the class.
Since an anonymous inner class does not have a name,
it cannot have a constructor because we know a constructor name is the same as the class name.
 */
