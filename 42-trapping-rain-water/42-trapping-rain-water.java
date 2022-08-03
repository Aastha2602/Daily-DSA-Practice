class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                left[i] = height[i];
            }else{
                left[i] = Math.max(height[i], left[i-1]);
            }
        }
        
        int[] right = new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                right[i] = height[i];
            }else{
                right[i] = Math.max(height[i], right[i+1]);
            }
        }
        
        int res = 0;
        for(int i=0;i<n;i++){
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}