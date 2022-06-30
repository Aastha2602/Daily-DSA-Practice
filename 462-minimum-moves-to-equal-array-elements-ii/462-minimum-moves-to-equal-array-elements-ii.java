class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1, result = 0;
        while(left < right){
            result += ( nums[right] - nums[left] );
            left++;
            right--;
        }
        return result;
    }
}