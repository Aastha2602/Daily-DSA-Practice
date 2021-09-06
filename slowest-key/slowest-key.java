class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] dp=new int[releaseTimes.length];
        dp[0]=releaseTimes[0];
        for(int i=1;i<dp.length;i++){
            dp[i]=releaseTimes[i]-releaseTimes[i-1];
        }
        
        int max=dp[0];
        int maxI=0;
        char maxKey=keysPressed.charAt(0);
        for(int i=1;i<dp.length;i++){
            
            if(max<dp[i]){
                max=dp[i];
                maxI=i;
                maxKey=keysPressed.charAt(i);
            }else if(max==dp[i] && keysPressed.charAt(i)>maxKey){
                maxKey=keysPressed.charAt(i);
            }
            
        }
        
        return maxKey;
    }
}