class Solution {
    boolean flag = false;
    int len = 0;
    
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( !visited[i][j] && grid[i][j] == 1 ){
                    flag = true;
                    len = 0;
                    traverse( grid, i , j , m , n , visited );
                    if(flag){
                        count += len;
                    }
                }
            }
        }
        return count;
    }
    
    public void traverse( int[][] grid , int i ,int j , int m , int n , boolean[][] visited){
        if( i<0 || j<0 || i>=m || j>=n){
            flag = false;
            return;
        }else if(grid[i][j] == 0 || visited[i][j] == true){
            return;
        }
        
        len++;
        visited[i][j] = true;
        traverse(grid,i+1,j,m,n,visited);
        traverse(grid,i-1,j,m,n,visited);
        traverse(grid,i,j+1,m,n,visited);
        traverse(grid,i,j-1,m,n,visited);
        
    }
}