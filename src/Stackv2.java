import java.util.Arrays;

public class Stackv2<Item> {
    private Item[] data;
    private int n = 0;

    public Stackv2(int cap) {
        data = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        if (data.length == n)
            resize();
        data[n++] = item;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return data[--n];
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public static void main(String[] args) {
        // Example usage with a stack of Strings
        Stackv2<String> stringStack = new Stackv2<>(3);
        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");

        System.out.println("String Stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }

        // Example usage with a stack of Integers
        Stackv2<Integer> integerStack = new Stackv2<>(3);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);

        System.out.println("\nInteger Stack:");
        while (!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }
    }

}
