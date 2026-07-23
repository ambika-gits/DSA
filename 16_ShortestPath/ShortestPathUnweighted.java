import java.util.*;

public class ShortestPathUnweighted {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int source) {

        int vertices = graph.size();

        int[] distance = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);
        distance[source] = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int neighbor : graph.get(node)) {

                if (distance[neighbor] == -1) {

                    distance[neighbor] = distance[node] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println("Shortest Distance from Source " + source);

        for (int i = 0; i < vertices; i++) {
            System.out.println("Node " + i + " -> " + distance[i]);
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(5);
        graph.get(4).add(5);

        bfs(graph, 0);
    }
}