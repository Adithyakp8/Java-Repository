package Generics;

public class Sample1 {
    public static void main(String[] args) {

        GenericTset test = new GenericTset();
        test.Print(2, 3);
        test.Print("adhi", "adithya");

        GenericTset2<Integer> test2 = new GenericTset2<>();
        test2.print(2, 4);

    }
}

class GenericTset {

    public <T> void Print(T a, T b) {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

class GenericTset2<T> {
    public void print(T a, T b) {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}