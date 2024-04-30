package Temp;

import java.util.Scanner;

interface Test {
    public void show();

    default void display() {
        System.out.println("in display default!!");
    }

    static void play() {
        System.out.println("in play static!!");
    }
}

public class NewInterface {
    public static void main(String args[]) {
        // Test t1 = new Test() {
        // public void show() {
        // System.out.println("in Show!!");
        // }

        // public void display() {
        // System.out.println("in display default class!!");
        // }
        // };
        // t1.show();
        // t1.display();
        // Test.play();
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        System.out.println(temp);
        sc.close();
    }

}
