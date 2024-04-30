package Searching;

public class BiMountain {
    public static void main(String args[]) {

        int[] arr = { 2, 3, 4, 6, 5, 2, 1 };
        System.out.println(LargeSearch(arr));

    }

    static int LargeSearch(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (start == end) {
                return start;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
