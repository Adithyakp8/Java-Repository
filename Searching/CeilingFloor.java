package Searching;

public class CeilingFloor {
    public static void main(String args[]) {

        int[] arr = { 2, 4, 7, 9, 11, 16, 18, 19 };

        SearchingCeilFloor obj = new SearchingCeilFloor();

        System.out.println(obj.ceilingSearch(arr, 17));
        System.out.println(obj.flooringSearch(arr, 17));

    }

}

class SearchingCeilFloor {

    public int ceilingSearch(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2; // or mid = start + (end-start)/2

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public int flooringSearch(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // look

            int mid = (start + end) / 2; // or mid = start + (end-start)/2

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
