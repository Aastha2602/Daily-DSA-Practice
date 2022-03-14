class Solution {
    public boolean backspaceCompare(String s, String t) {
        if( helper(s).equals(helper(t))){
            return true;
        }
        return false;
    }
    
    public String helper(String str){
        StringBuilder sb = new StringBuilder(); 
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( st.size()>0 && ch == '#' ){
                st.pop();
            }else if(ch != '#'){
                st.push(ch);
            }
        }
        
        while(st.size() > 0){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}