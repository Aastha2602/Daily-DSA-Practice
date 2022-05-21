class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        
        leftMax[0] = arr[0];
        rightMin[n-1] = arr[n-1];
        
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
// 5 5 5 5 5      
// 2 2 3 4 4
        
        for(int i=n-2;i>=0;i--){
            rightMin[i] = Math.min(rightMin[i+1],arr[i]);
        }
// 1 1 1 1 1
// 1 1 3 4 4
        
        for(int i=0;i<n-1;i++){
            if(leftMax[i] <= rightMin[i+1] ){
                count++;
            }
        }
        
        return count+1;
    }
}