package Phase4.collection.example1;

public class StudentCollection {
    private String name;
    private Long id;
    private Integer rollNo;
    public StudentCollection(Long id, String name, Integer rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getRollNo() {
        return rollNo;
    }
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{Id='" + getId() + "', Name=" + getName() + ", Roll Number=" + getRollNo() + "}";
    }
}
