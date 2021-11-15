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
    public int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        maxSumHelper(root);
        return max;
    }
    
    public int maxSumHelper(TreeNode node){
        if(node==null){
            return 0;
        }
        
        int leftSum=maxSumHelper(node.left);
        int rightSum=maxSumHelper(node.right);
        int maxRightLeft = Math.max(leftSum, rightSum);
        int maxOneNodeRoot = Math.max(node.val, (node.val + maxRightLeft));
        int maxAll = Math.max(maxOneNodeRoot, leftSum + rightSum + node.val);
        max = Math.max(max,maxAll);
        return maxOneNodeRoot;
    }
    
}