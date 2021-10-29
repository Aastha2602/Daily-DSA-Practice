class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> map=new HashMap<>();
        for(int i=0;i<tickets.size();i++){
            String key=tickets.get(i).get(0);
            String value=tickets.get(i).get(1);
            
            if(!map.containsKey(key)){
                PriorityQueue<String> pq=new PriorityQueue<>();
                map.put(key,pq);
            }
            map.get(key).add(value);
            
        }
        
        LinkedList<String> result=new LinkedList<>();
        dfs("JFK",map,result);
        return result;
    }
    
    public static void dfs(String begin,HashMap<String,PriorityQueue<String>> map,LinkedList<String> result){
        PriorityQueue<String> arrivals=map.get(begin);
        while(arrivals!=null && !arrivals.isEmpty() ){
            dfs(arrivals.poll(),map,result);
        }
        result.addFirst(begin);
    }
    
}