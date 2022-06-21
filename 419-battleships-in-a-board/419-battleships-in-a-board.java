class Solution {
    public int countBattleships(char[][] board) {
        
        int count = 0;
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( board[i][j] == 'X' && !visited[i][j] ){
                    // count++;
                    dfs( board, i, j , visited );
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] board, int i, int j , boolean[][] visited ){
        if( i<0 || j<0 || i>=board.length || j>= board[0].length || visited[i][j] == true || board[i][j] == '.' ){
            return;
        }
        
        visited[i][j] = true;
        dfs( board, i-1 , j , visited );
        dfs( board, i+1 , j , visited );
        dfs( board, i , j-1 , visited );
        dfs( board, i , j+1 , visited );
    }
}