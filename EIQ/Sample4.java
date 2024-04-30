package EIQ;

public class Sample4 {
    public static void main(String[] args) {
        String str = "CsharpstarZ";
        System.out.println(removeDupstring(str));

    }

    public static String removeDupstring(String str) {
        String newStr = new String();
        for (int i = 0; i < str.length(); i++) {

            Character c = str.charAt(i);

            if (!(newStr.contains(c + ""))) {
                newStr = newStr + c;
            }
        }
        return newStr;
    }
}