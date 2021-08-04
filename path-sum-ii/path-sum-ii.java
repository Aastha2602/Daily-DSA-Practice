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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(root,targetSum,curr,ans);
        return ans;
    }
    
    public void backtrack(TreeNode root,int targetSum,List<Integer> curr,List<List<Integer>> ans){
        if(root==null){
            return;       
        }
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                ans.add(new ArrayList<Integer>(curr));
            }
        }
        
        if(root.left!=null){
            backtrack(root.left,targetSum-root.val,curr,ans);
            curr.remove(curr.size()-1);
        }
        
        if(root.right!=null){
            backtrack(root.right,targetSum-root.val,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}