class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j] != '0' ){
                    count++;
                    traverse( grid, i , j , m , n , visited );
                }
            }
        }
        return count;
    }
    
    public void traverse( char[][] grid, int i, int j, int m, int n , boolean[][] visited ){
        if( i<0 || j<0 || i>=m || j>=n || grid[i][j] == '0' || visited[i][j] == true ){
            return;
        }
        
        visited[i][j] = true;
        traverse(grid, i+1, j , m, n, visited );
        traverse(grid, i, j+1 , m, n, visited );
        traverse(grid, i-1, j , m, n, visited );
        traverse(grid, i, j-1 , m, n, visited );
        
    }
    
}