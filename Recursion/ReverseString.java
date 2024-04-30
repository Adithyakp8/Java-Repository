package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "nami";
        System.out.println(reverseString(str, str.length() - 1));
        reverseNum(1234);
        System.out.println(sum);

    }

    static String reverseString(String str, int length) {
        if (length == 0) {
            return str.charAt(0) + "";
        }
        return str.charAt(length) + reverseString(str, length - 1);
    }

    static int sum = 0;

    static void reverseNum(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverseNum(num / 10);
    }
}
