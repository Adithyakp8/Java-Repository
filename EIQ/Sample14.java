package EIQ;

public class Sample14 {
    public static void main(String[] args) {
        System.out.println(nthCharDecrypt("a3b2", 4));
    }

    private static String nthCharDecrypt(String string, int index) {
        String newStr = new String();
        int i = 0;
        while (i < string.length()) {
            String temp = string.charAt(i) + "";
            // newStr = newStr + temp.repeat(Integer.valueOf(string.charAt(i + 1) + ""));
            i = i + 2;
        }

        if (index > newStr.length()) {
            return "-1";
        }

        return newStr.charAt(index - 1) + "";
    }
}