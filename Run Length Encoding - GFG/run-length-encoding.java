// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans="";
          ans=ans+str.charAt(0);
          int count=1;
          
          for(int i=1;i<str.length();i++){
              if(str.charAt(i)==str.charAt(i-1)){
                  count++;
              }else{
                  ans=ans+Integer.toString(count);
                  ans+=str.charAt(i);
                  count=1;
              }
          }
          return ans+Integer.toString(count);
	}
	
 }