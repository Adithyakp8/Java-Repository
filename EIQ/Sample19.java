package EIQ;

public class Sample19 {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(321));
    }

    private static Long decimalToBinary(int dec) {

        String bin = "";
        while (dec > 0) {
            int temp = dec % 2;
            bin = temp + bin;
            dec = dec / 2;
        }
        return Long.valueOf(bin);

    }
}