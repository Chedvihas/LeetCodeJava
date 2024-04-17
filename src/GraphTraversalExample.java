import java.util.*;

public class GraphTraversalExample {
    static class Graph {
        private int V;
        private LinkedList<Integer>[] adj;

        Graph(int v) {
            V = v;
            adj = new LinkedList[V];
            for (int i = 0; i < V; ++i)
                adj[i] = new LinkedList<>();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v); // Adding the edge in both directions for an undirected graph
        }

        void BFS(int s) {
            boolean[] visited = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<>();

            visited[s] = true;
            queue.add(s);

            while (!queue.isEmpty()) {
                s = queue.poll();
                System.out.print(s + " ");

                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }

        void DFSUtil(int v, boolean[] visited) {
            visited[v] = true;
            System.out.print(v + " ");

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        void DFS(int v) {
            boolean[] visited = new boolean[V];
            DFSUtil(v, visited);
        }

        void printGraph() {
            for (int v = 0; v < V; ++v) {
                System.out.print("Adjacency list of vertex " + v);
                for (Integer n : adj[v]) {
                    System.out.print(" -> " + n);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph g = new Graph(vertices);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("Adjacency list representation of the graph:");
        g.printGraph();

        System.out.println("\nBFS starting from vertex 0:");
        g.BFS(0);

        System.out.println("\n\nDFS starting from vertex 0:");
        g.DFS(0);
    }
}
