package Phase4.collection.comparatorExample;

import java.util.Comparator;

public class Ascend implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
