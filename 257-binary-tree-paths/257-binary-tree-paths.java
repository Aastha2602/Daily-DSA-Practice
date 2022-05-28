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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        if(root != null){
            searchBT(root, "", list);
        }
        return list;
    }
    public void searchBT(TreeNode node, String path, ArrayList<String> list){
        if(node.left == null && node.right == null){
            list.add(path + node.val);
        }
        if(node.left != null){
            searchBT(node.left, path + node.val + "->" ,list);
        }
        if(node.right != null){
            searchBT(node.right, path + node.val + "->", list);
        }
    }
}