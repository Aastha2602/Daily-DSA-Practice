// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(new Solution().getNthUglyNo(n));
        }
    }
}// } Driver Code Ends


class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long[] dp=new long[n+1];
        dp[1]=1;
        int p1=1,p2=1,p3=1;
        for(int i=2;i<=n;i++){
            long val1=dp[p1]*2;
            long val2=dp[p2]*3;
            long val3=dp[p3]*5;
            
            long min=Math.min(val1,Math.min(val2,val3));
            dp[i]=min;
            if(min==val1){
                p1++;
            }
            if(min==val2){
                p2++;
            }
            if(min==val3){
                p3++;
            }
        }
        return dp[n];
    }
}