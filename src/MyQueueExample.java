import java.util.LinkedList;
import java.util.Queue;

public class MyQueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // Displaying the elements of the Queue
        System.out.println("Queue: " + queue);

        // Removing elements from the Queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Displaying the elements of the Queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peeking at the first element without removing it
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // Displaying the elements of the Queue after peek
        System.out.println("Queue after peek: " + queue);
    }
}
