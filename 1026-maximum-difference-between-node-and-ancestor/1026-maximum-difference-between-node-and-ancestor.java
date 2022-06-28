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
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return helper(root, root.val, root.val);
    }
    
    public int helper(TreeNode node, int currmax, int currmin){
        if(node == null){
            return currmax-currmin;
        }
        
        currmax = Math.max(currmax, node.val); // my current max
        currmin = Math.min(currmin, node.val); // my current min
        int left = helper(node.left, currmax, currmin); // to get the diff from left subtree
        int right = helper(node.right, currmax, currmin); // to get the diff from right subtree
        return Math.max(left, right); // global answer update
    }
}