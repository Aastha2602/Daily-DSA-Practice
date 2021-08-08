class Solution {
    public int maxArea(int[] height) {
        int maxW=0, left=0, right=height.length-1;
        while(left<right){
            maxW=Math.max(maxW,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxW;
    }
}