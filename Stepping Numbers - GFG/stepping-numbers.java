// { Driver Code Starts
//Initial Template for Java


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
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    int steppingNumbers(int n, int m){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n==0){
            list.add(0);
        }
        
        for(int i=1;i<=9;i++){
            exploreAllPaths(i,n,m,list);
        }
        
        return list.size();
    }
    
    void exploreAllPaths(int val, int n, int m, ArrayList<Integer> list){
        if(val > m){
            return;
        }
        
        if(val>=n && val<=m){
            list.add(val);
        }
        
        int back = val%10;
        
        // exploring previous anss (-1)
        if(back != 0){
            int new_val = val*10 + (back-1);
            exploreAllPaths( new_val,n,m,list);
        }
        
        // exploring next anss (+1)
        if(back != 9){
            int new_val = val*10 + (back+1);
            exploreAllPaths( new_val,n,m,list);
        }
    }
}
