import java.util.*;

public class BFSGraph {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(4);

        graph.get(1).add(0);
        graph.get(2).add(0);
        graph.get(3).add(1);
        graph.get(4).add(2);
        graph.get(4).add(3);

        boolean[] visited = new boolean[vertices];

        System.out.println("BFS Traversal:");

        bfs(graph, 0, visited);
    }
}