package Phase4.immutableClass;

import java.util.List;

public class ImmutableClassExp {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Private constructor to prevent direct instantiation
    private ImmutableClassExp(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Creating a defensive copy of mutable list
        this.hobbies = List.copyOf(hobbies);
    }

    // Factory method to create instances (static to create it)
    public static ImmutableClassExp createInstance(String name, int age, List<String> hobbies) {
        return new ImmutableClassExp(name, age, hobbies);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        // Returning a new list to prevent modification
        return List.copyOf(hobbies);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", hobbies=" + hobbies + "}";
    }
}
