class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;
        for(int val:weights){
            if(val>max){
                max = val;
            }
            sum+=val;
        }
        
        int left = max;
        int right = sum;
        int ans = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(function(weights,days,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    
    public boolean function(int[] weights,int days,int mid){
        int d = 1;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            if( sum + weights[i] <= mid ){
                sum += weights[i];
            }else{
                sum = weights[i]; // reset
                d++;
            }
        }
        
        if(d<=days){
            return true;
        }else{
            return false;
        }
    }
}