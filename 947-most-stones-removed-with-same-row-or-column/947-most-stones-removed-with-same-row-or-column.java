class Solution {
    
    int[] parent = new int[1000];
    public int find(int x){
        if(parent[x] == x) return x;
        
        return parent[x] = find(parent[x]);
    }
    
    public void union(int u, int v){
        int lu = find(u);
        int lv = find(v);
        
        if( lu == lv){
            return;
        }
        parent[lv] = lu;
    }
    
    public int removeStones(int[][] stones) {
        int len = stones.length;
        
        for(int i=0;i<len;i++){
            parent[i] = i;
        }
        
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if( stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    union( i, j);
                }
            }
        }
        
        int count = 0;
        for(int i=0;i<len;i++){
            if(parent[i] == i) count++;
        }
        
        return len - count;
    }
}