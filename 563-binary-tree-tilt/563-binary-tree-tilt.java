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
    int tiltTotal=0;
    public int findTilt(TreeNode root) {
        tiltTotal=0;
        postOrder(root);
        return tiltTotal;
    }
    public int postOrder(TreeNode node){
        if(node==null){
            return 0;
        }
        
        int leftSum=postOrder(node.left);
        int rightSum=postOrder(node.right);
        int currTilt=Math.abs(leftSum-rightSum);
        tiltTotal += currTilt;
        
        return node.val+leftSum+rightSum;
    }
}