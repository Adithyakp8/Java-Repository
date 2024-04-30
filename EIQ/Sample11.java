package EIQ;

import java.util.Stack;

public class Sample11 {
    public static void main(String[] args) {
        System.out.println(isStringCorrect("{adithya{hai}fine}"));
    }

    private static String isStringCorrect(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '{') {
                stack.push(c);
            }

            if (c == '}') {
                if (stack.isEmpty()) {
                    return "Error";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "Correct" : "Error";
    }
}
