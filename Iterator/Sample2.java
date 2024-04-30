package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample2 {
    public static void main(String[] args) {

        Set<Integer> temp = new HashSet<>(Arrays.asList(1, 2, 3, 4, 4, 3, 1));

        Iterator<Integer> iterator = temp.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}