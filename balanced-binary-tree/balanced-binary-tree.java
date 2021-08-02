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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        
        if(Math.abs(lh-rh)<2 && isBalanced(root.left)==true && isBalanced(root.right)==true ){
            return true;
        }
        return false;
        
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lth=height(node.left);
        int rth=height(node.right);
        int th=Math.max(lth,rth)+1;
        return th;
    }
}