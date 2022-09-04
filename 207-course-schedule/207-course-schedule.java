class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0 || prerequisites == null ||  prerequisites.length == 0 ) return true;
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(numCourses);
        
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int[] visited = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if( dfs(i, graph, visited) == false){
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int i, ArrayList<ArrayList<Integer>> graph, int[] visited){
        visited[i] = 1;
        for(int neighbor = 0; neighbor < graph.get(i).size();neighbor++){
            int neigh = graph.get(i).get(neighbor);
            
            if(visited[neigh] == 1) return false;
            
            if(visited[neigh] == 0){
                if(!dfs(neigh, graph, visited)){
                    return false;
                }
            }
        }
        
        visited[i] = 2;
        return true;
    }
}