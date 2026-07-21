import java.util.*;

public class DetectCycleUndirectedDFS {

    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, int parent, boolean[] visited) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(graph, neighbor, node, visited))
                    return true;

            } else if (neighbor != parent) {

                return true;
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

        boolean[] visited = new boolean[vertices];

        boolean cycle = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (dfs(graph, i, -1, visited)) {

                    cycle = true;
                    break;
                }
            }
        }

        System.out.println(cycle ? "Cycle Detected" : "No Cycle");
    }
}