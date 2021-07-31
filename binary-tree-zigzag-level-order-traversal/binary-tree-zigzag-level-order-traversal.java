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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        
        int l=0; // denote the current level
        while(qu.size()>0){
            int size=qu.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=qu.poll();
                if(node!=null){
                    level.add(node.val);
                    qu.add(node.left);
                    qu.add(node.right);
                }
            }
            
            
            if(level.size()>0){
                if(l%2==1){
                    Collections.reverse(level);
                }
                ans.add(level);
            }
            l++;
        }
        return ans;
    }
}