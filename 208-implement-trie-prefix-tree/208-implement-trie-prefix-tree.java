class Node{
    Node[] links = new Node[26];
    boolean isEndOfWord = false;
    
    boolean containsKey(char ch){
        return (links[ch - 'a'] != null );  // a is 0 ---- z is 25
    }
    
    void put(char ch, Node node){
        links[ch-'a'] = node;
    }
    
    Node get(char ch){
        return links[ch-'a'];
    }
    
    void setEnd(){
        isEndOfWord = true;
    }
}

class Trie {

    public Node root; 
        
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)){
                temp.put(ch,new Node());
            }
            temp = temp.get(ch);
        }
        temp.setEnd();
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)){
                return false;
            }
            temp = temp.get(ch);
        }
        return temp.isEndOfWord ;
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!temp.containsKey(ch)){
                return false;
            }
            temp = temp.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */