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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set=new HashSet<>();
        dfs(root,set);
        
        int min1=root.val;
        long ans=Long.MAX_VALUE;
        for(int i:set){
            if(min1<i && i<ans){
                ans = i;
            }
        }
        return ans<Long.MAX_VALUE ? (int) ans:-1;
    }
    public void dfs(TreeNode root,Set<Integer> set){
        if(root!=null){
            set.add(root.val);
            dfs(root.left,set);
            dfs(root.right,set);
        }
    }
}