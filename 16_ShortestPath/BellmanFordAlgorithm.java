import java.util.*;

public class BellmanFordAlgorithm {

    static class Edge {

        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {

            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, -1));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 2));
        edges.add(new Edge(1, 4, 2));
        edges.add(new Edge(3, 2, 5));
        edges.add(new Edge(3, 1, 1));
        edges.add(new Edge(4, 3, -3));

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[0] = 0;

        for (int i = 1; i < vertices; i++) {

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE &&
                        distance[edge.source] + edge.weight < distance[edge.destination]) {

                    distance[edge.destination] = distance[edge.source] + edge.weight;
                }
            }
        }

        boolean negativeCycle = false;

        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {

                negativeCycle = true;
            }
        }

        if (negativeCycle) {

            System.out.println("Negative Weight Cycle Detected");

        } else {

            System.out.println("Shortest Distances:");

            for (int i = 0; i < vertices; i++)
                System.out.println("0 -> " + i + " = " + distance[i]);
        }
    }
}