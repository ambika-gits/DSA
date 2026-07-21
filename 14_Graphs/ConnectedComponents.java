import java.util.*;

public class ConnectedComponents {

    static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(5).add(6);
        graph.get(6).add(5);

        boolean[] visited = new boolean[vertices];

        int components = 0;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                dfs(graph, i, visited);

                components++;
            }
        }

        System.out.println("Number of Connected Components = " + components);
    }
}