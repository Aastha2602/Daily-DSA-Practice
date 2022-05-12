class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        
        permutations(nums,ans,new ArrayList<>());
        return ans;
    }
    
    public void permutations(int[] nums,List<List<Integer>> ans,List<Integer> temp ){
        if(temp.size() == nums.length ){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            permutations(nums,ans,temp);
            temp.remove(temp.size()-1);
        }   
        
    }
}