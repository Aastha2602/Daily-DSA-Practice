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
    public class Pair{
        TreeNode node;
        int state;
        Pair(TreeNode node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<>();
        if(root==null){
            return in;
        }
        
        Stack<Pair> st=new Stack<>();
        Pair rootPair= new Pair(root,1);
        st.push(rootPair);
        
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state == 1){ // pre 
                //pre.add(top.node.val);
                top.state++;
                if(top.node.left!=null){
                    Pair lp=new Pair(top.node.left,1);
                    st.push(lp);
                }
            }else if(top.state==2){ //in
                in.add(top.node.val);
                top.state++;
                if(top.node.right!=null){
                    Pair rp=new Pair(top.node.right,1);
                    st.push(rp);
                }
            }else{ // post
                //post.addd(top.node.val);
                top.state++;
                st.pop();
            }
        }
        return in;
    }
}