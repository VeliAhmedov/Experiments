package Phase4.collection.comparatorExample;

public class StudentComparator {
    private String name;
    private int age;
    public StudentComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
