package MethodReference;

import java.util.Arrays;
import java.util.List;

// for non static methods create instance
public class Test2 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("adhi", "jose");

        Refer2 rf = new Refer2();

        strs.forEach(rf::display);
    }
}