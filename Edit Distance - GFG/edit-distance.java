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
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1];
        int ans = editDistance_memo(s,t,n,m,dp);
        return ans;
    }
    public int editDistance_memo(String s1,String s2,int n,int m,int[][] dp ){
        if(n==0 || m==0){
            return dp[n][m] = n!= 0 ? n:m;
        }
        
        if(dp[n][m] != 0){
            return dp[n][m];
        }
        
        int a = editDistance_memo(s1,s2,n-1,m-1,dp);
        int b = editDistance_memo(s1,s2,n-1,m,dp);
        int c = editDistance_memo(s1,s2,n,m-1,dp);
        
        if(s1.charAt(n-1)== s2.charAt(m-1)){
            return dp[n][m] = a;
        }else{
            return dp[n][m] = Math.min(a,Math.min(b,c)) +1 ;
        }
        
    }
}