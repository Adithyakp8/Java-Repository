package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("kusuma");
        strList.add("adithya");

        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            };
        };

        strList.sort(cmp);
        strList.forEach(ele -> System.out.println(ele));

        System.out.println("kusuma".compareTo("adithya"));

    }
}
