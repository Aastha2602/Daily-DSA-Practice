class Solution {
    public int maximumSum(int[] nums) {
        int result = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int item:nums){
            int key = sod(item);
            
            if(!map.containsKey(key)){
                map.put(key,item);
            }else{
                result = Math.max(result, map.get(key) + item);
                map.put(key, Math.max(map.get(key),item));
            }
        }
        return result;
    }
    public int sod(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
}

// result = -1  ->  18+36   
// 9 18  ->  9 36
// 7 43  ->  7 43
// 4 13
    
