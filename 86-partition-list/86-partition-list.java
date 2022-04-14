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
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        ListNode temp = head;
        
        while(temp != null ){
            if( temp.val<x ){
                before.next = temp;
                before = before.next;
            }else{
                after.next = temp;
                after = after.next;
            }
            temp = temp.next;
        }
        
        after.next = null;
        before.next = after_head.next;
        
        return before_head.next;
    }
}


// s: 1 2 2
// l: 4 3 5 