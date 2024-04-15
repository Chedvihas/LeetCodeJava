import java.util.ArrayList;
import java.util.List;

class GraphAdjacencyList {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public GraphAdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        // For undirected graph, add the reverse edge
         adjacencyList.get(destination).add(source);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);
    }

    public static void main(String[] args) {
        int vertices = 5;
        GraphAdjacencyList graph = new GraphAdjacencyList(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            List<Integer> neighbors = graph.getNeighbors(i);
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
