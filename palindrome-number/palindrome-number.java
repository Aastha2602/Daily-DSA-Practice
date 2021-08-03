class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return reverse(x)==x;
    }
    public int reverse(int x){
        int reversed=0;
        while(x!=0){
            int rem=x%10;
            reversed=reversed*10 + rem;
            x=x/10;
        }
        return reversed;
    }
}