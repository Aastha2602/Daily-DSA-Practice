class Solution {
    class Pair{
        String config;
        int level;
    }
    
    public int slidingPuzzle(int[][] board) {
        HashSet<String> visited = new HashSet<>();
        
        ArrayDeque<Pair> qu = new ArrayDeque();
        Pair rpair = new Pair();
        rpair.config = getConfig(board);
        rpair.level = 0;
        qu.add(rpair);
        
        while( qu.size() > 0 ){
            Pair rem = qu.remove();
            
            if(visited.contains(rem.config)){
                continue;
            }
            visited.add(rem.config);
            
            if(rem.config.equals("123450")){
                return rem.level;
            }
            
            int[][] dirs = { {1,3} , {0,2,4} , {1,5} , {0,4} , {1,3,5} , {2,4} };
            int idx = rem.config.indexOf('0');
            // System.out.println(idx);
            
            for(int i:dirs[idx]){
                String nconfig = swap(rem.config, idx, i);
                if(!visited.contains(nconfig)){
                    Pair np = new Pair();
                    np.config = nconfig;
                    np.level = rem.level + 1;
                    qu.add(np);
                }
            }
        }
        return -1;
    }
    
    public String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        
        char chi = sb.charAt(i);
        char chj = sb.charAt(j);
        sb.setCharAt(i, chj);
        sb.setCharAt(j, chi);
        
        return sb.toString();
    }
    
    public String getConfig(int[][] board){
        StringBuilder sb = new StringBuilder();
        
        for(int[] row:board ){
            for(int val:row){
                sb.append(val);
            }
        }
        return sb.toString();
    }
    
}