/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public void markParent(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            TreeNode curr = qu.poll();
            if(curr.left != null){
                parent.put(curr.left, curr);
                qu.add(curr.left);
            }
            if(curr.right != null){
                parent.put(curr.right, curr);
                qu.add(curr.right);
            }
        }
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        markParent(root, parent);
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>();
        
        qu.add(target);
        visited.put(target, true);
        int currLevel = 0;
        
        while(!qu.isEmpty()){
            if(currLevel == k){
                break;
            }
            currLevel++;
            int size = qu.size();
            while(size-- > 0){
                TreeNode curr = qu.poll();
                if(curr.left != null && visited.get(curr.left) == null ){
                    qu.add(curr.left);
                    visited.put(curr.left, true);
                }

                if(curr.right != null && visited.get(curr.right) == null ){
                    qu.add(curr.right);
                    visited.put(curr.right, true);
                }

                if(parent.get(curr) != null && visited.get(parent.get(curr)) == null ){
                    qu.add(parent.get(curr));
                    visited.put(parent.get(curr), true);
                }
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while(!qu.isEmpty()){
            res.add(qu.poll().val);
        }
        
        return res;
    }
}