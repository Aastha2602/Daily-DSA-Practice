class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        for(int i=0,a=0,b=0; i < n && ( tops[0] == tops[i] || tops[0] == bottoms[i]) ; i++){
            if( tops[0] != tops[i] ){
                a++;
            }
            if( tops[0] != bottoms[i] ){
                b++;
            }
            
            if( i == n-1 ){
                return Math.min( a, b );   
            }
        }
        
        for(int i=0,a=0,b=0; i<n && ( bottoms[0] == bottoms[i] || bottoms[0] == tops[i] ) ;i++){
            
            if( bottoms[0] != bottoms[i] ){
                a++;
            }
            if( bottoms[0] != tops[i] ){
                b++;
            }
            
            if( i == n-1 ){
                return Math.min(a,b);
            }
        }
        
        return -1;
    }
}