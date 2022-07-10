class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length(), m = target.length();
        if( n!=m ){
            return false;
        }
        
        if (!(start.replaceAll("_", "")).equals(target.replaceAll("_", ""))) {
            return false;
        }  
        
        for(int i=0,j=0;i<n && j<m;i++,j++){
            while(i<n && start.charAt(i) == '_'){
                i++;
            }
            
            while(j<m && target.charAt(j) == '_'){
                j++;
            }
            
            if(i<n && j<m){
                if( start.charAt(i) != target.charAt(j) || start.charAt(i) == 'L' && i<j || target.charAt(j) == 'R' && i>j ){
                    return false;
                }
            }
        }
        return true;
    }
}