class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        char[] temp = new char[part.length()];
        
        for(char ch:s.toCharArray()){
            st.push(ch);
            
            if(st.size()>= part.length() && st.peek() == part.charAt(part.length()-1) ){
                int j = part.length() -1;
                while( j>=0 ){
                    temp[j] = st.pop();
                    j--;
                }
                
                if(!new String(temp).equals(part)){
                    for(char tc:temp){
                        st.push(tc);
                    }
                }
            }
        }
        
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}