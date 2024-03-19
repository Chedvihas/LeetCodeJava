import java.util.ArrayList;

class PriorityQueue {
    private ArrayList<QueueNode> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int value, int priority) {
        QueueNode newNode = new QueueNode(value, priority);
        int index = 0;
        while (index < queue.size() && queue.get(index).priority >= priority) {
            index++;
        }
        queue.add(index, newNode);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0).value;
    }


    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0).value;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private static class QueueNode {
        private int value;
        private int priority;

        public QueueNode(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }
}

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // Enqueue elements with their priorities
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(-10, 3);
        pq.enqueue(40, 2);
        // -10,10,40,20

        System.out.println(pq.peek());

        // Dequeue elements
        System.out.println("Dequeueing elements:");
        while (!pq.isEmpty()) {
            System.out.println("Dequeued: " + pq.dequeue());
        }

        // Enqueue elements again
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);
        pq.enqueue(40, 2);

        // Peek at the top element
        System.out.println(pq.peek());


    }
}
