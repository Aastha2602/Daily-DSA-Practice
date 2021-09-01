class Solution {
    public boolean canJump(int[] nums) {
        int needed=0;
        for(int i=0;i<=needed;i++){
            needed=Math.max(needed, i+nums[i] );
            if(needed>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}