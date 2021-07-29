class Solution {
    public int[][] updateMatrix(int[][] arr) {
        if(arr.length==0 || arr[0].length==0){
            return arr;
        }
        
        int range=arr.length*arr[0].length;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    int up=(i>0) ? arr[i-1][j] : range;
                    int left=(j>0) ? arr[i][j-1] : range;
                    arr[i][j]=Math.min(up,left)+1;
                }
            }
        }
        
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){
                if(arr[i][j]!=0){
                    int down=(i<arr.length-1) ? arr[i+1][j] : range;
                    int right=(j<arr[0].length-1) ? arr[i][j+1] : range;
                    arr[i][j]=Math.min(Math.min(down,right)+1,arr[i][j]);
                }
            }
        }
        
        return arr;
        
    }
}