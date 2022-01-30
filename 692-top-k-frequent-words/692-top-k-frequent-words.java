class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());
        
        for(Map.Entry<String,Integer> entry: map.entrySet() ){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }

        ArrayList<String> list=new ArrayList<>();
        while(pq.size()>0){
            list.add(0,pq.poll().getKey());
        }
        return list;
    }
}