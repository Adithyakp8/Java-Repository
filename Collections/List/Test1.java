package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] temp = { 1, 2, 3, 4, 5 };

        List<Integer> lt = new ArrayList<>();

        for (int i : temp) {
            lt.add(i);
        }

        Collections.rotate(lt, -2); // anti clock

        lt.forEach(ele -> System.out.print(ele + " "));

    }
}