

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        // Calculate the length of the linked list and find the tail node
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Adjust k to be within the length of the list
        k = k % length;

        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the new head and tail after rotation
        int stepsToNewHead = length - k - 1;
        ListNode newTail = head;

        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        RotateLinkedList solution = new RotateLinkedList();

        // Example usage:
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode rotatedHead = solution.rotateRight(head, k);

        // Display the rotated linked list
        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
