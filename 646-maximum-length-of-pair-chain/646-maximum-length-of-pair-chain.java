class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) -> a[1] - b[1] );
        int current = Integer.MIN_VALUE, ans = 0;
        
        for(int[] pair:pairs){
            if(current < pair[0]){
                current = pair[1];
                ans++;
            }
        }
        return ans;
    }
}