class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> set = new HashSet<>();
        String res = "";
        for(String w:words ){
            int len = w.length();
            if( len == 1 || set.contains(w.substring(0, len-1))){
                res = len > res.length() ? w : res ;
                set.add(w);
            }
        }
        
        return res;
    }
}