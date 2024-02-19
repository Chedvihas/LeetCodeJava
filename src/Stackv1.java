public class Stackv1<T> {
    private int maxSize;
    private int top;
    private Object[] stackArray;

    public Stackv1(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(T value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public T pop() {
        if (top >= 0) {
            T poppedValue = (T) stackArray[top--];
            System.out.println(poppedValue + " popped from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return null;
        }
    }

    public T peek() {
        if (top >= 0) {
            return (T) stackArray[top];
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
        Stackv1<Integer> intStack = new Stackv1<>(5);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Top element: " + intStack.peek());

        intStack.pop();
        intStack.pop();
        intStack.pop();

        System.out.println("Is stack empty? " + intStack.isEmpty());

        Stackv1<String> stringStack = new Stackv1<>(3);
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println("Top element: " + stringStack.peek());

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        System.out.println("Is stack empty? " + stringStack.isEmpty());
    }
}
