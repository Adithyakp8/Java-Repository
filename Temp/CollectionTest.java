package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
    public static void main(String args[]) {
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(8);
        // nums.add(2);
        // nums.add(5);
        // nums.add(8);
        // nums.forEach(n -> {
        // System.out.println(n);
        // });

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(2);
        nums.add(5);

        Collections.sort(nums);
        System.out.println(nums);

    }
}
