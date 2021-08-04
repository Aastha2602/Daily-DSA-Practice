class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        function(nums,curr,ans,0);
        return ans;
    }
    public void function(int[] nums,List<Integer> curr,List<List<Integer>> ans,int i ){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        curr.add(nums[i]);
        function(nums,curr,ans,i+1);
        curr.remove(curr.size()-1);
        function(nums,curr,ans,i+1);
        
    }
}