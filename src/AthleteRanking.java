import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AthleteRanking {
    public static String[] findRanks(int[] score) {
        int n = score.length;
        String[] ranks = new String[n];

        // Create a priority queue to sort the athletes based on their scores
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for (int i = 0; i < n; i++) {
            pq.offer(i);
        }

        // Define the ranks
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        // Assign ranks based on placement
        for (int i = 0; i < 3; i++) {
            int idx = pq.poll();
            ranks[idx] = medals[i];
        }

        // Assign ranks for the rest
        int rank = 4;
        while (!pq.isEmpty()) {
            int idx = pq.poll();
            ranks[idx] = String.valueOf(rank++);
        }

        return ranks;
    }

    public static void main(String[] args) {
        int[] score = {0, 8, 2, 3, 1}; // "5", "Gold medal", "Bronze medal", "Silver medal" , "4"
        String[] ranks = findRanks(score);
        System.out.println(Arrays.toString(ranks));
    }
}
