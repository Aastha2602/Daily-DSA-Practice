class Solution {
    public int maxArea(int[] arr) {
        int l = 0, h = arr.length-1, max = 0;
        while(l<h){
            int area = Math.min( arr[l], arr[h]) * (h-l);
            max = Math.max( max, area);
            
            if(arr[l] < arr[h]){
                l++;
            }else{
                h--;
            }
        }
        return max;
    }
}