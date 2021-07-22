class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            sum+=nums[i];
        }
        
        int ans=sum-(min*nums.length);
        return ans;
    }
}