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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        
        ListNode copyHead=head;
        
        int len=1;
        while(copyHead.next!=null){
            copyHead=copyHead.next;
            len++;
        }
        
        copyHead.next=head;
        for(int i=len-k%len;i>1;i--){
            head=head.next;
        }
        
        copyHead=head.next;
        head.next=null;
        
        return copyHead;
        
    }
}