class Solution {
    public int countHousePlacements(int n) {
        
        if(n == 1){
            return 4;
        }else if(n==2){
            return 9;
        }
        
        // int[] ans = new int[n];
        // ans[0] = 4;
        // ans[1] = 9;
        // for(int i=2;i<n;i++){
        //     ans[i] = ans[i-1] + ans[i-2];
        // }
        // return ans[n-1]*2 - 1;
        
        int mod = (int) 1e9+7;
        int first = 1, second = 2;
        for(int i=2;i<=n;i++){
            int current = (first + second)%mod;
            first = second;
            second = current;
        }
        return (int)( 1L * second * second % mod );
    }
}