package Temp;

public class SingletonP1 {
    public static void main(String[] args) throws Exception {
        Counter c1 = Counter.INSTANCE;
        Counter c2 = Counter.INSTANCE;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c2.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c1.i);

    }
}
