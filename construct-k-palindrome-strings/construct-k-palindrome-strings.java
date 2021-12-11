class Solution {
    public boolean canConstruct(String s, int k) {
        int oddCount=0;
        int n=s.length();
        int[] arr=new int[26];
        
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        
        for(int i:arr){
            if(i%2==1){
                oddCount++;
            }
        }
        
        return k>=oddCount && k<=n;
        
    }
}