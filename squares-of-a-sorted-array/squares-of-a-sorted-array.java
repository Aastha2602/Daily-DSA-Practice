class Solution {
    public int[] sortedSquares(int[] nums) {
        int lo=0,hi=nums.length-1;
        int[] result=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[lo])>Math.abs(nums[hi])){
                result[i]=nums[lo]*nums[lo];
                lo++;
            }else{
                result[i]=nums[hi]*nums[hi];
                hi--;
            }
        }
        return result;
    }
}