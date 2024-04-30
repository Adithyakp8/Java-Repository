package EIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 95, 2, 4 };
        for (int ele : alternatArray(arr)) {
            System.out.print(ele + " ");
        }

    }

    // Alternative ascending array
    public static int[] alternatArray(int[] array) {
        Arrays.sort(array);
        List<Integer> oddArray = new ArrayList<Integer>();
        List<Integer> evenArray = new ArrayList<Integer>();
        for (int ele : array) {
            if (ele % 2 == 0) {
                evenArray.add(ele);
            } else {
                oddArray.add(ele);
            }
        }

        int[] newArray = new int[array.length];
        int i = 0, j = 0, k = 0;
        if (oddArray.get(0) < evenArray.get(0)) {
            while (i < array.length) {
                if (j < oddArray.size()) {
                    newArray[i++] = oddArray.get(j++);
                }
                if (k < evenArray.size()) {
                    newArray[i++] = evenArray.get(k++);
                }
            }
        } else {
            while (i < array.length) {
                if (k < evenArray.size()) {
                    newArray[i++] = evenArray.get(k++);
                }
                if (j < oddArray.size()) {
                    newArray[i++] = oddArray.get(j++);
                }
            }
        }
        return newArray;

    }
}
