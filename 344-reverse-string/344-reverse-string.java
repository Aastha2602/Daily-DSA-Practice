class Solution {
    public void reverseString(char[] s) {
        helper(0,s.length-1,s);
    }
    public void helper(int start,int end,char[] s){
        if(start>=end){
            return;
        }
        
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        
        helper(++start,--end,s);
        
    }
}