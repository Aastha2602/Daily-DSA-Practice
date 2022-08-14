class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder(), stack = new StringBuilder();
        for(int i=0;i<=pattern.length();i++){
            stack.append((char) ('1'+i));
            if(i == pattern.length() || pattern.charAt(i) == 'I' ){
                res.append(stack.reverse());
                stack = new StringBuilder();
            }
        }
        
        return res.toString();
    }
}