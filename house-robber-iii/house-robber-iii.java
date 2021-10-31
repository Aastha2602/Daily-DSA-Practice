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
    public int rob(TreeNode root) {
        int[] result = robFunction( root);
        return Math.max(result[0],result[1]);
    }
    
    public static int[] robFunction(TreeNode root){
        if(root==null){
            return new int[2];
        }
        
        int[] left=robFunction(root.left);
        int[] right=robFunction(root.right);
        int[] ans=new int[2];
        
        ans[0]=Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        ans[1]=root.val+left[0]+right[0];
        
        return ans;
    }
    
}