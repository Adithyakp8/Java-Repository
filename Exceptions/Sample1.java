package Exceptions;

public class Sample1 {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        // System.out.println("Kusuma");
        finally {
            System.out.println("hai");
        }

        System.out.println("Program terminated Succesffully");
    }
}