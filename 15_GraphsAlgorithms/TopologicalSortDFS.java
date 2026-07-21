import java.util.*;

public class TopologicalSortDFS {

    static void dfs(ArrayList<ArrayList<Integer>> graph, int node,
                    boolean[] visited, Stack<Integer> stack) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor])
                dfs(graph, neighbor, visited, stack);
        }

        stack.push(node);
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        boolean[] visited = new boolean[vertices];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {

            if (!visited[i])
                dfs(graph, i, visited, stack);
        }

        System.out.println("Topological Order:");

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}