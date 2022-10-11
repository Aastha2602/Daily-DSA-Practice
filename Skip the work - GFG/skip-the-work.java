//{ Driver Code Starts
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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minAmount(A,n));
                }
        }
}    
// } Driver Code Ends



class Solution{
  public int minAmount(int arr[] , int n){
        //code here.
        if(n==1) return 0;
        else if(n==2) return Math.min(arr[0], arr[1]);
        
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i=2;i<n;i++){
            dp[i] = arr[i] + Math.min(dp[i-1], dp[i-2]);
        }
        
        return Math.min(dp[n-2], dp[n-1]);
    }
}
