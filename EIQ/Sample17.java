package EIQ;

public class Sample17 {
    public static void main(String[] args) {
        System.out.println(decimaltoBinary(321));
    }

    private static int decimaltoBinary(int num) {
        String ans = "";
        while (num > 0) {
            int temp = num % 2;
            ans = temp + ans;
            num = num / 2;
        }
        return Integer.parseInt(ans);
    }
}