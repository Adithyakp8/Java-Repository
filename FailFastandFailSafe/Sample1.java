package FailFastandFailSafe;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sample1 {

    public static void main(String args[]) {
        List<Integer> list = new LinkedList();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(1);
        Iterator i = list.iterator();
        Collections.reverse(list);
        Collections.sort(list);
        while (i.hasNext()) {

            System.out.print(i.next() + " ");

        }
    }
}
