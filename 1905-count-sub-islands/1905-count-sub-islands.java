class Solution {
    int flag=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                 //flag=1;
                if(grid2[i][j]==1 ){
                    function(grid1,grid2,i,j);
                        if(flag==0) count++;
                        flag=0;
                    }
                }
            }
        
        return count;
    }
    public void function(int[][] grid1,int[][] grid2,int i,int j){
        if(i<0 || j<0 || i>=grid1.length || j>=grid2[0].length || grid2[i][j]==0){
            return;
        }
        
        if(grid2[i][j]==1){
            if(grid1[i][j]==0){
                flag=1;
                return;
            }
            grid2[i][j]=0;
        }
        function(grid1,grid2,i+1,j);
        function(grid1,grid2,i-1,j);
        function(grid1,grid2,i,j+1);
        function(grid1,grid2,i,j-1);
    }
}