class Solution {
    public int shortestBridge(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        paint( grid );
        Queue<int[]> qu = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    qu.add( new int[]{i,j} );
                    visited[i][j] = true;
                }
            }
        }
        
        int level = 0;
        while( !qu.isEmpty() ){
            int size = qu.size();
            for(int i=0;i<size;i++){
                int[] current = qu.poll();
                int x = current[0];
                int y = current[1];
                
                if( grid[x][y] == 1 ){
                    return level-1 ;
                }
                
                if( x-1 >= 0 && !visited[x-1][y] ){
                    qu.add( new int[]{x-1,y} );
                    visited[x-1][y] = true;
                }
                if( x+1 < m && !visited[x+1][y] ){
                    qu.add( new int[]{x+1,y} );
                    visited[x+1][y] = true;
                }
                if( y-1 >= 0 && !visited[x][y-1] ){
                    qu.add( new int[]{x,y-1} );
                    visited[x][y-1] = true;
                }
                if( y+1 < n && !visited[x][y+1] ){
                    qu.add( new int[]{x,y+1} );
                    visited[x][y+1] = true;
                }
            }
            level++;
        }
        return -1;
    }
    public void paint(int[][] grid){
        int m = grid.length, n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    dfs( i, j, grid );
                    return;
                }
            }
        }
    }
    
    public void dfs( int i, int j, int[][] grid ){
        if( i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] != 1 ){
            return;
        }
        
        grid[i][j] = 2;
        dfs( i-1, j, grid );
        dfs( i+1, j, grid );
        dfs( i, j-1, grid );
        dfs( i, j+1, grid );
    }
}