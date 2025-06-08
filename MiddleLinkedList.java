import java.util.LinkedList;

/*
 Definition of singly-linked ListNode
    public class ListNode {
    int val;
    ListNode next;
    ListNode () {};
    ListNode (int val) {this.val = val;}
    ListNode (int.val, ListNode next) = {this.val = val; this.next = next};
 }
 */

class Solution{
    public LinkedList MiddleOfLinkedList(ListNode head ){
        // We have two pointers starting at the same position.
        // middle node point to the next position at a time  
        // If there are two middle nodes, we go to the second middle node on the right
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }

    // Time Complexity: O(n);
    // Space Complexity: O(n);
}