package Searching;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 8, 9, 11 };
        Searching obj = new Searching();
        System.out.println(obj.binarySearch(arr, 8));
    }

}

class Searching {
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2; // or mid = start + (end-start)/2

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return -1;
    }
}
