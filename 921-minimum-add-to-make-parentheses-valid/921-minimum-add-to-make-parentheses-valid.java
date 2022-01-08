class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
            }else{
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                    count--;
                }else{
                     count++;
                }
            }
        }
        return count;
    }
}