class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()<=1){
            return false;
        }
        int r=0,l=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='R'){
                r++;
            }else if(ch=='L'){
                l++;
            }
            else if(ch=='U'){
                u++;
            }else if(ch=='D'){
                d++;
            }
        }
        
        if(l!=r || u!=d){
            return false;
        }
        return true;
    }
}