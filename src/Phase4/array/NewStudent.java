package Phase4.array;

public class NewStudent {
    private String firstName;
    private int rollNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public NewStudent() {

    }

    NewStudent(String firstName, int rollNo) {
        this.firstName = firstName;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println(getFirstName() + " " + getRollNo());
    }

}
