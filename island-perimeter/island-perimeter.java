class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands=0,neighbors=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==1){
                    islands++;
                    
                    //check right neighbor
                    if( i<grid.length-1 && grid[i+1][j]==1 ){
                        neighbors++;
                    }
                    
                    //check bottom neighbor
                    if( j<grid[0].length-1 && grid[i][j+1]==1 ){
                        neighbors++;
                    }
                    
                }
            }
        }
        
        int perimeter=4*islands-2*neighbors;
        return perimeter;
    }
}