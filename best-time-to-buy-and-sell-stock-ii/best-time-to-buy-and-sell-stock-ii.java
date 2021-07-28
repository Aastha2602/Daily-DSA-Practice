class Solution {
    public int maxProfit(int[] prices) {
        int valley=prices[0],peak=prices[0],index=0,profit=0;
        while(index<prices.length-1){
            while(index<prices.length-1 && prices[index]>=prices[index+1]){
                index++;
            }
            valley=prices[index];
            while(index<prices.length-1 && prices[index]<=prices[index+1]){
                index++;
            }
            peak=prices[index];
            profit+=(peak-valley);
        }
        return profit;
    }
}