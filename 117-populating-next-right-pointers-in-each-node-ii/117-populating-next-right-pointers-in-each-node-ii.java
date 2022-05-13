/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        
        if(root.left != null){
            if(root.right != null ){
                root.left.next = root.right;
            }else{
                root.left.next = findNextLeftmost(root);
            }
        }
        
        if(root.right != null){
            root.right.next = findNextLeftmost(root);
        }
        
        connect(root.right);  // important ( **why** )
        connect(root.left);
        
        return root;
    }
    public Node findNextLeftmost(Node node){
        while(node.next != null){
            node = node.next;
            if(node.left != null){
                return node.left;
            }
            if(node.right != null){
                return node.right;
            }
        }
        return null;
    }
}