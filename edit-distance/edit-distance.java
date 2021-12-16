class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else{
                    if(word1.charAt(i-1)==word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else{
                        int f1=dp[i][j-1]+1; // insert
                        int f2=dp[i-1][j-1]+1; // replace
                        int f3=dp[i-1][j]+1; // delete
                        dp[i][j]=Math.min(f1,Math.min(f2,f3));
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}