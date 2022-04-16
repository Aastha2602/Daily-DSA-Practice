class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        
        for(int[] log:logs){
            int id = log[0];
            int time = log[1];
            
            if(!map.containsKey(id)){
                map.put(id, new HashSet<>());
            }
            map.get(id).add(time);
        }
        
        for(int id:map.keySet()){
            int uam = map.get(id).size();
            result[uam-1] ++;
        }
        
        return result;
    }
}