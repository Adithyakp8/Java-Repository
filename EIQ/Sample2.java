package EIQ;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample2 {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 3, 2, 5, 6, 6, 7 };
        for (int val : removeDuplicate(arr)) {
            System.out.print(val + " ");
        }
    }

    public static int[] removeDuplicate(int[] array) {
        Set<Integer> temp = new LinkedHashSet<>();
        for (int arr : array) {
            temp.add(arr);
        }
        int[] newArray = new int[temp.size()];
        int i = 0;
        for (int s : temp) {
            newArray[i++] = s;
        }
        return newArray;
    }

}