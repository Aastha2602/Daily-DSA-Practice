// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Complete obj = new Complete();
		    int ans = obj.maximizeSum(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}



// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        int max = -1;
        
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }
        int []freq = new int[max + 1]; 
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        
        int ans = 0, i=max;
        while(i>0){
            if(freq[i] > 0){
                ans += i;
                freq[i-1]--;
                freq[i]--;
            }else{              
                i--;
            }           
        }
        return ans;
    }
}


