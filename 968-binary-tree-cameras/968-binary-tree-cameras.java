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
    int count = 0;
    final int camera = 1;
    final int monitored = 2;
    final int notmonitored = 3;
    public int minCameraCover(TreeNode root) {
        int val = letsmonitor(root);
        if(val == notmonitored){
            count++;
        }
        
        return count;
    }
    
    public int letsmonitor(TreeNode node){
        if(node == null){
            return monitored;
        }
        
        int left = letsmonitor(node.left);
        int right = letsmonitor(node.right);
        
        if(left == notmonitored || right == notmonitored){
            count++;
            return camera;
        }else if(left == camera || right == camera){
            return monitored;
        }else{
            return notmonitored;
        }   
    }
}