package EIQ;

import java.util.ArrayList;
import java.util.List;

public class Sample10 {
    public static void main(String[] args) {
        System.out.println(canBeFormed("adhk", "kahd"));
    }

    private static boolean canBeFormed(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int length = string1.length();
        List<Character> temp = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            temp.add(string1.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            int index = temp.indexOf(string2.charAt(i));
            if (index == -1) {
                return false;
            }
            temp.remove(index);
        }
        return true;
    }
}