package EIQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample5 {
    public static void main(String[] args) {
        String str = "aaabcddd";
        System.out.println(printLargestOcuurence(str).toString());

    }

    private static Character printLargestOcuurence(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                Integer val = map.get(c);
                map.put(c, val + 1);

            } else {
                map.put(c, 1);
            }
        }
        int max = Collections.max(map.values());
        List<Character> ans = new ArrayList<>();
        for (Character key : map.keySet()) {
            if (map.get(key) == max) {
                ans.add(key);
            }
        }
        if (ans.size() > 1) {
            return '0';
        }
        return ans.get(0);
    }

}