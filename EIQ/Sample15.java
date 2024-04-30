package EIQ;

import java.util.Stack;

public class Sample15 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 5 } };
        System.out.println(coinValue(10, 0, 1, arr));
    }

    private static int coinValue(int aBaseline, int sBaseline, int op, int[][] arr) {
        Stack<Integer> stackCoin = new Stack<>();
        Stack<Integer> stackValue = new Stack<>();

        int value = 0;
        for (int i = 0; i < op; i++) {
            if (arr[i][0] == 0) {
                if (value >= aBaseline) {
                    value = value + arr[i][1];
                } else {
                    value = value + (2 * arr[i][1]);
                }
                stackCoin.push(arr[i][1]);
                stackValue.push(value);
            } else {
                if (value > sBaseline) {
                    stackCoin.pop();
                    stackValue.pop();
                    value = stackValue.peek();
                }
            }
        }

        return value;
    }
}