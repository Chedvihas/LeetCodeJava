import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new ArrayDeque<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1)); // Output: 1 - [1]
        System.out.println(recentCounter.ping(100)); // Output: 2 - [1,100]
        System.out.println(recentCounter.ping(3001)); // Output: 3 - [1,100,3001]
        System.out.println(recentCounter.ping(3002)); // Output: 3 - [1,100,3001,3002] - 3002-300 = 2
        //1<2 - [100,3001,3002] - 3
    }
}
