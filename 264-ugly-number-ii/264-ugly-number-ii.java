class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        
        int p2=1,p3=1,p5=1;
        
        for(int i=2;i<=n;i++){
            int f2=2*dp[p2];
            int f3=3*dp[p3];
            int f5=5*dp[p5];
            
            int min=Math.min(f2,Math.min(f3,f5));
            dp[i]=min;
            
            if(min==f2) p2++;
            if(min==f3) p3++;
            if(min==f5) p5++;
            
        }
        return dp[n];
    }
}