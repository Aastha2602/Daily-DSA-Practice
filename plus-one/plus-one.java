class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
            i--;
        }
        int[] ans=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}