/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int height = 0, sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        
        helper(root,0) ;
        return sum;
    }
    
    public void helper(TreeNode node, int h){
        if(node == null){
            return;
        }
        
        if(h == height ){
            sum += node.val;
        }else if( h>height ){
            height = h;
            sum = node.val;
        }
        
        helper(node.left,h+1);
        helper(node.right,h+1);
        
    }
}