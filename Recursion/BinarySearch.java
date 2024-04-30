package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9, 13, 17 };
        System.out.println(binarySearch(arr, 8, 0, arr.length - 1));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            return binarySearch(arr, target, mid + 1, end);
        return binarySearch(arr, target, start, mid - 1);
    }
}
