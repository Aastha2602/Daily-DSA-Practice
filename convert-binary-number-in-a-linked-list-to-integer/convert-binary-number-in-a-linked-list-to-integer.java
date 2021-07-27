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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        ListNode temp=head;
        
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        // storing in array
        int[] arr=new int[size];
        int i=0;
        while(head!=null && i<arr.length){
            arr[i]=head.val;
            head=head.next;
             i++;
        }
         
        
        // traversing on array and making the ans
        for(int j=0;j<arr.length;j++){
            ans=ans + (int)(arr[j]*(Math.pow(2,arr.length-1-j)));
        }
        
        return ans;
    }
}