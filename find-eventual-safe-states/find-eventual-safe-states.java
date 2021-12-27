class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list=new ArrayList<>();
        if(graph==null || graph.length==0 ){
            return list;
        }
        int[] color=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(dfs(graph,i,color)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean dfs(int[][] graph,int i,int[] color){
        
        // if node is not yet visited then check if it is safe
        if(color[i]!=0){
            return color[i]==1;
        }
        color[i]=2; // mark as unsafe to check for cycle
        for(int newNode:graph[i]){ // to check for neighbors
            if(dfs(graph,newNode,color)==false){
                return false; //if cycle is found from its neighbor then it will also
                // return false
            }
        }
        color[i]=1; // mark as safe if cycle not found!
        
        //otherwise the current node is safe!
        return true;
    }
}