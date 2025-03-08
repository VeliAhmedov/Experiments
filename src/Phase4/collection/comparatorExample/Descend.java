package Phase4.collection.comparatorExample;

import java.util.Comparator;

public class Descend implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
