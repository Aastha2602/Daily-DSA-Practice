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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<Integer> eachMaxVal=new ArrayList<>();
        
        if(root!=null){
            qu.offer(root);
        }
        
        while(!qu.isEmpty()){
            int max=Integer.MIN_VALUE,n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode node=qu.poll();
                max=Math.max(max,node.val);
                if(node.left!=null){
                    qu.offer(node.left);
                }
                if(node.right!=null){
                    qu.offer(node.right);
                }
            }
            eachMaxVal.add(max);
        }
     return eachMaxVal;   
    }
}