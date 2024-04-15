class GraphAdjacencyMatrix {
    private int[][] adjacencyMatrix;
    private int vertices;

    public GraphAdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;

        // For undirected graph, add the reverse edge
         adjacencyMatrix[destination][source] = 1;
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public static void main(String[] args) {
        int vertices = 5;
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
