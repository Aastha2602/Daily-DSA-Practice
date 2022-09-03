class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word, n, m) == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, int i, int j, int count, String word, int n, int m){
        if(count == word.length()) return true;
        if(i<0 || i>=n || j<0 || j>=m || board[i][j] != word.charAt(count)){
            return false;    
        }
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = dfs(board, i+1, j, count+1, word, n, m) || dfs(board, i-1, j, count+1, word, n, m) || dfs(board, i, j+1, count+1, word, n, m) || dfs(board, i, j-1, count+1, word, n, m);
        board[i][j] = temp;
        return found;
    }
}