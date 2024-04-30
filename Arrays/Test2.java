package Arrays;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] temp = { 1, 2, 3, 4, 5 };
        rotateArr(temp, 2, 5);

    }

    public static void rotateArr(int arr[], int d, int n) {
        // code here
        if (d == 0) {
            return;
        }
        int c = d % n;
        int k = n - c;
        int arr1[] = Arrays.copyOfRange(arr, c, n);
        int arr2[] = Arrays.copyOfRange(arr, 0, c);
        for (int i = 0; i < n - c; i++) {
            arr[i] = arr1[i];
        }
        for (int j = 0; j < c; j++) {
            arr[k++] = arr2[j];
        }

        System.out.println(Arrays.toString(arr));

    }
}