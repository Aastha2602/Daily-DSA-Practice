class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='('){
                st.push(i+1);
            }
            if(sb.charAt(i)==')'){
                if(st.size()!=0 && st.peek()>=0 ){
                    st.pop();
                }else{
                    st.push(-(i+1));
                }
            }
        }
        while(st.size()!=0){
            sb.deleteCharAt(Math.abs(st.pop())-1);
        }
        return sb.toString();
    }
}