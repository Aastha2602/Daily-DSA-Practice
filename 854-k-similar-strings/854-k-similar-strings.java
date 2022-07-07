class Solution {
    public int kSimilarity(String s1, String s2) {
        HashSet<String> visited = new HashSet<>();
        Queue<String> qu = new LinkedList<>();
        
        qu.add(s1);
        int level = 0;
        
        while(!qu.isEmpty()){
            int size = qu.size();
            for(int i=0;i<size;i++){
                String rem = qu.remove();
                
                if(visited.contains(rem)){
                    continue;
                }
                visited.add(rem);
                
                if(rem.equals(s2)){
                    return level;
                }
                
                for(String neighbor:getNeighbors(rem, s2)){
                    if(!visited.contains(neighbor)){
                        qu.add(neighbor);
                    }
                }
            }
            level++;
        }
        return -1;
    }
    
    public ArrayList<String> getNeighbors(String rem, String s2){
        ArrayList<String> res = new ArrayList<>();
        
        int idx = -1;
        for(int i=0;i<rem.length();i++){
            if(rem.charAt(i) != s2.charAt(i)){
                idx = i;
                break;
            }
        }
        
        for(int j=idx+1;j<rem.length();j++){
            if(rem.charAt(j) == s2.charAt(idx) ){
                String s = swap(rem, idx, j);
                res.add(s);
            }
        }
        return res;
    }
    
    public String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        
        char chi = str.charAt(i);
        char chj = str.charAt(j);
        sb.setCharAt(i, chj);
        sb.setCharAt(j, chi);
        
        return sb.toString();
    }
}