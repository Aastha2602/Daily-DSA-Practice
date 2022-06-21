class Solution {
    class Pair{
        int i;
        int j;
        int level;
        Pair(int i,int j,int level){
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
        
    public int maxDistance(int[][] grid) {
        
        int count = 0;
        int m = grid.length , n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<Pair> qu = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    qu.add(new Pair(i,j,0));
                }else{
                    count++;
                }
            }
        }
        
        if( count == 0 ){ // no water(0) is present hence no answer possible 
            return -1;
        }
        
        int dist = -1;
        
        while(!qu.isEmpty()){
            Pair rem = qu.remove();
            
            if(visited[rem.i][rem.j] == true){
                continue;
            }
            
            visited[rem.i][rem.j] = true;
            
            dist = Math.max(dist, rem.level);
            
            addN(rem.i+1 , rem.j , rem.level+1 , grid , visited , qu );
            addN(rem.i-1 , rem.j , rem.level+1 , grid , visited , qu );
            addN(rem.i , rem.j+1 , rem.level+1 , grid , visited , qu );
            addN(rem.i , rem.j-1 , rem.level+1 , grid , visited , qu );
        }
        
        return dist;
    }
    
    public void addN(int i, int j, int level, int[][] grid, boolean[][] visited, Queue<Pair> qu){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] == true || grid[i][j] == 1 ){
            return;
        }
        
        qu.add(new Pair(i,j,level));
        
    }
    
}