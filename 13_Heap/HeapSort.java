import java.util.PriorityQueue;

public class HeapSort {

    public static void heapSort(int[] arr) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
        }

        int index = 0;

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 50, 20};

        heapSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}