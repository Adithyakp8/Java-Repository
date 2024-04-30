package EIQ;

public class Sample18 {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101000001));
    }

    private static int binaryToDecimal(int num) {
        double ans = 0;
        int pow = 0;
        while (num > 0) {
            int temp = num % 10;
            ans = ans + temp * Math.pow(2, pow++);
            num = num / 10;
        }
        return (int) ans;
    }
}