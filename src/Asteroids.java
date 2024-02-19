import java.util.Stack;
import  java.util.Arrays;
public class Asteroids {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Check for collision
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.pop();
                // Compare absolute values
                if (Math.abs(top) == Math.abs(asteroid)) {
                    // Both asteroids explode
                    asteroid = 0;
                    break;
                } else if (Math.abs(top) > Math.abs(asteroid)) {
                    // Current asteroid is destroyed
                    stack.push(top);
                    asteroid = 0;
                    break;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Asteroids solution = new Asteroids();

        // Example 1
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = solution.asteroidCollision(asteroids1);
        System.out.println(Arrays.toString(result1)); // Output: [5, 10]

        // Example 2
        int[] asteroids2 = {8, -8};
        int[] result2 = solution.asteroidCollision(asteroids2);
        System.out.println(Arrays.toString(result2)); // Output: []

        // Example 3
        int[] asteroids3 = {10, 2, -5};
        int[] result3 = solution.asteroidCollision(asteroids3);
        System.out.println(Arrays.toString(result3)); // Output: [10]
    }
}
