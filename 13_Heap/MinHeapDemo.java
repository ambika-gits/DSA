import java.util.PriorityQueue;

public class MinHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(50);
        minHeap.offer(30);
        minHeap.offer(20);
        minHeap.offer(40);
        minHeap.offer(10);

        System.out.println("Min Heap:");

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}