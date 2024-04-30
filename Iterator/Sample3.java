package Iterator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 9);
        map.put(2, 8);

        System.out.println(map.entrySet());
        Set s = map.entrySet();

        System.out.println(s);

        Iterator iterator = s.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}