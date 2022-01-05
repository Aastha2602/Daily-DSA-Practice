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
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        Stack<Integer> st=new Stack<>();
        int num=1;
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            
            if(ch=='D'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;
                
                while(st.size()>0){
                    sb.append(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
