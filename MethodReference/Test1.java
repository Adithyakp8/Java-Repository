package MethodReference;

import java.util.Arrays;
import java.util.List;

//Functional programing - passing methods as parameters
// for static methods we can refer with class name
public class Test1 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("adhi", "jose");
        strs.forEach(Refer1::print);
    }
}