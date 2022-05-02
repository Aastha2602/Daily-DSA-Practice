// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    
    // public int countFriendsPairings_memo(int n,int[] dp ){
    //     if(n<=1){
    //         return dp[n] = 1;
    //     }
        
    //     if(dp[n] != 0 ){
    //         return dp[n];
    //     }
        
    //     int single = countFriendsPairings_memo( n-1 , dp );
    //     int pair = countFriendsPairings_memo( n-2 , dp ) * (n-1);
    //     dp[n] = single+pair;
    //     return dp[n];
    // }
    
    public long countFriendsPairings(int n) 
    { 
       //code here
       int mod= (int) 1e9+7;
       if(n<=1){
           return 1;
       }
       long[] dp = new long[n+1];
       //return (long)countFriendsPairings_memo( n,dp );
       
       dp[1] = 1;
       dp[2] = 2;
       
       for(int i=3;i<=n;i++){
           dp[i] = (dp[i-1] + dp[i-2] * (i-1))%mod;
       }
       
        return dp[n]%mod;
          
    }
}    