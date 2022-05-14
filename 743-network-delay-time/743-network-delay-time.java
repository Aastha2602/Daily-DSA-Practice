class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        for(int[] time:times){
            map.putIfAbsent(time[0],new HashMap<>());
            map.get(time[0]).put(time[1],time[2]);
        }
        
        // distance,node
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0]-b[0]) );
        pq.add(new int[]{0,k});
        
        boolean[] visited = new boolean[n+1];
        int result = 0;
        
        while(!pq.isEmpty()){
            int[] current = pq.remove();
            int currentNode = current[1];
            int currentDistance = current[0];
            if(visited[currentNode]){
                continue;
            }
            
            visited[currentNode] = true;
            result = currentDistance;
            n--;
            if(map.containsKey(currentNode)){
                for(int next : map.get(currentNode).keySet() ){
                    pq.add(new int[]{currentDistance + map.get(currentNode).get(next), next });
                }
            }
        }
        return n==0 ? result:-1 ;
    }
}