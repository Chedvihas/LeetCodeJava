import java.util.PriorityQueue;

class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2}); // [8,5,4,2]]
        System.out.println(kthLargest.add(3)); // Output: 4 [4,5,8,2,3] -> [8,5,4,3,2] -> 4
        System.out.println(kthLargest.add(5)); // Output: 5 [8,5,4,5] -> 5
        System.out.println(kthLargest.add(10)); // Output: 5 [10,8,5] -> 5
        System.out.println(kthLargest.add(9)); // Output: 8 [10,9,8] - > 8
        System.out.println(kthLargest.add(4)); // Output: 8 [10,9,8] ->8
    }
}
