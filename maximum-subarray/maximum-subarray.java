class Solution {
    public int maxSubArray(int[] arr) {
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        for(int i=1;i<dp.length;i++){
            int sum=dp[i-1]+arr[i];
            dp[i]=Math.max(arr[i],sum);    
        }
        int max=dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}