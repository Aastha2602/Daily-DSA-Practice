// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    // ---------- O(N1*(LOG(N2*N3))) ----------
    
    // ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
    //     // code here 
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int i=0;i<n1;i++){
    //         // skipping duplicates
    //         if(i != 0 && A[i] == A[i-1] ){
    //             continue;
    //         }
            
    //         if( binarySearch(B,n2,A[i]) && binarySearch(C,n3,A[i]) ){
    //             list.add(A[i]);
    //         }
    //     }
    //     return list;
    // }
    
    // public boolean binarySearch(int[] arr, int size, int target){
    //     int left = 0, right = size-1;
    //     while(left <= right ){
    //         int mid = right + left / 2;
    //         if( arr[mid] == target ){
    //             return true;
    //         }else if( arr[mid] > target ){
    //             right = mid - 1;
    //         }else{
    //             left = mid + 1;
    //         }
    //     }
    //     return false;
    // }
    
    // ----------- O( N1+N2+N3 ) ---------------
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here 
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0, p1 = Integer.MIN_VALUE, p2 = Integer.MIN_VALUE, p3 = Integer.MIN_VALUE ;
        while(i<n1 && j<n2 && k<n3){
            
            while( i<n1 && A[i] == p1 ){
                i++;
            }
            
            while( j<n2 && B[j] == p2 ){
                j++;
            }
            
            while( k<n3 && C[k] == p3 ){
                k++;
            }
            
            if( i<n1 && j<n2 && k<n3){
                if( A[i] == B[j] && B[j] == C[k] ){
                res.add(A[i]);
                p1 = A[i];
                p2 = B[j];
                p3 = C[k];
                i++;
                j++;
                k++;
                }else if( A[i] < B[j] ){
                    p1 = A[i];
                    i++;
                }else if( B[j] < C[k] ){
                    p2 = B[j];
                    j++;
                }else{
                    p3 = C[k];
                    k++;
                }
            }

        }
        return res;
    }
}