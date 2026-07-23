import java.util.*;

public class DijkstraAlgorithm {

    static class Pair {

        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1, 4));
        graph.get(0).add(new Pair(2, 1));

        graph.get(2).add(new Pair(1, 2));
        graph.get(1).add(new Pair(3, 1));
        graph.get(2).add(new Pair(3, 5));
        graph.get(3).add(new Pair(4, 3));

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        int[] dist = new int[vertices];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;

        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            for (Pair neighbor : graph.get(current.node)) {

                if (dist[current.node] + neighbor.distance < dist[neighbor.node]) {

                    dist[neighbor.node] = dist[current.node] + neighbor.distance;

                    pq.offer(new Pair(neighbor.node, dist[neighbor.node]));
                }
            }
        }

        System.out.println("Shortest Distances:");

        for (int i = 0; i < vertices; i++)
            System.out.println("0 -> " + i + " = " + dist[i]);
    }
}