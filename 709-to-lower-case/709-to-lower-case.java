class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if( arr[i]>= 'A' && arr[i] <= 'Z' ){
                arr[i] = (char) (arr[i]-'A'+'a');
            }
        }
        return new String(arr);
    }
}