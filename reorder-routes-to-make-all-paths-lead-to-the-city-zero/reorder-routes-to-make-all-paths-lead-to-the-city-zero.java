class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        
        for(int[] c:connections){
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(-c[0]);
        }
        
        return dfs(graph,new boolean[n],0);    
    }
    
    public static int dfs(List<List<Integer>> graph,boolean[] visited,int root){
        int count=0;
        visited[root]=true;
        
        for(int to:graph.get(root)){
            if(!visited[Math.abs(to)]){
                count+=dfs(graph,visited,Math.abs(to))+((to>0) ? 1:0);
            }
        }
        return count;
    }
}