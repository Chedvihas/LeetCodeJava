// ReverseLL.java



public class ReverseLL {
    NodeLL head;

    public void reverse() {
        NodeLL current = head;
        NodeLL prev = null;
        NodeLL next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void printList() {
        NodeLL temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new NodeLL(1);
        list.head.next = new NodeLL(2);
        list.head.next.next = new NodeLL(3);
        list.head.next.next.next = new NodeLL(4);

        System.out.println("Original linked list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed linked list:");
        list.printList();
    }
}
