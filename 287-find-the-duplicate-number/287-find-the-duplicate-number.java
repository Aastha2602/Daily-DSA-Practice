class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        int duplicate = -1;
        
        while(low <= high){
            int curr = (low+high)/2;
            
            int count = 0;
            for(int num : nums){
                if(num <= curr){
                    count++;
                }
            }
            
            if(count > curr){
                duplicate = curr;
                high = curr - 1;
            }else{
                low = curr + 1;
            }
        }
        return duplicate;
    }
}