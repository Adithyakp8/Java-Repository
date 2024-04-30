package Searching;

public class InfiniteArraySearch {
    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 8, 9, 12, 17, 19, 25, 38, 68, 78, 88 }; // this should be infinite otherwise array out of
                                                                       // bound
        System.out.println(findAns(arr, 8));

    }

    static int findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2; // or mid = start + (end-start)/2 (start + end) / 2

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
