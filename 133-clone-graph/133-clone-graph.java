/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        
        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> qu = new ArrayDeque<>();
        
        map.put(node, new Node(node.val, new ArrayList<>()));
        qu.add(node);
        
        while(!qu.isEmpty()){
            Node curr = qu.poll();
            
            for(Node neighbor:curr.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    qu.add(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        
        return map.get(node);
    }
}