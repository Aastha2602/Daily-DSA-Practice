/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getTail(ListNode head){
        if(head == null ){
            return null;
        }
        
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null ){
            return null;
        }
        
        ListNode tail = getTail(headA);
        tail.next = headB;
        ListNode intersectionPoint = detectCycle(headA);
        tail.next = null;
        
        return intersectionPoint;
    }
    public ListNode detectCycle(ListNode head){
        if(head == null || head.next == null ){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        
        if(slow != fast){
            return null;
        }
        
        slow = head;
        while(slow != fast ){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}