class Solution {
    
    class Pair{
        int bus;
        int csf; // countSoFar .. abhi tak main kitni busses mein chadha hun
        
        Pair(int bus, int csf){
            this.bus = bus;
            this.csf = csf;
        }
    }
    
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target){
            return 0;
        }
        
        // stop - to - bus map
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        
        for(int bus = 0;bus<routes.length;bus++){
            for(int stop : routes[bus] ){
                if( !map.containsKey(stop) ){
                    map.put(stop, new HashSet<>());
                }
                
                map.get(stop).add(bus);
            }
        }
        
        ArrayDeque<Pair> qu = new ArrayDeque<>();
        
        // source pe aane waali buses
        for(int busSrc :map.get(source) ){
            qu.add(new Pair(busSrc,1));
        }
        
        // bus ridden
        boolean[] visited = new boolean[routes.length];
        while(!qu.isEmpty()){
            // remove
            Pair rem = qu.remove();
            
            if(visited[rem.bus] == true ){
                continue;
            }    
            
            // mark
            visited[rem.bus] = true;
            
            //work
            for(int rstop : routes[rem.bus]){
                if(rstop == target){
                    return rem.csf;
                }
            }
            
            // add neighbors
            for(int rstop : routes[rem.bus] ){// removed bus ke stops ko dekho
                // uss stop ke saari buses ko dekho
                for(int bus: map.get(rstop)){
                    if(!visited[bus]){
                        qu.add(new Pair(bus,rem.csf+1));
                    }
                }
            }     
            
        }
        
        return -1;
    }
}