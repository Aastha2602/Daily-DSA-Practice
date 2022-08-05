
// observe the pattern -> subtract all 2^powers from end & add all 2^powers from starting simultaneously
// powers ranging from [0... n]

class Solution {
    public int sumSubseqWidths(int[] nums) {
        long mod = (int)1e9+7;
        
        Arrays.sort(nums);
        long ans = 0, p = 1; // p -> pointer( .. 2^0  )
        
        for(int i=0;i<nums.length;i++){
            ans = (ans + p * nums[i] - p * nums[nums.length-1-i] ) % mod;
            p = (p*2)%mod;
        }
        return (int)ans;
    }
}