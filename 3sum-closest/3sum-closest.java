class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int difference=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length && difference !=0; i++){
            int low=i+1,high=nums.length-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-sum)<Math.abs(difference)){
                    difference=target-sum;
                }
                if(sum<target){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return target-difference;
    }
}