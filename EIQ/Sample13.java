package EIQ;

public class Sample13 {
    public static void main(String[] args) {
        System.out.println(revereseString("hai hello world"));
    }

    private static String revereseString(String string) {
        String ansString = new String();
        String[] arr = string.split(" ");
        for (String str : arr) {
            ansString = str + " " + ansString;
        }
        return ansString.substring(0, ansString.length() - 1);
    }
}