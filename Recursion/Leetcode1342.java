package Recursion;

public class Leetcode1342 {
    public static void main(String[] args) {

    }

    public static int numberOfSteps(int num) {
        return helperFunction(num, 0);
    }

    private static int helperFunction(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helperFunction(num / 2, steps + 1);
        }
        return helperFunction(num - 1, steps + 1);
    }
}
