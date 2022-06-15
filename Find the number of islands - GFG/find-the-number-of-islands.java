// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length, n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j] == '1' ){
                    count++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    
    public void dfs( char[][] grid, int i, int j, boolean[][] visited ){
        
        if( i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] == true || grid[i][j] == '0' ){
            return;
        }
        
        visited[i][j] = true;
        
        dfs(grid,i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i+1,j+1,visited);
        dfs(grid,i+1,j-1,visited);
        dfs(grid,i-1,j+1,visited);
        dfs(grid,i-1,j-1,visited);
        dfs(grid,i,j-1,visited);
        dfs(grid,i,j+1,visited);
    } 
    
}