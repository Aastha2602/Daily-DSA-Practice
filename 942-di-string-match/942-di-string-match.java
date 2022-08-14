class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
        int lo = 0, hi = n;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'I'){
                arr[i] = lo++;
            }else{
                arr[i] = hi--;
            }
        }
        
        arr[n] = lo;
        return arr;
    }
}