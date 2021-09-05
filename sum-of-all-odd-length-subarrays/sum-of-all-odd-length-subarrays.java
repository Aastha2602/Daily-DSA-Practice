class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0,n=arr.length;
        
        for(int i=0;i<n;i++){
            int end=i+1,start=n-i;
            
            int totalSubArrays=end*start;
            
            int oddSubArrays=totalSubArrays/2;
            if(totalSubArrays%2==1){
                oddSubArrays++;
            }
            
            result+=oddSubArrays*arr[i];
        }
        return result;
    }
}