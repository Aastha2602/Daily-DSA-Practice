class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length,ans=0,sum=0;
        for(int i=0;i<k-1;i++){
            sum+=arr[i];
        }
        
        for(int i=k-1;i<n;i++){
            sum+=arr[i];
            if(sum/k>=threshold){
                ans++;
            }
            sum-=arr[i-k+1];
        }
        return ans;
    }
}