import java.util.*;

public class MergeIdentical {
    public int[][] findSumPairs(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over items1 and calculate the total weight for each value
        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Iterate over items2 and add or update the total weight for each value
        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Convert the map to a sorted array
        List<int[]> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            resultList.add(new int[]{entry.getKey(), entry.getValue()});
        }
        Collections.sort(resultList, Comparator.comparingInt(a -> a[0]));

        // Convert the list to a 2D array
        int[][] ret = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            ret[i] = resultList.get(i);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};
        MergeIdentical solution = new MergeIdentical();
        int[][] result = solution.findSumPairs(items1, items2);
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
