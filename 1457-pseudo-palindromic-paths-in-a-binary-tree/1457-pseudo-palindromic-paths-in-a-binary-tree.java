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
    int ans = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> set = new HashSet<>();
        dfs(root, set);
        return ans;
    }
    public void dfs(TreeNode node, Set<Integer> set){
        if(node == null){
            return;
        }
        
        if(set.contains(node.val)){
            set.remove(node.val);
        }else{
            set.add(node.val);
        }
        
        if(node.left == null && node.right == null){
            if(set.size() <= 1) ans++;
        }
        
        dfs(node.left, new HashSet(set));
        dfs(node.right, new HashSet(set));
    }
}