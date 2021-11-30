class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        
        double result=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            result=Math.max(result,sum);
        }
        
        return result/k;
        
    }
}