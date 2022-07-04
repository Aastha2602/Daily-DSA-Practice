class Solution {
    public int candy(int[] arr) {
        int sum = 0;
        int[] lr = new int[arr.length];
        int[] rl = new int[arr.length];
        
        Arrays.fill(lr, 1);
        Arrays.fill(rl, 1);
        
        for(int i=1;i<lr.length;i++){
            if(arr[i] > arr[i-1] ){
                lr[i] = lr[i-1] + 1;
            }
        }
        
        for(int i=rl.length-2;i>=0;i--){
            if(arr[i] > arr[i+1] ){
                rl[i] = rl[i+1] + 1;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            sum+= Math.max(lr[i],rl[i]);
        }
        
        return sum;
    }
}