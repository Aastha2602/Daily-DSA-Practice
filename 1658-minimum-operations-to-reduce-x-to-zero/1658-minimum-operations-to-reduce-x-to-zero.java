class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        
        // target = total sum - x
        for(int val:nums){
            target += val;
        }
        
        if(target == 0){
            return nums.length;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int result = Integer.MIN_VALUE;
        
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            
            if(map.containsKey(sum - target)){
                result = Math.max(result, i-map.get(sum-target));
            }
            map.put(sum, i);
        }
        return result == Integer.MIN_VALUE ? -1 : nums.length-result;
        
    }
}