class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        for( String ch : tokens){            
            if(ch.equals("+") ){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if(ch.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }else if(ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else if(ch.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }else{
                st.push(Integer.parseInt(ch) );
            }
        }
        
        return st.peek();
    }
}