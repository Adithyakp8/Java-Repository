package Threads;

import java.util.Arrays;
import java.util.List;

public class ThreadTest2 {
    public static void main(String args[]) {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println();
        for (Integer item : items) {
            ModuloThread thread = new ModuloThread(item);
            thread.start();
        }

    }

    private static class ModuloThread extends Thread {
        private int num;

        public ModuloThread(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println(num % 3);
        }
    }
}
