package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Integer> lt = new TreeSet<>();
        lt.add(2);
        lt.add(5);
        lt.add(8);
        lt.add(17);
        lt.add(22);

        System.out.println(lt.ceiling(5));
        System.out.println(lt.ceiling(7));
        System.out.println(lt.floor(5));
        System.out.println(lt.floor(7));
        System.out.println(lt.higher(5));

    }
}
