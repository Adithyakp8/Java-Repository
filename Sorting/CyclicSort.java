package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(findDuplicates(arr));

    }

    // Lettcode-645
    public int[] findErrorNums(int[] arr) {
        cyclicSort645(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return new int[] { arr[i], i + 1 };
            }
        }
        return new int[] {};

    }

    static void cyclicSort645(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    ////////////////////////////////////////////

    // Leetcode-442
    public static List<Integer> findDuplicates(int[] arr) {
        cyclicSort442(arr);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static int[] cyclicSort442(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    //////////////////////////////////////////

    // Leetcode-287

    public static int findDuplicate(int[] arr) {
        cyclicSort287(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return arr[arr.length];

    }

    static int[] cyclicSort287(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    ///////////////////////////////

    // Leetcode - 448
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        cyclicSort448(arr);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static int[] cyclicSort448(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    /////////////////////////////////////////////////////

    static public int missingNumber(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
