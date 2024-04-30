package Basic;

public class Sample1 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("malayalaml"));
        System.out.println(numCheckPalindrome(127));
    }

    public static boolean checkPalindrome(String str) {
        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first++) != str.charAt(last--)) {
                return false;
            }
        }
        return true;

    }

    public static boolean numCheckPalindrome(int num) {
        int tempNum = num;
        int newNum = 0;
        while (tempNum > 0) {
            int temp = tempNum % 10;
            newNum = newNum * 10 + temp;
            tempNum = tempNum / 10;
        }

        if (newNum == num) {
            return true;
        }
        return false;
    }
}