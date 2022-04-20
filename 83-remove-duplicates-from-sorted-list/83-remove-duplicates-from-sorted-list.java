/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        
        ListNode prev = head, current = head;
        while( current != null ){
            if(prev.val != current.val ){
                prev.next = current;
                prev = prev.next;
            }
            current = current.next;
        }
        prev.next = current;
        return head;
    }
}