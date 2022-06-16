// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}
// } Driver Code Ends

//  2 calls : character nahi aana chahta hai ya aana chahta
//  jab nahi aana chahta toh our count will be prev
//  jab aana chahta hai toh (either get attached for the 1st time or for the (k+1)th time, 
//  if the kth time it is already present)

class Solution
{
    public int fun(String s)
    {
        // Write your code here
        int mod = (int) 1e9+7;
        int a = 0, ab = 0, abc = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if( ch == 'a' ){
                a = ( a % mod + (1+a) % mod ) % mod ;  
            }else if( ch == 'b' ){
                ab = ( (ab) % mod + (a+ab) % mod ) % mod; 
            }else{
                abc = ( (abc) % mod + (ab+abc) % mod ) % mod;
            }
        }
        return abc % mod  ;
    }
}