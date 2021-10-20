class Solution {
    public int minStartValue(int[] nums) {
        int min=0,total=0;
        for(int i:nums){
            total+=i;
            min=Math.min(min,total);
        }
        return -min+1;
    }
}