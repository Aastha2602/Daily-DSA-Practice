class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, i = 0;
        if(n%2 == 1){
            return new int[0];
        }
        
        int[] res = new int[n/2];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int val : changed){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > map.getOrDefault(key + key, 0) ){
                return new int[0];
            }         
            
            for(int j=0;j<map.get(key);j++){
                res[i++] = key;
                map.put(key+key, map.get(key+key) - 1);
            }
        }
        return res;
    }
}