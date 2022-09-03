class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0;i<n-2;i++){
            if( i == 0 || (i>0 && nums[i] != nums[i-1])){
                int lo = i+1, high = n-1, sum = 0 - nums[i];
                while(lo < high){
                    if( nums[lo] + nums[high] == sum ){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[high]));
                        
                        while(lo < high && nums[lo] == nums[lo+1]){
                            lo++;
                        }
                        
                        while(lo < high && nums[high] == nums[high-1]){
                            high--;
                        }
                        
                        lo++;
                        high--;
                    }else if(nums[lo] + nums[high] < sum){
                        lo++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return res;
    }
}