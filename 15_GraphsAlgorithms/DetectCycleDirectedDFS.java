import java.util.*;

public class DetectCycleDirectedDFS {

    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node,
                       boolean[] visited, boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(graph, neighbor, visited, pathVisited))
                    return true;

            } else if (pathVisited[neighbor]) {

                return true;
            }
        }

        pathVisited[node] = false;

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);

        boolean[] visited = new boolean[vertices];
        boolean[] pathVisited = new boolean[vertices];

        boolean cycle = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (dfs(graph, i, visited, pathVisited)) {

                    cycle = true;
                    break;
                }
            }
        }

        System.out.println(cycle ? "Cycle Detected" : "No Cycle");
    }
}