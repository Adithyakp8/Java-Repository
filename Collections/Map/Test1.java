package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        map.put('a', 2);
        map.put('d', 5);
        map.put('b', 3);
        map.put('c', 4);
        System.out.println(map.toString());
        char key = ' ';
        for (Character k : map.keySet()) {
            key = k;
        }
        System.out.println(key);

    }
}