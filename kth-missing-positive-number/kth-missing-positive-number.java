class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int num:arr){
            if(k>=num){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}