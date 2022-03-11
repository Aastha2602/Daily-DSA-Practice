// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return function(arr,n-1,dp);
    }
    int function(int[] arr,int idx,int[] dp){
        if(idx<0) return 0;
        if(idx==0) return arr[idx];    
        
        if(dp[idx] != -1 ) return dp[idx];
        
        int pick = arr[idx] + function(arr,idx-2,dp);
        int notpick = 0 + function(arr,idx-1,dp);
        
        return dp[idx] = Math.max(pick,notpick);
    }
}