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
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }
    public List<TreeNode> helper(int start,int end){
        List<TreeNode> list=new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        
        if(start==end){
            list.add(new TreeNode(start));
            return list;
        }
        
        for(int i=start;i<=end;i++){
            List<TreeNode> leftpt=helper(start,i-1);
            List<TreeNode> rightpt=helper(i+1,end);
            
            for(TreeNode lroot:leftpt){
                for(TreeNode rroot:rightpt){
                    TreeNode root=new TreeNode(i);
                    root.left=lroot;
                    root.right=rroot;
                    list.add(root);
                }
            }
            
        }
        return list;
        
    }
}