class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,l=0,r=0,result=nums[0];
        for(int i=0;i<n;i++){
            if(l==0){
                l=nums[i];
            }else{
                l=l*nums[i];
            }
            
            if(r==0){
                r=nums[n-1-i];
            }else{
                r=r*nums[n-1-i];
            }
            result=Math.max(Math.max(l,r),result);
            
        }
        return result;
    }
}