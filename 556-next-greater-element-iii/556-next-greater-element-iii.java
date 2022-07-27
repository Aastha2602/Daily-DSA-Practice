
// 6 8 3 4 8 6 5 3 2  -->  6 8 3 5 8 6 4 3 2

class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (n + "").toCharArray();
        
        int i = arr.length-1;
        while(i>0){
            if(arr[i-1] >= arr[i] ){
                i--;
            }else{
                break;
            }
        }
        
        if(i==0) return -1;
        
        int idx1 = i-1, j = arr.length-1;
        while(j> idx1){
            if( arr[j] > arr[idx1]){
                break;
            }else{
                j--;
            }
        }
        
        char temp = arr[idx1];
        arr[idx1] = arr[j];
        arr[j] = temp;
        
        int left = i, right = arr.length-1;
        while(left < right){
            char tem = arr[left];
            arr[left] = arr[right];
            arr[right] = tem;
            left++;
            right--;
        }
        
        String res = new String(arr);
        long val = Long.parseLong(res);
        return val>Integer.MAX_VALUE ? -1 : (int)val;
    }
}