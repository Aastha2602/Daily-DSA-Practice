class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int val:nums1){
            set.add(val);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int val:nums2){
            if(set.contains(val)){
                list.add(val);
                set.remove(val);
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}