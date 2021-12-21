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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int maxlevel=1;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        for(int i=1;!qu.isEmpty();i++){
            int sum=0;
            for(int j=qu.size();j>0;j--){
                TreeNode curr=qu.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    qu.offer(curr.left);
                }
                if(curr.right!=null){
                    qu.offer(curr.right);
                }
            }
            if(max<sum){
                max=sum;
                maxlevel=i;
            }
        }
        return maxlevel;
    }
}