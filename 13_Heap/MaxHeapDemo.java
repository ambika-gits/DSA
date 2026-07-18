import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(50);
        maxHeap.offer(30);
        maxHeap.offer(20);
        maxHeap.offer(40);
        maxHeap.offer(10);

        System.out.println("Max Heap:");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}