package Threads;

class Quantity {
    private int stock;
    private boolean canConsume = false;

    public synchronized void setStock(int stock) {
        while (canConsume) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock = stock;
        System.out.println("Put:" + stock);
        canConsume = true;
        notify();
    }

    public synchronized void getStock() {
        while (!canConsume) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get:" + stock);
        canConsume = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String args[]) {

        Quantity q = new Quantity();
        new Producer(q);
        new Consumer(q);

    }

}

class Producer implements Runnable {

    private Quantity q;

    public Producer(Quantity q) {
        this.q = q;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.setStock(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    private Quantity q;

    public Consumer(Quantity q) {
        this.q = q;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            q.getStock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
