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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=qu.size();
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();
                if(curr!=null){ 
                    list.add(curr.val);
                    if(curr.left!=null) qu.add(curr.left);
                    if(curr.right!=null) qu.add(curr.right);
                }
            }
            if(list.size()>0) ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}