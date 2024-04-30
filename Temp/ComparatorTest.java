package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String args[]) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length())
                    return 1;
                else
                    return -1;
            }
        };

        List<String> nums = new ArrayList<String>();
        nums.add("adithya");
        nums.add("jose");
        nums.add("nami");

        Collections.sort(nums, com);
        System.out.println(nums);
        Collections.synchronizedCollection(nums);
    }
}
