class Solution {
    public int longestStrChain(String[] words) {
        if(words == null || words.length == 0 ){
            return 0;
        }
        
        int res = 0;
        Arrays.sort(words, (a,b) -> a.length() - b.length() );
        HashMap<String,Integer> map = new HashMap<>(); // current word and length of max chain
        
        for(String word:words){
            map.put(word,1);
            for(int i=0;i<word.length();i++){
                StringBuilder sb = new StringBuilder(word);
                String next = sb.deleteCharAt(i).toString();
                if(map.containsKey(next) && map.get(next) + 1 > map.get(word) ){
                    map.put(word, map.get(next) + 1 );
                }
            }
            res = Math.max( res , map.get(word) );
        }
        return res;
    }
}