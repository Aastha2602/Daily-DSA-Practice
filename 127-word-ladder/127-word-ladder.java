class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        HashMap<String, Boolean> map = new HashMap<>();
        
        for(String word: wordList){
            map.put(word, false);
        }
        
        Queue<String> qu = new LinkedList<>();
        qu.add(beginWord);
        int level = 1;
        map.put(beginWord, true);
        
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size-- > 0 ){
                String curr = qu.poll();
                if(curr.equals(endWord)){
                    return level;   
                }
                wordMatch(curr, map, qu);
            }
            level++;
        }
        return 0;
    }
    
    public void wordMatch(String curr, HashMap<String, Boolean> map, Queue<String> qu){
        for(int i=0;i<curr.length();i++){
            char[] word = curr.toCharArray();
            for(int j=0;j<26;j++){
                char ch = (char) ('a'+j);
                word[i] = ch;
                String str = String.valueOf(word);
                if(map.containsKey(str) && map.get(str) == false){
                    qu.add(str);
                    map.put(str, true);
                }
            }
        }
    }
}