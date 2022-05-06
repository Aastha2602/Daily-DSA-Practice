class Solution {
    class Node{
        char c;
        int count;
        public Node(char c,int count){
            this.c=c;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node> st = new Stack<>();
        for( char ch:s.toCharArray() ){
            if(!st.isEmpty() && st.peek().c == ch ){
                st.peek().count++;
            }else{
                st.push(new Node(ch,1));
            }
            
            if(st.peek().count == k){
                st.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(Node node : st){
            for(int i=0;i<node.count;i++){
                sb.append(node.c);
            }
        }
        return sb.toString();
    }
}