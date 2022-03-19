class Solution {
    public int numSub(String s) {
        int count = 0, result = 0,mod = (int) 1e9+7 ;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                count += 1;
            }else{
                count = 0;
            }
            result = (result+count)%mod;
        }
        
        return result;
    }
}