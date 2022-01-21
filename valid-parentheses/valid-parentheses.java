class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' ){
                st.push(ch);
            }else{
                if(st.size()>0 &&  ch==')' && st.peek()=='('){
                    st.pop();
                }else if(st.size()>0 && ch==']' && st.peek()=='[' ){
                    st.pop();
                }else if(st.size()>0 && ch=='}' && st.peek()=='{' ){
                    st.pop();
                }else{
                    st.push(ch);
                }
                //st.pop();
            }
        }
        return st.size()==0;
    }
}