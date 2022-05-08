// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // // code here
        // int[][] dp = new int[n+1][m+1];
        // // Arrays.fill(dp,-1);
        // for(int[] d:dp ){
        //     Arrays.fill(d,-1);
        // // }
        // int[][] dp = new int[n + 1][m + 1];
        // for (int[] d : dp) Arrays.fill(d, -1);
        // int ans = longestCommonSubsequence_memo(S1,S2,n,m,dp);
        // return ans;
        int[][] dp = new int[n+1][m+1] ;
       int ans=0;
       for(int i=0;i<n+1;i++){
           for(int j=0;j<m+1;j++){
               if(i==0 || j==0){
                   dp[i][j]=0;
               }
               else if(S1.charAt(i-1)==S2.charAt(j-1)){
                   dp[i][j]=1+dp[i-1][j-1];
                   ans=Math.max(ans,dp[i][j]);
               }
               else{
                   
                   dp[i][j]=0;
               }
           }
       }
       return ans;
    }
    
    // int longestCommonSubsequence_memo(String s1,String s2,int n,int m,int[][] dp){
    //     if (n == 0 || m == 0) {
    //         return dp[n][m] = 0;
    //     }

    //     if (dp[n][m] != -1)
    //         return dp[n][m];

    //     int a = longestCommonSubsequence_memo(s1, s2, n - 1, m - 1, dp);
    //     int b = longestCommonSubsequence_memo(s1, s2, n - 1, m, dp);
    //     int c = longestCommonSubsequence_memo(s1, s2, n, m - 1, dp);

    //     if (s1.charAt(n - 1) == s2.charAt(m - 1))
    //         return dp[n][m] = a + 1;
    //     else
    //         return dp[n][m] = Math.max(b, c);
    // }
    
}