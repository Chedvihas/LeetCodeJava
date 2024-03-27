class NodeLL {
    int data;
    NodeLL next;

    public NodeLL(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private NodeLL head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        NodeLL newNodeLL = new NodeLL(data);
        newNodeLL.next = head;
        head = newNodeLL;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        NodeLL newNodeLL = new NodeLL(data);

        if (head == null) {
            head = newNodeLL;
            return;
        }

        NodeLL last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNodeLL;
    }

    // Insert after a specific node
    public void insertAfter(NodeLL prevNodeLL, int data) {
        if (prevNodeLL == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        NodeLL newNodeLL = new NodeLL(data);
        newNodeLL.next = prevNodeLL.next;
        prevNodeLL.next = newNodeLL;
    }

    // Delete by value
    public void deleteByValue(int data) {
        NodeLL current = head;
        NodeLL prev = null;

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
        NodeLL current = head;

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
