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
  +(1)      +(-3)    +(4)
a      a+1     a+2         a-2

determine the upperBound(max) & lowerBound(min) and counted all the elements that are in the range of ( [upper,lower] intersection [max,min] )
*/
