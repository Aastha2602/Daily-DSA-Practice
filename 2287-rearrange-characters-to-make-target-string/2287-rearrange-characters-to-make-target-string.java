class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        
        for(char ch:s.toCharArray()){
            f1[ch-'a']++;
        }
        
        for(char ch:target.toCharArray()){
            f2[ch-'a']++;
        }
        
        int min = Integer.MAX_VALUE;
        for(char ch:target.toCharArray()){
            min = Math.min(min, f1[ch-'a']/f2[ch-'a']);
        }
        return min;
    }
}