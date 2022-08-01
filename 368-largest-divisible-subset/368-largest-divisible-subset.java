class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if( n==0 ) return res;
        
        Arrays.sort(nums);
        int[] memo = new int[n+1];
        Arrays.fill(memo, 1);
        int max = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0 && 1 + memo[j] > memo[i]){
                    memo[i] = 1 + memo[j];
                    if( max < memo[i]){
                        max = memo[i];
                    }
                }
            }
        }
        
        int prev = -1;
        for(int i=n-1;i>=0;i--){
            if(memo[i] == max && (prev%nums[i] == 0 || prev == -1)){
                res.add(nums[i]);
                max -= 1;
                prev = nums[i];
            }
        }
        
        return res;
    }
}