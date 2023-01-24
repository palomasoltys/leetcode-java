class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    class MergeToSortedLinkedList {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a new ListNode called "root"
        ListNode root = new ListNode();
        // Create a ListNode called "prev" and set it equal to "root"
        ListNode prev = root;
        // While list1 is not null and list2 is not null:
        while (list1 != null && list2 != null) {
            // If the value of the current node in list1 is less than the value of the current node in list2
            if (list1.val < list2.val) {
                // Set the next node of prev to the current node in list1
                prev.next = list1;
                // Set list1 to its next node
                list1 = list1.next;
                // Else
            } else {
                // Set the next node of prev to the current node in list2
                prev.next = list2;
                // Set list2 to its next node
                list2 = list2.next;
            }
            // Set prev to its next node
            prev = prev.next;
        }
        // Set the next node of prev to the remaining non-null list(list1 or list2)
        prev.next = list1 != null ? list1 : list2;
        // Return the next node of root.
        return root.next;

    }

    }
}
