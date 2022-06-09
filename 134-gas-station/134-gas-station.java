class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0, costsum = 0;
        for(int val:gas){
            gassum += val;
        }
        
        for(int val:cost){
            costsum += val;
        }
        
        if(gassum < costsum){
            return -1;
        }
        
        // int[] requireddiff = new int[gas.length];
        
        int total = 0, result = 0;
        for(int i=0;i<gas.length;i++){
            
            total += (gas[i] - cost[i]) ;
            
            if(total < 0){
                total = 0;
                result = i+1;
            }
            
        }
        return result;
    }
}