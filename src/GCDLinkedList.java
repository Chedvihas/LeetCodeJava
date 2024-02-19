

public class GCDLinkedList {

    public static void main(String[] args) {
        // Example usage:
        int[] values = {18, 6, 10, 3};
        ListNode head = createLinkedList(values);
        System.out.println("Initial Linked List: ");
        printLinkedList(head);
        ListNode result = insertGCDNodes(head);
        System.out.println("\nGCDs inserted Linked List: ");
        printLinkedList(result);
    }

    public static ListNode insertGCDNodes(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);

            // Insert a new node with the GCD value between current and next
            // 4,6,7, 8
            //2
            ListNode newNode = new ListNode(gcdValue);
            newNode.next = current.next;
            current.next = newNode;

            // Move to the next pair of nodes
            current = newNode.next;
        }

        return head;
    }

    public static int gcd(int a, int b) {
        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
