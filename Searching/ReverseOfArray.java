package Searching;

public class ReverseOfArray {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("hashcode0:" + arr.hashCode());
        System.out.println();
        TestReverse obj = new TestReverse();
        obj.bruteReverse(arr);
        obj.swapReverse(arr);

    }
}

class TestReverse {
    public void bruteReverse(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        for (int ele : newArr) {
            System.out.print(ele + " ");
        }
        System.out.print("hashcode1:" + newArr.hashCode());
        System.out.println();
    }

    public void swapReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.print("hashcode2:" + arr.hashCode());
        System.out.println();
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
