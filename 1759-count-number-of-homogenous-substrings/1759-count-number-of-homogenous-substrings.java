class Solution {
    public int countHomogenous(String s) {
        int count = 0, result = 0, mod = (int) 1e9+7;
        char cur = 'A';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == cur){
                count += 1;
            }else{
                count = 1;
            }
            cur = s.charAt(i);
            result = (result+count) % mod;
        }
        return result;
    }
}