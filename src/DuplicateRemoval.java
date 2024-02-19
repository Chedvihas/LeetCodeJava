import java.util.Stack;

public class DuplicateRemoval {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";
        String result = removeDuplicates(s);
        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}
//stack :
//stack : a
//stack : a z
//stack: a z x
//stack : a z
// stack : a y
