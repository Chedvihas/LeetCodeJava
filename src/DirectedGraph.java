import java.util.*;

public class DirectedGraph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public DirectedGraph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge from vertex u to vertex v
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Print the adjacency list representation of the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0); // Example of a cycle

        graph.printGraph();
    }
}
