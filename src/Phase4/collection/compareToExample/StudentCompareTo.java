package Phase4.collection.compareToExample;

public class StudentCompareTo implements Comparable<StudentCompareTo>{
    String name;
    int rollno;
    int age;
    //compare students based on rollNo
    public StudentCompareTo(String name, int rollno,int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    @Override // Implementing the compareTo method defined in Comparable interface.
    public int compareTo(StudentCompareTo stc)
    {
        // Logic for sorting elements in ascending order.
        if(rollno == stc.rollno)
            return 0;
        else if(rollno > stc.rollno)
            return -1;
        else
            return 1;
    }
    @Override
    public String toString() {
        return  "name='" + name + ", rollno=" + rollno + ", age=" + age;
    }
}
