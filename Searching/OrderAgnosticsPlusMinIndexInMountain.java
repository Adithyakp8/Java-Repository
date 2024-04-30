package Searching;

public class OrderAgnosticsPlusMinIndexInMountain {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 6, 9, 2, 1 };
        System.out.println(findAns(arr, 2));

    }

    static int findAns(int[] arr, int target) {
        int peak = LargeSearch(arr);

        int index = orderAgnosticSearch(arr, target, 0, peak);
        if (index != -1)
            return index;
        return orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int LargeSearch(int[] arr) {

        int start = 0;
        int end = arr.length;

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
