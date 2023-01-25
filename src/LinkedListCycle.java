import java.util.*;
public class LinkedListCycle {

//    Given head, the head of a linked list, determine if the linked list has a cycle in it.
//    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
//    Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//    Return true if there is a cycle in the linked list. Otherwise, return false.

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
