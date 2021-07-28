class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && st.size()>0){
                st.pop();
            }else if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
        }
        ArrayList<Character> arr=new ArrayList<>();
        while(st.size()!=0){
            arr.add(st.pop());
        }
      
        
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && st1.size()>0){
                st1.pop();
            }else if(t.charAt(i)!='#'){
                st1.push(t.charAt(i));
            }
        }
        ArrayList<Character> arr1=new ArrayList<>();
        while(st1.size()!=0){
            arr1.add(st1.pop());
        }
        
//         System.out.println(arr);
//         System.out.println(arr1);
        
        
        if(arr.equals(arr1)){
            return true;   
        }
        return false;
    }
    
}