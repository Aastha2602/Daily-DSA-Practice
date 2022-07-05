// The idea is for every character is :

// 1) First, we push it into a stack

// 2) If the last character is the same as the last character in the pattern, we might have a the pattern in the stack

// 3) Popping out all the character equals to the length of the pattern so that we can compare
// 4) If it's a false positive, then we put the char back to stack

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