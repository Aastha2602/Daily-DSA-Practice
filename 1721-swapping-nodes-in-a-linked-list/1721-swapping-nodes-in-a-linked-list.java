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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t1 = head;
        ListNode t2 = head;
        ListNode temp = head;
        
        int count = k-1;
        while(count != 0){
            t1 = t1.next;
            count --;
        }
        
        int length = 0;
        while(temp.next != null ){
            temp = temp.next;
            length++;
        }
        
        int flag = length-k+1;
        while(flag != 0){
            t2 = t2.next;
            flag--;
        }
        
//         System.out.println(t1.val);
//         System.out.println(t2.val);
        
        int extra = t1.val;
        t1.val = t2.val;
        t2.val = extra;
        
        return head;
        
    }
}