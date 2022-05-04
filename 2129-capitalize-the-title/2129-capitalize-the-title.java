class Solution {
    public String capitalizeTitle(String title) {
        char[] arr = title.toCharArray();
        int len = arr.length;
        
        for(int i=0;i<len;i++){
            int firstIndex = i;
            while(i<len && arr[i] != ' ' ){
                arr[i] = Character.toLowerCase(arr[i]);
                i++;
            }
            
            if(i-firstIndex > 2){
                arr[firstIndex] = Character.toUpperCase(arr[firstIndex]);
            }
        }
        return String.valueOf(arr);
    }
}