class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        curr.add(0);
        backtrack(graph,0,graph.length-1,curr,ans);
        return ans;
    }
    
    public void backtrack(int[][] graph,int src,int dest,List<Integer> curr,List<List<Integer>> ans){
        if(src==dest){
           ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int a:graph[src]){
            curr.add(a);
            backtrack(graph,a,dest,curr,ans);
            curr.remove(curr.size()-1);
        }
        
        
    }
}