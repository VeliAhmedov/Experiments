package Phase2.constructorChain;

public class Protein {
    Protein()
    {
        //this is no-argument constructor, that is why it must be invoked, that is why, compiler created super() in Source(int s)
        //but if this had parameters then it will not be invoked and give compile error
        System.out.println("Protein is one of the basic building blocks of the Human body. ");
        System.out.println("Hair, Skin, Eyes, Muscles, and organs are all made up of Protein");
    }
}

