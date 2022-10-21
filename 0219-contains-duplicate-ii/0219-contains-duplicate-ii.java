class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
              int pre=map.get(nums[i]);
              if(i-pre<=k){
                  return true;
              }       
            }
            map.put(nums[i],i);
        }
        return false;
    }
}