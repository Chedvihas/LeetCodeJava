public class LongestBalancedSubstring {
    public static int longestBalancedSubstring(String s) {
        int maxLen = 0;
        int count0 = 0; // count of zeros
        int count1 = 0; // count of ones

        for (char c : s.toCharArray()) {
            if (c == '0') {
                count0++;
            } else {
                count1++;
            }

            // If counts are equal, update maxLen
            if (count0 == count1) {
                maxLen = Math.max(maxLen, count0 + count1);
            } else if (count0 < count1) { // Reset counts if count1 is greater than count0
                count0 = 0;
                count1 = 0;
            }
        }

        count0 = 0;
        count1 = 0;

        // Traverse the string in reverse to handle cases where count1 > count0
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                count0++;
            } else {
                count1++;
            }

            // If counts are equal, update maxLen
            if (count0 == count1) {
                maxLen = Math.max(maxLen, count0 + count1);
            } else if (count0 > count1) { // Reset counts if count0 is greater than count1
                count0 = 0;
                count1 = 0;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(longestBalancedSubstring("01000111")); //00001111 - len = 8
        System.out.println(longestBalancedSubstring("00111"));// 0011- len = 4
        System.out.println(longestBalancedSubstring("111")); // no Os - len = 0
    }
}
