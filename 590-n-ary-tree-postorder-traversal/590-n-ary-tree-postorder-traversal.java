/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        rec(root,list);
        return list;
    }
    public void rec(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        for(Node child: root.children){
            rec(child, list);
        }
        list.add(root.val);
    }
}