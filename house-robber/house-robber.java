class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int p1=0,p2=0;
        for(int num:nums){
            int temp=p1;
            p1=Math.max(p2+num,p1);
            p2=temp;
        }
        return p1;
    }
}