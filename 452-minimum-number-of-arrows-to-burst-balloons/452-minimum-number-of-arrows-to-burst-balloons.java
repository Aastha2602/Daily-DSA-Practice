class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        Arrays.sort(points,(a,b) -> Integer.compare(a[1] , b[1]) );
        
        int arrows = 0;
        long end = Long.MIN_VALUE;
        for(int[] p:points){
            if(p[0] > end ){
                arrows++;
                end = p[1];
            }else{
                
            }
        }
        return arrows;
    }
}