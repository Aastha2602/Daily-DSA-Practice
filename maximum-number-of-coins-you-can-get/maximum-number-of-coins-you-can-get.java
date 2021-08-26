class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left=0,right=piles.length-1,alice=0,mine=0,bob=0;
        while(left<=right){
            bob+=piles[left++];
            alice+=piles[right--];
            mine+=piles[right--];
        }
        return mine;
    }
}