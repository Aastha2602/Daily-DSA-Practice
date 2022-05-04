class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // for(int val:nums){
        //     map.put(val,map.getOrDefault(val,0)+1);
        // }
        
        int count = 0;
        for(int val:nums){
                if(map.containsKey(k-val) && map.get(k-val) >0 ){
                    count++;
                    map.put(k-val,map.get(k-val)-1);
                    //map.put(val,map.get(val)-1);
                }else{
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        return count;
    }
}


// 1 1
// 4 1
// 3 3