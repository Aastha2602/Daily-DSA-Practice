class Solution {
    public int splitArray(int[] nums, int m) {
        int low = 0, high = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isValid(mid, m, nums) == true){
                min = Math.min(min, mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        return min;
    }
    
    public boolean isValid(int mid, int m, int[] nums){
        int chunks = 0, i = 0;
        while( i<nums.length ){
            int val = 0;
            while(i<nums.length && nums[i] + val <= mid){
                val += nums[i];
                i++;
            }
            chunks++;
        }
        return chunks <= m;
    }
}