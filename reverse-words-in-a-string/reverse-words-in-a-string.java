class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(temp.length()>0){
                    st.push(temp);    
                }
                temp="";
            }else{
                temp=temp+ch;
            }
        }
        
        ans+=temp;
        
        while(st.size()!=0){
            ans=ans+" "+st.pop();
        }
        
        if(ans.length()!=0 && ans.charAt(0)==' '){
            ans=ans.substring(1);
        }
        return ans;
        
    }
}