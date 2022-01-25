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
    ArrayList<Integer> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        
        TreeNode newNode=new TreeNode(0),current=newNode;
        for(int i:list){
            current.right=new TreeNode(i);
            current=current.right;
        }
        return newNode.right;
    }
     public void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}

// arrayList => 1 2 3 4 5 6 7 8 9