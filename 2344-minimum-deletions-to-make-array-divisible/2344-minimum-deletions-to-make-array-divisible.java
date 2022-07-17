class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        
        int ele = 0, count = 0;
        int gcdele = gcd(numsDivide);
        // System.out.println(gcdele);
        
        for(int i=0;i<nums.length && nums[i] <= gcdele ;i++){
            if( gcdele % nums[i] == 0 ){
                if(gcdele % nums[i] == 0 ){
                    return i;
                }
            }
        }
        
        
        return -1;
    }
    
    public int gcdHelper(int a,int b){
        if(a == 0 ) return b;
        if(b == 0 ) return a;
        
        return gcdHelper(b, a%b);
    }
    
    public int gcd(int[] arr){
        if(arr.length<1){
            return arr[0];
        }
        
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            temp = gcdHelper(temp, arr[i]);
        }
        return temp;
    }
}