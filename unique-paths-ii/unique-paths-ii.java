class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
    
        // path can never be reached
        if(obstacleGrid[0][0]==1 ){
           return 0; 
        }
        
        dp[m-1][n-1]=0;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    if(i==m-1 && j==n-1){
                        dp[i][j]=1;
                    }else if(i==m-1){
                        dp[i][j]=dp[i][j+1];
                    }else if(j==n-1){
                       dp[i][j]=dp[i+1][j];
                    }else{
                        dp[i][j]=  dp[i+1][j] + dp[i][j+1] ;
                    }
              }
            }      
        }        
        return dp[0][0];   
    }
}