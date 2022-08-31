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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums, int l, int r){
        if(l == r) return null;
        
        int max_i = max(nums, l, r);
        TreeNode node = new TreeNode(nums[max_i]);
        node.left = construct(nums, l, max_i);
        node.right = construct(nums, max_i+1, r);
        return node;
    }
    public int max(int[] nums, int l, int r){
        int max_i = l;
        for(int i=l;i<r;i++){
            if(nums[max_i] < nums[i]){
                max_i = i;
            }
        }
        
        return max_i;
    }
}