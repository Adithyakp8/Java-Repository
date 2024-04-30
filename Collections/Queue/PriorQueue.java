package Collections.Queue;

import java.util.PriorityQueue;

public class PriorQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(5);
        queue.offer(1);
        queue.offer(8);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
