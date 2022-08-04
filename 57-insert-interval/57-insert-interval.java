class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        
        // end point < newInterval ka start point
        int i=0;
        while(i<intervals.length && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        
        
        // let's merge newInterval
        int[] interval = newInterval;
        while(i<intervals.length && intervals[i][0] <= interval[1]){
            interval[0] = Math.min(intervals[i][0], interval[0]);
            interval[1] = Math.max(intervals[i][1], interval[1]);
            i++;
        }
        res.add(interval);
        
        // add all remaining intervals 
        while(i < intervals.length){
            res.add(intervals[i]);
            i++;
        }
        
        return res.toArray(new int[res.size()][2]);
    }
}