import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(15);
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Removed: " + pq.poll());

        System.out.println("After Removal: " + pq);
    }
}