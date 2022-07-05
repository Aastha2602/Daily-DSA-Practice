class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        
        int max = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                max = Math.max( max, currentStreak);
            }
        }
        return max;
    }
}