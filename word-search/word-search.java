class Solution {
    static boolean[][] visited; 
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j] && backtrack(board,word,i,j,0)==true ){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean backtrack(char[][] board,String word,int i,int j,int index ){
        if(index==word.length()){
            return true;
        }
        
        if(i>=board.length || i<0 || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index) || visited[i][j]==true ){
            return false;
        }
        
        visited[i][j]=true;
        if(backtrack(board,word,i+1,j,index+1) || 
          backtrack(board,word,i-1,j,index+1) ||
           backtrack(board,word,i,j+1,index+1) ||
          backtrack(board,word,i,j-1,index+1) ){
            return true;
        }
        
        visited[i][j]=false;
        return false;
        
    }
}