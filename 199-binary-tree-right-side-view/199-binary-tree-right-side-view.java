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
        if(root == null){
            return new ArrayList<>();
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        List<Integer> res = new ArrayList<>();
        
        while(!qu.isEmpty()){
            int size = qu.size();
            
            while(size-- > 0){
                TreeNode curr = qu.remove();
            
                if(size == 0){
                    res.add(curr.val);
                }

                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
        }
        return res;
    }
}