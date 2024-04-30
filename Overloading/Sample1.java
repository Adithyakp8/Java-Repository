package Overloading;

public class Sample1 {
    public void m1(int i, float f) {
        System.out.println(" int float method");
    }

    public void m1(float f, int i) {
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        Sample1 s = new Sample1();
        // s.m1(20,20);
    }
}
