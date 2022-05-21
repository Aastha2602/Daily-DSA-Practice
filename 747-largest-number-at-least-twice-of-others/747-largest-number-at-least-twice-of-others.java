class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length <= 1){
            return nums.length-1;
        }
        
        int maxIdx = 0;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIdx = i;
            }
        }
        
        Arrays.sort(nums);
        if(nums[nums.length-1] >= nums[nums.length-2]*2 ){
            return maxIdx;
        }
        return -1;
    }
}