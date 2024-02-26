import java.util.Arrays;

public class MaxSumDivisibleByThree {
    public static int maxSumDivThree(int[] nums) {
        // Sort the array in non-decreasing order
        Arrays.sort(nums);

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 3 == 0) {
            return sum;
        }

        // Calculate the remainders when dividing the sum by 3
        int remainder1 = sum % 3;
        int remainder2 = (3 - remainder1) % 3;

        int maxSum = 0;
        // Try to remove one element with remainder1 or two elements with remainder2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == remainder1) {
                maxSum = Math.max(maxSum, sum - nums[i]);
            } else if (nums[i] % 3 == remainder2) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 3 == remainder2) {
                        maxSum = Math.max(maxSum, sum - nums[i] - nums[j]);
                        break;
                    }
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 5, 1, 8}; //3,6,1,8
        System.out.println("Maximum sum divisible by 3: " + maxSumDivThree(nums));
    }
}
