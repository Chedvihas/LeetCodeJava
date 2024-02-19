//// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class MiddleElement {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        // Example usage:

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        MiddleElement solution = new MiddleElement();

        // Finding the middle node
        ListNode middle = solution.middleNode(head);

        // Printing the value of the middle node
        System.out.println("Middle node value: " + middle.val);
    }
}





//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//class MiddleElement {
//    public ListNode middleNode(ListNode head) {
//        // First pass: Count the total number of nodes
//        int count = 0;
//        ListNode current = head;
//
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//
//        // Second pass: Traverse to the middle node
//        current = head;
//        for (int i = 0; i < count / 2; i++) {
//            current = current.next;
//        }
//
//        return current;
//    }
//
//    public static void main(String[] args) {
//        // Example usage:
//
//        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//
//        MiddleElement solution = new MiddleElement();
//
//        // Finding the middle node
//        ListNode middle = solution.middleNode(head);
//
//        // Printing the value of the middle node
//        System.out.println("Middle node value: " + middle.val);
//    }
//}
