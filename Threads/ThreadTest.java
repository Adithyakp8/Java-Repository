package Threads;

abstract class Thread1 implements Runnable {
    abstract public void run();

}

public class ThreadTest {
    public static void main(String args[]) {
        Runnable obj = new Thread1() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t1:" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(obj);

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t2:" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }

}
