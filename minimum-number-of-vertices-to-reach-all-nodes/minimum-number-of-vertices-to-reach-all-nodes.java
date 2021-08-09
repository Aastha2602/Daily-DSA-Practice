class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(List<Integer> edge:edges){
            visited[edge.get(1)]=true; // .get(1) to extract "to-node" for each edge
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                result.add(i);
            }
        }
        return result;
    }
}