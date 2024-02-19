

public class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}

// ~ tilde
// n^2  + n ~ n^2

//θ theta
//θ(n^2)
//c1 * n^2 ≤ T(n) ≤ c2 * n^2 for all n ≥ n0
