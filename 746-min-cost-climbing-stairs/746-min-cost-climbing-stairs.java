class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp=new int[cost.length+1];
        
        
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        
        //  for(int i=0;i<dp.length;i++){
        //     System.out.println(dp[i]);
        // }
        
        return dp[dp.length-1];
        
    }
}

/*
dp => 0 0 (10,15) ()
      0 0   10     

*/ 