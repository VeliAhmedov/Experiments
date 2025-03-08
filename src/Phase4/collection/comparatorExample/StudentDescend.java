package Phase4.collection.comparatorExample;

import java.util.Comparator;

public class StudentDescend implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        if (o2.getAge() != o1.getAge()){
            return Integer.compare(o2.getAge(), o1.getAge());
        }else {
            return o2.getName().compareTo(o1.getName());
        }
    }
}
