package EIQ;

public class Sample6 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(removeChara(str, 'l'));
    }

    private static String removeChara(String str, char c) {
        String newStr = new String();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp != c) {
                newStr = newStr + temp;
            }
        }
        return newStr;
    }
}