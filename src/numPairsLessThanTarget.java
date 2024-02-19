import java.util.Arrays;

public class numPairsLessThanTarget {
    public int numPairsLessThanTarget(int[] nums, int target) {
        int count = 0;
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);

        // Use two pointers approach
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            // If the sum is less than target, increment count and move left pointer to the right
            if (sum < target) {
                count += right - left;
                left++;
            } else {
                // If the sum is greater than or equal to target, move right pointer to the left
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        numPairsLessThanTarget solution = new numPairsLessThanTarget();
        int[] nums = {-1, 1, 2, 3, 1};
        int target = 2;
        System.out.println(solution.numPairsLessThanTarget(nums, target)); // Output: 3
    }
}
