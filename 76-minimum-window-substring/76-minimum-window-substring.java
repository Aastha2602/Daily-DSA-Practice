class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length()==0 || t.length()==0){
            return "";
        }
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
            }
        }
        
        int required=map.size();
        int left=0,right=0;
        
        HashMap<Character,Integer> window=new HashMap<>();
        
        int formed=0;
        
        int[] ans= {-1,0,0}; // window length,left and right
        
        while(right<s.length()){
            char ch=s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            
            if(map.containsKey(ch) && window.get(ch).intValue()==map.get(ch).intValue() ){
                formed++;
            }
            
            while(left<=right && formed==required ){
                ch=s.charAt(left);
                
                if(ans[0]==-1 || right-left+1<ans[0]){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }
                
                //remove from window and increament left
                window.put(ch,window.get(ch)-1);
                if(map.containsKey(ch) && window.get(ch).intValue()<map.get(ch).intValue() ){
                    formed--;
                }
                
                left++;
            }
            right++;
        }
        
        return ans[0] == -1 ? "" : s.substring(ans[1],ans[2]+1);
        
    }
}