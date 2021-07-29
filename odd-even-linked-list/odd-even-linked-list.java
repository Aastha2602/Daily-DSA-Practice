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
    public ListNode oddEvenList(ListNode head) {
        if(head == null ){
            return null;
        }
        ListNode oddTail=head;
        ListNode evenTail=head.next;
        ListNode evenHead=head.next;
        while(evenTail!=null && evenTail.next!=null){
            oddTail.next=evenTail.next;
            oddTail=oddTail.next;
            evenTail.next=oddTail.next;
            evenTail=evenTail.next;
        }
        oddTail.next=evenHead;
        return head;
    }
}