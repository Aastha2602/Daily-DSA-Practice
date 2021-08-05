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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        
        while(qu.size()>0){
            int count=qu.size();
            while(count-->0){
                TreeNode node=qu.poll();
                if(count==0){
                   list.add(node.val); 
                }
                if(node.left!=null){
                qu.add(node.left);
                }
                if(node.right!=null){
                    qu.add(node.right);
                }
            }
            
        }
        return list;
    }
}