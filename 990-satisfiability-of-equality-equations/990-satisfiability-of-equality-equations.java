class Solution {
    int[] rank, parent;
    public boolean equationsPossible(String[] equations) {
        rank = new int[26];
        parent = new int[26];
        
        for(int i=0;i<26;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        
        for(String equation:equations ){
            if( equation.charAt(1) == '=' ){
                int op1 = equation.charAt(0) - 'a';
                int op2 = equation.charAt(3) - 'a';
                
                int l1 = find(op1); // lead 1
                int l2 = find(op2); // lead 2
                
                if( l1 != l2 ){
                    union( l1, l2 );
                }
                
            }
        }
        
        for(String equation:equations ){
            if( equation.charAt(1) == '!' ){
                int op1 = equation.charAt(0) - 'a';
                int op2 = equation.charAt(3) - 'a';
                
                int l1 = find(op1); // lead 1
                int l2 = find(op2); // lead 2
                
                if( l1 == l2 ){
                    return false;
                }
                
            }
        }
        
        return true;
    }
    
    public int find(int x){
        if(parent[x] == x){
            return parent[x];
        }else{
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }
    
    public void union(int x, int y){
        if(rank[x] < rank[y] ){
            parent[x] = y;
        }else if(rank[y] < rank[x] ){
            parent[y] = x;
        }else{
            parent[x] = y;
            rank[y]++;
        }
    }
    
}