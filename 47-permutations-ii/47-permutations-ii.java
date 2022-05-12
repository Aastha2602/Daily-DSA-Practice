class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        //List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return new ArrayList(set); 
        }
        
        boolean[] used = new boolean[nums.length];
        permutations(nums,new ArrayList<Integer>(),used,set);
        return new ArrayList(set);
    }
    
    public void permutations(int[] nums,List<Integer> temp,boolean[] used,HashSet<List<Integer>> set){
        if(temp.size() == nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(nums[i]);
                permutations(nums,temp,used,set);
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }
    }
}