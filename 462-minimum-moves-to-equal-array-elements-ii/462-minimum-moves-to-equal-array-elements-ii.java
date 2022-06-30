class Solution {
    // public int minMoves2(int[] nums) {
    //     Arrays.sort(nums);
    //     int left = 0, right = nums.length-1, result = 0;
    //     while(left < right){
    //         result += ( nums[right] - nums[left] );
    //         left++;
    //         right--;
    //     }
    //     return result;
    // }
    
    public int minMoves2(int[] nums){
        if(nums == null ||  nums.length == 0 ){
            return 0;
        }
        
        int mid = nums.length/2 , result = 0; 
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            result += ( Math.abs(nums[i] - nums[mid]) );    
        }
        
        return result;
    }
    
}