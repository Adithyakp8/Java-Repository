package Collections.Set;

import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> sett = new HashSet<>();

        sett.add(2);
        sett.add(3);
        sett.add(8);
        sett.add(1);
        sett.add(1);

        sett.forEach(ele -> System.out.println(ele));

        HashSet<String> sett2 = new HashSet<>();

        sett2.add("adhi");
        sett2.add("kusu");
        sett2.add("boy");
        sett2.add("girl");
        sett2.add("zebra");
        sett2.add("giraffe");
        sett2.add("lion");

        sett2.forEach(ele -> System.out.println(ele));

    }
}
