class Node {
    Node[] links = new Node[26];
    boolean flag = false;
    
    public Node() {
        
    }
    
    boolean containsKey(char ch){
        return ( links[ch-'a'] != null );
    }
    
    Node get(char ch){
        return links[ch-'a'];
    }
    
    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }
    
    void setEnd(){
        flag = true;
    }
    
    boolean isEnd(){
        return flag;
    }
}

class Trie {
    public Node root;
    
    Trie() {
        root = new Node();
    }
    
    public void insert(String word){
        Node temp = root;
        for(int i=0;i<word.length();i++){
            if(!temp.containsKey(word.charAt(i))){
                temp.put(word.charAt(i), new Node());
            }
            temp = temp.get(word.charAt(i));
        }
        temp.setEnd();
    }
    
    public boolean checkIfPrefixExists(String word){
        Node temp = root;
        boolean flag = true;
        for(int i=0;i<word.length();i++){
            if(temp.containsKey(word.charAt(i))){
                temp = temp.get(word.charAt(i));
                flag = flag & temp.isEnd();
            }else return false;
        }
        
        return flag;
    }
}

class Solution {
    public String longestWord(String[] words) {
        Trie obj = new Trie();
        for(int i=0;i<words.length;i++){
            obj.insert(words[i]);
        }
        
        String longest = "";
        for(int i=0;i<words.length;i++){
            if(obj.checkIfPrefixExists(words[i])){
                if( words[i].length() > longest.length() ){
                    longest = words[i];
                }else if( words[i].length() == longest.length() && words[i].compareTo(longest) < 0 ){
                    longest = words[i];
                }
            }
        }
        
        if(longest == "" ) return "";
        else return longest;
    }
}