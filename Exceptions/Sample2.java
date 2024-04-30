package Exceptions;

import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (int element : list) {
            try {
                if (element > 4) {
                    throw new FirstCustomException("Number should be less than 4");
                }
            } catch (FirstCustomException e) {
                e.printStackTrace();
            }

        }
    }
}