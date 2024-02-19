

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Reached end of the list, no cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true; // Cycle detected
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next; // Creating a cycle

        boolean result = hasCycle(head);
        System.out.println("Has Cycle: " + result);
    }
}

//// 3->2->0-> -4
//      |<------|