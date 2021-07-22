class Solution {
    public int maxPower(String s) {
        int[] arr=new int[s.length()];
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            char ch=s.charAt(i);
            char prev=s.charAt(i-1);
            if(ch==prev){
                arr[i]=arr[i-1]+1;
            }else{
                arr[i]=1;
            }
        }
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        return max;
    }
}