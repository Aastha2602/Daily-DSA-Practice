class Solution {
    
    // only 0 (empty string) , 1 (perfect palindrome) , 2 ( as only a & b are present so highest answer is to remove all a's and then all b's  ) are possible answers
    
    public int removePalindromeSub(String s) {
        if(s.length() == 0 ){
            return 0;
        }
        
        int i = 0, j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return 2;
            }
        }
        
        return 1;
    }
}