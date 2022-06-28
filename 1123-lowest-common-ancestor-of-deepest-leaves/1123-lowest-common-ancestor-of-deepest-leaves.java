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
    class Pair{
        TreeNode node;
        int d;
        Pair(TreeNode node, int d){
            this.node = node;
            this.d = d;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        Pair pair = helper(root, 0);
        return pair.node;
    }
    
    public Pair helper(TreeNode node, int d){
        if(node == null){
            return new Pair(null, d);
        }
        
        Pair left = helper(node.left, d+1);
        Pair right = helper(node.right, d+1);
        
        if(left.d == right.d){
            return new Pair(node, left.d);
        }else{
            return left.d > right.d ? left : right;
        }
        
    }
}