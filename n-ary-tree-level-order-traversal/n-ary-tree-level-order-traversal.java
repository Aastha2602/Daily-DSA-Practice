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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        
        while(qu.size()!=0){
            List<Integer> level=new ArrayList<>();
            int size=qu.size();
            for(int k=0;k<size;k++){
                Node node=qu.poll();
                if(node!=null){
                    level.add(node.val);
                    for(int j=0;j<node.children.size();j++){
                        qu.add(node.children.get(j));
                    }
                }
                
                
            }
            if(level.size()>0){
                    ans.add(level);
                }
        }
        return ans;
    }
}