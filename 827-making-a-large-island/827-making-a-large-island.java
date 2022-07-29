class Solution {
    int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public int largestIsland(int[][] grid) {
        if( grid == null || grid.length == 0) return 0;
        int max = 0, islandId = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    int size = getIslandSize( i, j, grid, islandId);
                    max = Math.max( max, size);
                    map.put(islandId++,size);
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    Set<Integer> set = new HashSet<>();
                    for(int[] direction : directions){
                        int x = i + direction[0], y = j + direction[1];
                        if( x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] != 0 ){
                            set.add( grid[x][y] );
                        }
                    }
                    
                    int sum = 1;
                    for(int num:set){
                        int value = map.get(num);
                        sum += value;
                    }
                    max = Math.max(max, sum);
                }
            }
        }
        
        return max;
    }
    
    public int getIslandSize(int i, int j, int[][] grid, int islandId){
        if( i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j] != 1){
            return 0;
        }
        
        grid[i][j] = islandId;
        int left = getIslandSize(i-1,j,grid, islandId);
        int right = getIslandSize(i+1,j,grid, islandId);
        int up = getIslandSize(i,j-1,grid, islandId);
        int down = getIslandSize(i,j+1,grid, islandId);
        
        return left+right+up+down+1; // 1 for current to be included
    }
}