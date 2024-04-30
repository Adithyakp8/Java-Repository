package Temp;

import java.util.concurrent.atomic.AtomicInteger;

// class Counter {
//     int count;

//     public synchronized void increment() {
//         count++;
//     }
// }

class counter {
    AtomicInteger count = new AtomicInteger();

    public synchronized void increment() {
        count.incrementAndGet();
    }
}

public class Temp {
    public static void main(String[] args) throws Exception {
        counter c = new counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t1.join();
        System.out.println(c.count);
    }
}
