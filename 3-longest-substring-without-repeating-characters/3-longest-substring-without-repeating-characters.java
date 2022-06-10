class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0, end = 0;
        HashSet<Character> set = new HashSet<>();
        
        while(start < s.length()){
            char ch = s.charAt(start);
            if(!set.contains(ch) ){
                set.add(ch);
                max = Math.max(max, set.size());
                start++;
            }else{
                set.remove(s.charAt(end++));
            }
        }
        return max;
    }
}