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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null){
            return head;
        }
        
        ListNode a = head;
        ListNode b = head;
        
        while(n-- >0){
            b = b.next;
        }
        
        if( b == null ){
            ListNode nextNode = head;
            head = head.next;
            nextNode.next = null;
            return head;
        }
        
        while(b.next != null ){
            a = a.next;
            b = b.next;
        }
        
        ListNode nextNode = a.next;
        a.next = a.next.next;
        nextNode.next = null;
        
        return head;
        
    }
}