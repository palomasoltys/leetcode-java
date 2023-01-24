public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public void main(String[] args) {
            ListNode list3 = new ListNode(4);
            ListNode list2 = new ListNode(3, list3);
            ListNode list1 = new ListNode(2, list2);
            ListNode head = new ListNode(1, list1);

            System.out.println(reverseList(head));
        }

        static ListNode reverseList(ListNode head) {
            // create a current variable and assign it to head
            var current = head;
            // create a prev variable
            ListNode prev = null;
            ListNode q = null;
            // loop through list while current is not null
            while(current != null) {
                prev = q;
                q = current;
                current = current.next;
                q.next = prev;
            }
            // return list
            return q;
        }

    }
}
