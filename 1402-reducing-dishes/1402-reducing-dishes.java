class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int postSum = 0, result = 0, current = 0;
        for(int i=satisfaction.length-1;i>=0;i--){
            postSum += satisfaction[i];
            current += postSum;
            result = Math.max(result,current);
        }
        return result;
    }
}