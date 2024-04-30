package Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 6, 1, 7 };
        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        int arr3[] = { 6, 5, 4, 3, 2, 1 };
        int arr4[] = { 6, 5, 4, 3, 2, 1 };
        int arr5[] = { 6, 5, 4, 3, 2, 1 };

        System.out.println(Arrays.toString(bubbleSort(arr3)));
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr4)));
        System.out.println(Arrays.toString(cyclicSort(arr5)));

    }

    // Worst = O{n} Best = O{n}
    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    // Worst = O{n2} Best = O{n}
    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    // Worst = O{n2} Best = O{n2}
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - 1 - i; //
            int max = findMaxElementIndex(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    private static int findMaxElementIndex(int[] arr, int start, int last) {
        int max = start;
        for (int j = start; j <= last; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }

    // Worst = O{n2} Best = O{n}
    static int[] bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
