class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int pairs=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                st.push(ch);
            }else{
                if(st.size()>0 && st.peek()=='[' ){
                    st.pop();
                }else{
                    pairs++;
                }
            }
        }
        
        return (pairs+1)/2;
    }
}