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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            TreeNode current=st.peek();
            st.pop();
            if(current.right!=null){
                st.push(current.right);
            }
            if(current.left!=null){
                st.push(current.left);
            }
            
            if(st.size()>0){
                current.right=st.peek();
            }
            current.left=null;
            
        }
    }
}