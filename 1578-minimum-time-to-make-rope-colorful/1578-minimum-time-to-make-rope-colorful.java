class Solution {
    public int minCost(String colors, int[] neededTime) {
        int tt = 0, i = 0, j = 0;
        while(i<neededTime.length && j<neededTime.length){
            int cm = 0, ct = 0;
            while(j<neededTime.length && colors.charAt(i) == colors.charAt(j)){
                ct += neededTime[j];
                cm = Math.max(cm, neededTime[j]);
                j++;
            }
            
            tt += ct - cm;
            i = j;
        }
        return tt;
    }
}