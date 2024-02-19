class LinearNode<T> {
    private LinearNode<T> next;
    public T element;

    public LinearNode(T elem) {
        next = null;
        element = elem;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> node) {
        next = node;
    }
}

public class LinkedListOperations {
    public static LinearNode cloneTail(LinearNode head, int index) {
        // Traverse the list to the node at the given index
        LinearNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        // Create a new list starting from the node at the given index
        LinearNode newHead = new LinearNode(current.element);
        LinearNode tail = newHead;
        current = current.getNext();
        while (current != null) {
            tail.setNext(new LinearNode(current.element));
            tail = tail.getNext();
            current = current.getNext();
        }

        return newHead;
    }

    // Method to display the elements of a linked list
    public static void displayList(LinearNode head) {
        LinearNode current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        LinearNode<Character> head = new LinearNode<>('A');
        head.setNext(new LinearNode<>('B'));
        head.getNext().setNext(new LinearNode<>('C'));

        displayList(head); // Output: A B C

        LinearNode<Character> newHead = cloneTail(head, 1);
        displayList(newHead); // Output: B C
    }
}
