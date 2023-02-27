import java.util.*;
public class LinkedListCycle {

    static boolean hasCycle(ListNode head) {
        //create a set to keep track of seen nodes
        HashSet<ListNode> set = new HashSet<>();
        //create a current variable
        ListNode current = head;
        //loop through head while is not null
        while(current != null) {
            //check if node its in set, if yes return true
            if(set.contains(current)) {return true;}
            //add node to the set
            set.add(current);
            current = current.next;
        }
        //return false;
        return false;
    }
}
