class Solution {
    public int minCost(int maxTime, int[][] edges, int[] fees) {
        int n = fees.length;
        
        int[] minTime = new int[n];
        Arrays.fill(minTime, Integer.MAX_VALUE);
        
        List<int[]>[] graph = new List[n];
        
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] e:edges){
            graph[e[0]].add(new int[]{e[1], e[2]});
            graph[e[1]].add(new int[]{e[0], e[2]});
        }
        
        // minheap sorted acc to min time
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1] - b[1] );
        pq.offer(new int[]{ 0, fees[0], 0}); // node, fees so far, time so far
        
        while( !pq.isEmpty() ){
            int[] rem = pq.poll();
            int node = rem[0];
            int fee = rem[1];
            int time = rem[2];
            
            if( time >= minTime[node] || time > maxTime){
                continue;
            }
            
            if( node == n-1 ){
                return fee;
            } 
            
            minTime[node] = time;
            
            for(int[] e: graph[node]){
                int e_node = e[0];
                int e_time = time + e[1];
                int e_fees = fee + fees[e_node];
                
                pq.offer(new int[]{ e_node, e_fees, e_time});
            }
        }
        return -1;
    }
}