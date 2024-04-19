import java.util.*;

class GraphPathFinder {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        buildGraph(edges, graph);
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }

    private void buildGraph(int[][] edges, Map<Integer, List<Integer>> graph) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
    }

    private boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int source, int destination) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        if (graph.containsKey(source)) {
            for (int neighbor : graph.get(source)) {
                if (!visited[neighbor]) {
                    if (dfs(graph, visited, neighbor, destination)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        GraphPathFinder pathFinder = new GraphPathFinder();
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 1;
        int destination = 0;
        boolean isValidPath = pathFinder.validPath(n, edges, source, destination);
        System.out.println("Is there a valid path from " + source + " to " + destination + "? " + isValidPath);
    }
}
