package Phase4.collection.example2;

import java.util.ArrayList;
public class DepartmentCollection {
    private String departmentName;
    private ArrayList<EmployeeCollection> employeeCollections;

    public DepartmentCollection(String departmentName) {
        this.departmentName = departmentName;
        this.employeeCollections = new ArrayList<>();
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public ArrayList<EmployeeCollection> getEmployeeCollections() {
        return employeeCollections;
    }
    public void setEmployeeCollections(ArrayList<EmployeeCollection> employeeCollections) {
        this.employeeCollections = employeeCollections;
    }
    public void addEmployeeCollection(EmployeeCollection employeeCollection) {
        employeeCollections.add(employeeCollection);
    }
    public void removeEmployeeCollection(String removedName) {
        employeeCollections.removeIf(employeeCollection -> employeeCollection.getName().equalsIgnoreCase(removedName));
    }
    public void showDepartmentEmployeeCollections() {
        System.out.println("Department: " + departmentName);
        for (EmployeeCollection employeeCollection : employeeCollections) {
            System.out.println(employeeCollection);
        }
    }
}
