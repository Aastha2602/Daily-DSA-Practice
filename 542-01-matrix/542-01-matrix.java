class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length , n = mat[0].length;
        Queue<int[]> qu = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    qu.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        
        int[][] dirs = { {-1,0} , {1,0} , {0,-1} , {0,1} };
        while(!qu.isEmpty()){
            int[] curr = qu.poll();
            for(int i=0;i<4;i++ ){
                int row = curr[0] + dirs[i][0];
                int col = curr[1] + dirs[i][1];
                if( row < 0 || row >= m || col < 0 || col >= n || visited[row][col] == true ){
                    continue;
                }
                
                visited[row][col] = true;
                mat[row][col] = mat[curr[0]][curr[1]] + 1;
                qu.add(new int[]{row,col});
            }
        }
        return mat;
    }
}