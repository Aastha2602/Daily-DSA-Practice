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
        if( root==null || root.right==null || root.left==null ){
            return -1;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        Integer secondMin=null;
        while(!qu.isEmpty()){
            TreeNode removed=qu.remove();
            if(removed.left!=null){
                qu.add(removed.left);
            }
            if(removed.right!=null){
                qu.add(removed.right);
            }
            if(removed.val!=root.val){
                if(secondMin==null){
                    secondMin=removed.val;
                }else{
                    secondMin=Math.min(secondMin,removed.val);
                }
            }
        }
        return secondMin == null ? -1 : secondMin;
    }
}