class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max_so_far=values[0];
        int result=Integer.MIN_VALUE;
        for(int i=1;i<values.length;i++){
            result=Math.max(result,max_so_far+values[i]-i);
            max_so_far=Math.max(max_so_far,values[i]+i);
        }
        return result;
    }
}