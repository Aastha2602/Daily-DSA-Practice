class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j) ){
                return (checkRemaining(s,i,j-1) || checkRemaining(s,i+1,j) );
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean checkRemaining(String s,int i,int j){
        while(i<j){
            if( s.charAt(i) != s.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}