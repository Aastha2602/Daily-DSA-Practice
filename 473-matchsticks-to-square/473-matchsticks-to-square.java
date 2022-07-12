class Solution {
    public boolean makesquare(int[] nums) {
        if(nums.length < 4){
            return false;
        }
        
        int perimeter = 0;
        for(int val:nums){
            perimeter += val;
        }
        
        if(perimeter % 4 != 0 ){
            return false;
        }
        
        int side = perimeter/4;
        int[] sides = new int[]{side,side,side,side};
        Arrays.sort(nums);
        return helper(nums, nums.length-1, sides);
    }
    
    public boolean helper(int[] nums, int i, int[] sides ){
        if( i == -1 ){
            return sides[0] == 0 && sides[1] == 0 && sides[2] == 0 && sides[3] == 0;
        }
        
        for(int j=0;j<sides.length;j++){
            if(nums[i] > sides[j]){
                continue;
            }
            sides[j] -= nums[i];
            if(helper(nums, i-1, sides)){
                return true;
            }
            sides[j] += nums[i];
        }
        return false;
    }
}