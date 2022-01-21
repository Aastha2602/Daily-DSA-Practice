class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        
        dp[m-1][n-1]=0;
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1){
                    dp[i][j]=1;                 
                }else if(j==n-1){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i][j+1]+dp[i+1][j];
                }
            }
        }
    return dp[0][0];
    }
}