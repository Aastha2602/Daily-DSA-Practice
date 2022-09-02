class Solution {
    public int maxSubArray(int[] nums) {
        int[] memo = new int[nums.length]; 
        memo[0] = nums[0];
        int max = memo[0];
        for(int i=1;i<nums.length;i++){
            memo[i] = Math.max(nums[i], memo[i-1]+nums[i]);
            max = Math.max(max, memo[i]);
        }
        
        return max;
    }
}