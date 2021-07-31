class Solution {
    public String getHint(String secret, String guess) {
        int[] arr=new int[10];
        int bulls=0,cows=0;
        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0';
            int g=guess.charAt(i)-'0';
            if(s==g){
                bulls++;
            }else{
                if(arr[s]<0){
                    cows++;
                }
                if(arr[g]>0){
                    cows++;
                }
                arr[s]++;
                arr[g]--;
            }
        }
        return bulls+"A"+cows+"B";
    }
}