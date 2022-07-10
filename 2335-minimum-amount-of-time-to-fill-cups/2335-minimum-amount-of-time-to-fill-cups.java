class Solution {
    public int fillCups(int[] amount) {
        int count = 0;
        Arrays.sort(amount);
        int three = amount.length - 1, two = amount.length - 2;
        
        while(amount[three] > 0 && amount[two] > 0 ){
            amount[three]--;
            amount[two]--;
            count++;
            Arrays.sort(amount);
        }
        
        while(amount[three] > 0 ){
            amount[three]--;
            count++;
        }
        
        return count;
    }
}