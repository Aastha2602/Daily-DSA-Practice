class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length, count = 0;
        int[] leftmax = new int[n];
        int[] rightmin = new int[n];
        
        leftmax[0] = arr[0];
        rightmin[n-1] = arr[n-1];
        
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        
        for(int i=n-2;i>=0;i--){
            rightmin[i] = Math.min(rightmin[i+1],arr[i]);
        }
        
        // int count = 0;
        for(int i=0;i<n-1;i++){
            if(leftmax[i] <= rightmin[i+1] ){
                count++;
            }
        }
        return count+1;
    }
}
