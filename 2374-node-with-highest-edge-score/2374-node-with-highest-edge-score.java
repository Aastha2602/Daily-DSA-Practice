class Solution {
    public int edgeScore(int[] edges) {
        TreeMap<Integer, Long> tree = new TreeMap<>();
        for(int i=0;i<edges.length;i++){
            if(!tree.containsKey(edges[i])){
                tree.put(edges[i], (long)i);
            }else{
                tree.put(edges[i], (long)tree.get(edges[i]) + i );
            }
        }
        
        long max = 0, key = 0;
        for (Map.Entry< Integer, Long> map :
            tree.entrySet()){
            if(map.getValue() > max ){
                key = map.getKey();
                max = map.getValue();
            }
        }
        
        return (int)key;
    }
}