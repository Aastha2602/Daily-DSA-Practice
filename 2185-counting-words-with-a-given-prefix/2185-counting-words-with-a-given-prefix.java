class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String str:words){
            if( str.indexOf(pref) == 0 ){
                count++;
            }
        }
        return count;
    }
}