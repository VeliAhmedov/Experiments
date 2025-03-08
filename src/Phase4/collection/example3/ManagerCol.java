package Phase4.collection.example3;

public class ManagerCol extends EmpCol{
    String department;
    public ManagerCol(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Manager Name: " + getName() + ", Salary: $" + getSalary() + ", Department: " + getDepartment();
    }
}
