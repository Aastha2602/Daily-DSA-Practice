class Solution {
    public String removeDuplicates(String s) {
        String ans = new String();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch ){
                st.pop();
            }else if(st.size()==0 || st.peek() != ch ){
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }
        
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        return sb.toString();
    }
}