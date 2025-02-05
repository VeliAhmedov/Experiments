package Phase3.overloading.objectParameters;

public class FoodTest {
    public void food(Animal animal) {
        System.out.println("Animals eat vegetarian and meat food");
    }
    public void food(Lion lion) {
        System.out.println("Lions eat meat food");
    }
}
