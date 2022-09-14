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
class FindElements {

    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        dfs(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
    
    public void dfs(TreeNode node, int v){
        if( node == null ) return;
        
        set.add(v);
        node.val = v;
        dfs(node.left, 2*v + 1);
        dfs(node.right, 2*v + 2);
    } 
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */