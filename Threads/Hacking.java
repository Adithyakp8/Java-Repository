package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hacking {

    public static final int MAX_PASSWORD = 999;

    public static void main(String args[]) {
        Random random = new Random();
        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingHackerThread(vault));
        threads.add(new DescendingHackerThread(vault));
        threads.add(new PoliceThread());

        for (Thread thread : threads) {
            thread.start();
        }
    }

    private static class Vault {
        private int password;

        public Vault(int password) {
            this.password = password;
        }

        public boolean isCorrectPassword(int gusss) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.password == gusss;
        }
    }

    private static abstract class HackerThread extends Thread {

        protected Vault vault;

        public HackerThread(Vault vault) {
            this.vault = vault;
            this.setPriority(MAX_PRIORITY);
            this.setName(this.getClass().getSimpleName());
        }
    }

    private static class AscendingHackerThread extends HackerThread {

        public AscendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int guess = 0; guess < MAX_PASSWORD; guess++) {
                if (vault.isCorrectPassword(guess)) {
                    System.out.println(this.getName() + " gussed the password:" + guess);
                    System.exit(0);
                }
            }
        }

    }

    private static class DescendingHackerThread extends HackerThread {
        public DescendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int guess = MAX_PASSWORD; guess >= 0; guess--) {
                if (vault.isCorrectPassword(guess)) {
                    System.out.println(this.getName() + " gussed the password:" + guess);
                    System.exit(0);
                }
            }
        }

    }

    public static class PoliceThread extends Thread {
        public void run() {
            for (int count = 10; count >= 0; count--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count);
            }
            System.out.println("Hacker Caught by Police!!");
            System.exit(0);
        }
    }

}
