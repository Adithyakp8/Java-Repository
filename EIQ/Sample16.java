package EIQ;

public class Sample16 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : rotateArray(arr, 2, 5)) {
            System.out.print(i + " ");
        }
    }

    private static int[] rotateArray(int[] arr, int n, int l) {

        int d = n % l;
        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, l - 1);
        reverseArr(arr, 0, l - 1);
        return arr;
    }

    private static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}