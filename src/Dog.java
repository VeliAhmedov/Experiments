public class Dog extends Pet{
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    void Display(){
        System.out.println("pet's name is "+ name +" and his breed is "+ breed);
    }
}
