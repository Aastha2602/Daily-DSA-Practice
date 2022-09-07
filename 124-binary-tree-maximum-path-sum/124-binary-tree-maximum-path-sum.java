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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
    
    public int solve(TreeNode root){
        if(root == null) return 0;
        
        int l = Math.max( solve(root.left) , 0 );
        int r = Math.max(solve(root.right), 0);
        
        res = Math.max(l+r+root.val , res);
        return root.val + Math.max(l,r);
    }
}