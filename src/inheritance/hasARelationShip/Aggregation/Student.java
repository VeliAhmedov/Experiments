package inheritance.hasARelationShip.Aggregation;

public class Student {
    private String name;
    private int rollNo;
    private Address address; // Aggregation

    // Constructor
    public Student(String name, int rollNo, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Address getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
        System.out.println("Address: " + address.getCity() + " " + address.getState() + " " +
                address.getCountry() + " " + address.getPinCode());
        System.out.println();
    }
}
