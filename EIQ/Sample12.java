package EIQ;

public class Sample12 {
    public static void main(String[] args) {
        System.out.println(findNoOfPalindromes("malayalam adithya malayalam number string"));
    }

    private static int findNoOfPalindromes(String string) {
        int count = 0;
        String[] str = string.split(" ");
        for (String ele : str) {
            if (isPalindrome(ele)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}