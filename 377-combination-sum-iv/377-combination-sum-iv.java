class Solution {
    public int helper(int[] nums, int target, int[] memo) {
        if(memo[target] != -1){
            return memo[target];
        }
        
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if( target >= nums[i] ){
                res += helper(nums, target-nums[i], memo);
            }
        }
        return memo[target] = res;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        return helper(nums, target, memo);
    }
}