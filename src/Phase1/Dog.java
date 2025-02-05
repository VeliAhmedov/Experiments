package Phase1;

public class Dog extends Pet{
    String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void Display(){
        System.out.println("pet's name is "+ name +" and his breed is "+ breed);
    }
}
