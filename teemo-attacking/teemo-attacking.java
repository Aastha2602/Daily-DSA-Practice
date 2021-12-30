class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        //ArrayList<Integer> list=new ArrayList<>();
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            total+=Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return total+duration;
    }
}