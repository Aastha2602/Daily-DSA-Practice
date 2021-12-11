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
    TreeNode xparent=null;
    TreeNode yparent=null;
    int xdepth=-1,ydepth=-1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root,x,y,0,null);
        return xdepth==ydepth && xparent!=yparent ;
    }
    
    public void helper(TreeNode root,int x,int y,int depth,TreeNode parent){
        if(root==null){
            return;
        }
        
        if(root.val==x){
            xparent=parent;
            xdepth=depth;
        }else if(root.val==y){
            yparent=parent;
            ydepth=depth;
        }
        helper(root.left,x,y,depth+1,root);
        helper(root.right,x,y,depth+1,root);
    }
    
}