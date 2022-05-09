class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), len = 0,stIdx = 0,count =0;
        int[][] dp = new int[n][n];
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                if(gap == 0){
                    dp[i][j] = 1;
                }else if(gap == 1 && s.charAt(i) == s.charAt(j) ){
                    dp[i][j] = 2;
                }else{
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1] > 0 ? dp[i+1][j-1] + 2 : 0;
                }
                
                if(dp[i][j]>len){
                    len = dp[i][j];
                    stIdx = i;
                }
                
                count += dp[i][j] >0 ? 1:0;
            }
        }
        
        return s.substring(stIdx,stIdx+len);
        // return len;
    }
}