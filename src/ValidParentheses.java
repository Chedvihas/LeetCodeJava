import java.util.Stack;



public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // mismatched brackets
            }
        }

        return stack.isEmpty(); // true if all brackets are matched
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Output: " + isValid(input));
    }
}
