class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        int[] rank = new int[edges.length+1];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
            rank[i] = 1;
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            int parentU = find( parent, u);
            int parentV = find( parent, v); 
            
            if(parentU != parentV){
                // merging
                if(rank[parentU] > rank[parentV] ){
                    parent[parentV] = parentU;
                }else if(rank[parentV] > rank[parentU] ){
                    parent[parentU] = parentV;
                }else{
                    parent[parentU] = parentV;
                    rank[parentV]++;
                }
            }else{
                return edge;
            }
        }
        
        return new int[2];
    }
    
    public int find(int[] parent, int x){
        if( parent[x] == x ) return x;
        
        int temp = find(parent, parent[x] );
        parent[x] = temp;
        return temp;
    }
}