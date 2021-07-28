class Solution {
    public void moveZeroes(int[] arr) {
      int newIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[newIndex]=arr[i];
                newIndex++;
            }
        }
        
        for(int j=newIndex;j<arr.length;j++){
            arr[j]=0;
        }
      
    }
}