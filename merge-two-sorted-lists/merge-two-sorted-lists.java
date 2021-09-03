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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp=head;
        
        while(temp1!=null && temp2!=null ){
            if(temp1.val>temp2.val){
                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;
            }else {
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
            }
        }
        
        if(temp1!=null){
            temp.next=temp1;
        }
        
        if(temp2!=null){
            temp.next=temp2;
        }
        return head.next;
    }
}