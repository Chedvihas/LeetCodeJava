import java.util.*;

public class StarGraphCenter {
    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> degree = new HashMap<>();

        // Count the degree of each node
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            degree.put(u, degree.getOrDefault(u, 0) + 1);
            degree.put(v, degree.getOrDefault(v, 0) + 1);
        }

        // Find the node with degree n-1
        for (int node : degree.keySet()) {
            if (degree.get(node) == edges.length) {
                return node;
            }
        }

        return -1; // If center node not found
    }

    public static void main(String[] args) {
        int[][] edges1 = {{1,2},{2,3},{4,2}};
        System.out.println("Center of star graph: " + findCenter(edges1)); // Output: 2

        int[][] edges2 = {{1,2},{5,1},{1,3},{1,4}};
        System.out.println("Center of star graph: " + findCenter(edges2)); // Output: 1
    }
}
