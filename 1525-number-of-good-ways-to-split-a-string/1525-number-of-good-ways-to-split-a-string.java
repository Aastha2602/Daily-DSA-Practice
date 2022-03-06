class Solution {
    public int numSplits(String s) {
        int[] pre = new int[s.length()];
        int[] suf = new int[s.length()];
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            pre[i] = set.size();
        }
        
        set.clear();
        for(int i=s.length()-1;i>=0;i--){
            set.add(s.charAt(i));
            suf[i] = set.size();
        }
        
        int ans = 0;
        for(int i=1;i<s.length();i++){
            if(suf[i] == pre[i-1]){
                ans++;
            }
        }
        return ans;
    }
}


// 1 1 2 2 3 3    ( i-1 )th index
// 3 3 3 2 2 1    ( i )th index

