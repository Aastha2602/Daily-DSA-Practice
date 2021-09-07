class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
     //   int ans=1;
        for(int i=1;i<=min;i++){
            int divider=min/i;
            if(min%divider==0 && max%divider==0){
                return divider;
            }
        }
        return 1;
    }
}