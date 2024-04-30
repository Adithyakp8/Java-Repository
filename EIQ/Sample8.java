package EIQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample8 {
    public static void main(String[] args) {
        int[] moneyArr = { 20, 54, 41 };
        int[] deadlineArr = { 3, 4, 5 };
        System.out.println(findMaxMoney(3, moneyArr, deadlineArr));
    }

    private static int findMaxMoney(int length, int[] moneyArr, int[] deadlineArr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < deadlineArr.length; i++) {
            int temp = deadlineArr[i];
            if (map.containsKey(temp)) {
                map.put(temp, Math.max(map.get(temp), moneyArr[i]));
            } else {
                map.put(temp, moneyArr[i]);
            }
        }
        return map.values().stream().reduce(0, (s, e) -> s + e);
    }
}
