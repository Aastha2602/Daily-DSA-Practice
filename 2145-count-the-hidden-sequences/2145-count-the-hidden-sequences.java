class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long SumOfDiff=0;
        long max=0,min=0;
        
        for(int i:differences){
            SumOfDiff+=i;
            min=Math.min(min,SumOfDiff);
            max=Math.max(max,SumOfDiff);
        }
        
        return (int)Math.max(((upper-lower)-(max-min)+1),0); 
    }
}


/*



*/
