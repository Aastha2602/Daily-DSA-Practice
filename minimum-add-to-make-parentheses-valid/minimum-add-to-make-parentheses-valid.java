class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0,bal=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bal+=1;
            }else{
                bal--;
            }
            
            if(bal==-1){
                ans++;
                bal++;
            }
        }
        return ans+bal;
    }
}