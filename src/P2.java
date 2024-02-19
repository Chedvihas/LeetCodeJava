

class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // This node will act as the dummy head of the merged list
        ListNode ansNode = new ListNode();
        // Create a reference variable tail and set it to the ansNode.
        // The tail will be used to traverse and build the merged list.
        ListNode tail = ansNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return ansNode.next;
    }
}

public class P2 {
    public static void main(String[] args) {
        // Create sample linked lists for testing
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(8)));
        ListNode list2 = new ListNode(3, new ListNode(4, new ListNode(6)));

        // Create an instance of MergeLists class
        MergeLists solution = new MergeLists();

        // Merge the two lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
        printList(mergedList);
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
