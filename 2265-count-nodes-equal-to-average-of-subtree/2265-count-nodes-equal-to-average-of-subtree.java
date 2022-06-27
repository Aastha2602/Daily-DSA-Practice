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
    
    public int sum(TreeNode node){
        if(node == null){
            return 0;
        }
        
        return node.val + sum(node.left) + sum(node.right);  
    }
    
    public int count(TreeNode node){
        if(node == null){
            return 0;
        }
        
        return 1 + count(node.left) + count(node.right);
    }
    
    public int averageOfSubtree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int ans = averageOfSubtree(root.left) + averageOfSubtree(root.right) ;
        
        if(sum(root)/count(root) == root.val ){
            return ans+1;
        }else{
            return ans;
        }
        
    }
}