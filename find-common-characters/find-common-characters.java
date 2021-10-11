class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result=new ArrayList<>();
        int[] min=new int[26];
        for(int i=0;i<26;i++){
            min[i]=Integer.MAX_VALUE;
        }
        
        for(String s: words){
            int[] current=new int[26];
            char[] arr=s.toCharArray();
            for(char ch: arr){
                current[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                min[i]=Math.min(min[i],current[i]);
            }
        }
        
        for(int i=0;i<26;i++){
            for(int j=0;j<min[i];j++){
                result.add(String.valueOf((char)(i+'a')));
            }
        }
        return result;
    }
}