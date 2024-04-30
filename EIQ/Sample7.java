package EIQ;

public class Sample7 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4 };
        System.out.println(minStarsCompute(arr));
    }

    private static int minStarsCompute(int[] arr) {
        int length = arr.length;
        int reqRank = (length) * (length + 1) / 2;
        int currRank = 0;
        for (int i = 0; i < length; i++) {
            currRank = currRank + arr[i];
        }
        return reqRank - currRank;
    }
}