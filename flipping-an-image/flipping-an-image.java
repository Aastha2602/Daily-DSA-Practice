class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int lo=0,high=image[0].length-1;
            while(lo<=high){
                if(image[i][lo]==image[i][high]){
                    image[i][lo]=1-image[i][lo];
                    image[i][high]=image[i][lo];
                }
                lo++;
                high--;
            }
        }
        return image;
    }
}