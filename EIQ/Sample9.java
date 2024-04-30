package EIQ;

public class Sample9 {
    public static void main(String[] args) {
        System.out.println(findSubstring("abac", "ab"));
        System.out.println(findSubstring2("abac", "abc"));
    }

    private static boolean findSubstring(String string, String subString) {
        return string.contains(subString);
    }

    private static boolean findSubstring2(String string, String subString) {
        for (int i = 0; i < string.length() - subString.length(); i++) {
            if (string.charAt(i) == subString.charAt(0)) {
                if (string.substring(i, i + subString.length()).equals(subString)) {
                    return true;
                }
            }
        }
        return false;
    }
}