class Solution {

public boolean canArrange(int[] arr, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int val : arr){
        int rem = val % k;
        if(rem < 0)
            rem = rem + k;
        
        map.put(rem,map.getOrDefault(rem,0)+1);
    }
    
    for(int val : arr){
        int rem = val % k;
        
        if(rem == 0){
            int frequency = map.get(rem);
            
            if(frequency % 2 == 1)
                return false;
        }else if(2 * rem == k){
            int frequency = map.get(rem);
            
            if(frequency % 2 == 1)
                return false;
        }else{
            int frequency = map.getOrDefault(rem,0);
            int other_frequency = map.getOrDefault(k - rem,0);
            
            if(frequency != other_frequency)
                return false;
        }
    }
    
    return true;
}
}