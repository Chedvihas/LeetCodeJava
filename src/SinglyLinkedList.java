class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Insert after a specific node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete by value
    public void deleteByValue(int data) {
        Node current = head;
        Node prev = null;

        // If the value to be deleted is at the head
        if (current != null && current.data == data) {
            head = current.next;
            return;
        }

        // Search for the node to be deleted
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the value is not present
        if (current == null) {
            System.out.println("Value not found in the list");
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    // Traverse and print the linked list
    public void printList() {
        Node current = head;

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insertAtEnd(10);
        linkedList.insertAtBeginning(5);
        linkedList.insertAfter(linkedList.head, 8);
        linkedList.insertAtEnd(20);

        linkedList.printList();

        linkedList.deleteByValue(8);

        linkedList.printList();
    }
}
