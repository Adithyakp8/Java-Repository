package EIQ;

import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        int[] array = { 4, 2, 3, 5, 1 };
        System.out.println(checkConsecutive(array.length, array));

    }

    public static int checkConsecutive(int length, int[] array) {
        Arrays.sort(array);
        int num = array[0];
        int i = 0;
        while (i < length) {
            if (num++ != array[i++]) {
                return 0;
            }
        }
        return 1;
    }
}