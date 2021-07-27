// revise this question positively


class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        
        int Sindex=0;
        int Tindex=0;
        while(Tindex<t.length()){ // important .. here I can't write.. (Tindex!=t.length()-1) 
            if(t.charAt(Tindex)==s.charAt(Sindex)){
                Sindex++;
                if(Sindex==s.length()){
                    return true;
                }
            }
            Tindex++;
        }
        return false;
        
    }
}