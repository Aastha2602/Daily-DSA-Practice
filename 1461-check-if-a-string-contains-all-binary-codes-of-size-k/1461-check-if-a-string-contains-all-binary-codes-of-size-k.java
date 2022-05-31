class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int required = 1 << k; // (2^k)
        
        for(int i=0;i+k<=s.length();i++){
            set.add(s.substring(i, i+k));
            if(set.size() == required){
                return true;
            }
        }
        return false;
    }
}