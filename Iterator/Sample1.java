package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> temp = Arrays.asList(1, 2, 3, 4, 5);

        Iterator<Integer> iterator = temp.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}