class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer> > graph=new HashMap<>();
        int total=0;
        for(int i=0;i<manager.length;i++){
            int j=manager[i];
            if(!graph.containsKey(j)){
                graph.put(j,new ArrayList<>());
            }
            graph.get(j).add(i);
        }
        return dfs(graph, informTime, headID );
    }
    
    public int dfs(Map<Integer, List<Integer>> graph, int[] informTime, int current ){
        int max=0;
        if(!graph.containsKey(current)){
            return max;
        }
        
        for(int i=0;i<graph.get(current).size();i++){
            max=Math.max(max,dfs(graph,informTime,graph.get(current).get(i)));
        }
        return max+informTime[current];
    }
    
}