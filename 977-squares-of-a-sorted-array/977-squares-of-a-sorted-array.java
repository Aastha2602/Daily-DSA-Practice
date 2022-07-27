class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        
        int l = 0, r = nums.length-1, k = nums.length-1;
        while( k >= 0){
            if( Math.abs(nums[l]) < Math.abs(nums[r]) ){
                res[k--] = nums[r] * nums[r];
                r--;
            }else{
                res[k--] = nums[l] * nums[l];
                l++;
            }
        }
        
        return res;
    }
}