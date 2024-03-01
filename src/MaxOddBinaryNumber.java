import java.util.LinkedList;
import java.util.Queue;

public class MaxOddBinaryNumber {
    public static String maxOddBinaryNumber(String s) {
        Queue<Character> queue = new LinkedList<>();
        int countOnes = 0;


        // Count the number of ones
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }

        int zeroes = s.length()  -countOnes;

        // If there are more than one '1', enqueue them
        if (countOnes > 1) {
            while (countOnes > 1) {
                queue.offer('1');
                countOnes--;
            }
        }

        // Add all zeros to the queue
        for (int i = 0; i < zeroes; i++) {
            queue.offer('0');
        }

        // Finally, enqueue the remaining '1'
        queue.offer('1');

        // Construct the resulting string from the queue
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            result.append(queue.poll());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "011";
        System.out.println("Input: " + s);
        System.out.println("Output: " + maxOddBinaryNumber(s));
    }
}
