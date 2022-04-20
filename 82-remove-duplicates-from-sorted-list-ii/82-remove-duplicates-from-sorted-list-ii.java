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
        if(head == null){
            return head;
        }
        if(head == null && head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1), prev = dummy, current = head.next;
        prev.next = head;
        
        while(current != null){
            boolean isSequence = false;
            while( current != null && prev.next.val == current.val ){
                isSequence = true;
                current = current.next;
            }
            
            if(isSequence == true ){
                prev.next = current;
            }else{
                prev = prev.next;
            }
            
            
            if(current != null){
                current = current.next;
            }
        }
        return dummy.next;
    }
}