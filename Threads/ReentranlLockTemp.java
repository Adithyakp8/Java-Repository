package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranlLockTemp {
    public static void main(String args[]) {
        LockClass obj = new LockClass();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                obj.lock.lock();
                try {
                    obj.increment();
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    obj.lock.unlock();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (obj.lock.tryLock()) {
                    try {
                        obj.decrement();
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        obj.lock.unlock();
                    }
                } else {
                    System.out.println("Derement Waiting!!!!");
                }
            }
        });

        t1.start();
        t2.start();

    }
}

class LockClass {
    public Lock lock = new ReentrantLock();

    private int count = 0;

    public void increment() {
        count++;
        System.out.println("By Incrementer:" + count);
    }

    public void decrement() {
        count--;
        System.out.println("By Decrementer:" + count);
    }
}
