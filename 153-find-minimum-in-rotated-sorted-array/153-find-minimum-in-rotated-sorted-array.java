class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if( n == 1) return nums[0];
        
        int l = 0, r = n-1;
        
        if(nums[r] > nums[0]) return nums[0];
        
        while( l<= r ){
            int m = l + (r-l)/2;
            
            if(nums[m] > nums[m+1]) return nums[m+1];
            
            if(nums[m-1] > nums[m]) return nums[m];
            
            if(nums[m] > nums[0]){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}