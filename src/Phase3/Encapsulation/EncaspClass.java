package Phase3.Encapsulation;

public class EncaspClass {
    private String stdName;
    private Integer stdRollNo;
    private Long stdId;

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Integer getStdRollNo() {
        return stdRollNo;
    }

    public void setStdRollNo(Integer stdRollNo) {
        this.stdRollNo = stdRollNo;
    }

    public Long getStdId() {
        return stdId;
    }

    public void setStdId(Long stdId) {
        this.stdId = stdId;
    }
//class is example for encapsulation as both variables and methods are in class for use of objects from that class
    // for encapsulation:
    //1. declare variable of class (field) as private to not let access from outside of class
    //2. have public getter and setter for accessing it via those
}
