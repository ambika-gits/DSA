import java.util.*;

public class DetectCycleUndirectedBFS {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    static boolean isCycle(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(start, -1));
        visited[start] = true;

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            int node = current.node;
            int parent = current.parent;

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(new Pair(neighbor, node));

                } else if (neighbor != parent) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0);
        graph.get(0).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean[] visited = new boolean[vertices];

        boolean cycle = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (isCycle(graph, i, visited)) {
                    cycle = true;
                    break;
                }
            }
        }

        System.out.println(cycle ? "Cycle Detected" : "No Cycle");
    }
}