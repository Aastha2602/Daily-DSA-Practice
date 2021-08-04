class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    drawTreeGetComponents(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void drawTreeGetComponents(char[][] grid,int i,int j,boolean[][] visited){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || visited[i][j]==true || grid[i][j]=='0' ){
            return;
        }
        
        visited[i][j]=true;
        drawTreeGetComponents(grid,i-1,j,visited);
        drawTreeGetComponents(grid,i+1,j,visited);
        drawTreeGetComponents(grid,i,j-1,visited);
        drawTreeGetComponents(grid,i,j+1,visited);
    }
    
}