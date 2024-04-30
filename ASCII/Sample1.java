package ASCII;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        char c1 = (char) 65;
        char c2 = (char) 90;
        char c3 = (char) 97;
        char c4 = (char) 122; // Character wont work only use char
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
        for (int i = 65; i < 123; i++) {
            System.out.println((char) i);
        }

    }
}