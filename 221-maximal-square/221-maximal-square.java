class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        int maxSqLen=0;
        
        int[][] dp=new int[rows+1][cols+1];
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                    maxSqLen=Math.max(maxSqLen,dp[i][j]);
                }
            }
        }
        return maxSqLen*maxSqLen;
    }
}

// dp[i][j] represents the side length of maximum square whose bottom right corner is at i & j....

// that is at this i,j the square ends