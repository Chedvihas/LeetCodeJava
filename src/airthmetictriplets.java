import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class airthmetictriplets {
    public static void main(String[] args) {
        airthmetictriplets solution = new airthmetictriplets();
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", diff = " + diff);
        System.out.println("Output: " + solution.arithmeticTriplets(nums, diff));
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> hashset = new HashSet();
        for (int num : nums)
            hashset.add(num);


        int i = 0, j = 1;
        int cnt = 0;
        while (i <= j && j < nums.length) {

            if (nums[j] - nums[i] < diff)
                j++;
            else if (nums[j] - nums[i] > diff)
                i++;
            else {
                if (hashset.contains(nums[j] + diff))
                    cnt++;
                i++;
                j++;
            }
        }

        return cnt;
    }
}
