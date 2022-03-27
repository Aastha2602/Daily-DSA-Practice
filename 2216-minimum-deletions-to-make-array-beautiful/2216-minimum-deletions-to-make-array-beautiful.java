class Solution {
    public int minDeletion(int[] nums) {
        int result = 0, pre = -1;
        for(int val:nums){
            if(val==pre){
                result++;
            }else{
                pre = pre<0 ? val:-1;
            }
        }
        return pre<0 ? result : result+1;
    }
}