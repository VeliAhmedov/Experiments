package Phase4.collection.example3;

public class EmpCol {
    private String name;
    private double salary;
    public EmpCol(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee Name: " + getName() + ", Salary: $" + getSalary();
    }
}
