public class Stacks {
    private int maxSize;
    private int top;
    private String[] stackArray;

    public Stacks(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public String pop() {
        if (top >= 0) {
            String poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return null;
        }
    }

    public String peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(5);

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.peek();
    }
}
