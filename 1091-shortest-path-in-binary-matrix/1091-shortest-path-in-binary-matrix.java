class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = new int[][]{ {0,1}, {1,0}, {-1,0}, {0,-1}, {1,1}, {-1,1}, {1,-1}, {-1,-1} };
        
        if(grid == null || grid.length == 0 || grid[0][0] !=0){
            return -1;
        }
        
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{0,0,0});
        
        while(!qu.isEmpty()){
            int[] current = qu.poll();
            if(current[0] == grid.length-1 && current[1] == grid[0].length-1 ){
                return current[2] + 1;
            }
            
            for(int d=0;d<dir.length;d++){
                int r = current[0] + dir[d][0];
                int c = current[1] + dir[d][1];
                
                if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] != 0 ){
                    continue;
                }
                grid[r][c] = -1;
                qu.add(new int[]{ r,c,current[2]+1 });
            }
        }
        return -1;
    }
}