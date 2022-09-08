class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for(int val:piles){
            r = Math.max(val, r);
        }
        
        while( l < r ){
            int mid = l + (r-l) /2;
            if( feasible( piles, h, mid)  == true ){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        
        return l;
    }
    
    public boolean feasible(int[] piles, int h, int mid){
        int hours = 0;
        for(int pile:piles){
            int div = pile / mid;
            hours += div;
            if( pile % mid != 0 ){
                hours++;
            }
        }
        
        return hours <= h;
    }
}