class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i=0;i<messages.length;i++){
            String s = messages[i];
            String[] str = s.split(" ");
            map.put(senders[i], map.getOrDefault(senders[i],0) + str.length);
            max = Math.max(max, map.get(senders[i]));
        }
        
        String res = "";
        for(String key : map.keySet()){
            if(map.get(key) == max){
                if(res.compareTo(key) < 0 ){
                    res = key;
                }
            }
        }
        return res;
    }
}