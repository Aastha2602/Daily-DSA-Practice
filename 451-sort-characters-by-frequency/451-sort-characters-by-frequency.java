class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        
        
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue() );
        
        pq.addAll(map.entrySet()); //new concept to add all the specified data to the specified location                                
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry e=pq.poll();
            for(int i=0;i<(int)e.getValue();i++){
                sb.append(e.getKey());
            }
        }
        
        return sb.toString();
    }
}