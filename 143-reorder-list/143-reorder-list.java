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
    public void reorderList(ListNode head) {
        if( head == null || head.next == null ){
            return ;
        }
        
        ListNode midNode = mid(head);
        ListNode nHead = midNode.next;
        midNode.next = null;
        nHead = reverse(nHead);
        ListNode c1 = head, c2 = nHead;
        
        while( c2 != null ){
            ListNode f1 = c1.next, f2 = c2.next;
            c1.next = c2;
            c2.next = f1;
            
            c1 = f1;
            c2 = f2;
        }
        
    }
    
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null ){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        
        while( current != null ){
            ListNode forward = current.next;
            current.next = previous;
            
            previous = current;
            current = forward;
        }
        return previous;
    }
    
}