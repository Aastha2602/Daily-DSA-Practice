class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum=0;
        int[] dp=new int[nums.length];
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1]){
                dp[i]=dp[i-1]+1;
                sum+=dp[i];
            }
        }
        return sum;
    }
}