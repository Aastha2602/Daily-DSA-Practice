class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a' ]++;
        }
        
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<26;i++){
            while(freq[i] > 0 && set.contains(freq[i])){
                freq[i]--;
                count++;
            }
            set.add(freq[i]);
        }
        
        return count;
    }
}