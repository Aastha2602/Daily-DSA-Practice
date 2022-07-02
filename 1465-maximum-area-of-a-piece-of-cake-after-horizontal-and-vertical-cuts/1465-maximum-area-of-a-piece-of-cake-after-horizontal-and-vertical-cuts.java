class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int mod = (int) 1e9+7;
        int maxWidth = (int) helper(verticalCuts, w);
        int maxHeight = (int) helper(horizontalCuts, h);
        return (int) ( (long) maxWidth*maxHeight % mod);
    }
    
    public int helper(int[] arr, int length){
        Arrays.sort(arr);
        int maxDiff = arr[0];
        
        for(int i=1;i<arr.length;i++){
            maxDiff = Math.max(maxDiff, arr[i] - arr[i-1] );
        }
        
        //lets consider last cut also
        maxDiff = Math.max(maxDiff, length - arr[arr.length-1]);
        return maxDiff;
    }
}