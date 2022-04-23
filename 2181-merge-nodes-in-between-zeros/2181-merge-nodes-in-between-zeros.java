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
    public ListNode mergeNodes(ListNode head) {
        if(head.next == null){
            return null;
        }
        
        ListNode start = head.next;
        int sum = 0;
        while(start.val != 0 ){
            sum += start.val;
            start = start.next;
        }
        
        head.val = sum;
        head.next = mergeNodes(start);
        return head;
    }
}