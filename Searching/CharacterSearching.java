package Searching;

public class CharacterSearching {
    public static void main(String args[]) {

        char[] arr = { 'c', 'f', 'k', 'p' };
        SearchingChar obj = new SearchingChar();
        System.out.println(obj.largerChar(arr, 'q'));

    }
}

class SearchingChar {
    public char largerChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2; // or mid = start + (end-start)/2 mid = (start + end) / 2
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
